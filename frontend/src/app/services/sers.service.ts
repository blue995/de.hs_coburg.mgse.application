import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { SerMeta } from '../shared/models/ser-meta';
import { Ser } from '../shared/models/ser';
import { environment } from '../../environments/environment';

const API_URL = environment.apiUrl;

@Injectable({
  providedIn: 'root'
})
export class SersService {

  private sersUrl = 'ser';

  constructor(private http: HttpClient) { }

  getSersMeta (): Observable<SerMeta[]> {
    return this.http.get<SerMeta[]>(`${API_URL}/${this.sersUrl}`)
      .pipe(
        catchError(this.handleError('getSersMeta', []))
      );
  }

  getSer (id: number):  Observable<Ser> {
    const url = `${API_URL}/${this.sersUrl}/${id}`;
    return this.http.get<Ser>(url).pipe(
      catchError(this.handleError<Ser>(`getSer id=${id}`))
    );
  }

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption
      console.error(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
}
