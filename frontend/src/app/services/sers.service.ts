import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import {SerMeta} from '../shared/models/ser-meta';
import {Ser} from '../shared/models/ser';

/* currently not needed because we are only using a GET request */
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class SersService {

  private sersUrl = 'api/sers';

  constructor(private http: HttpClient) { }

  getSersMeta (): Observable<SerMeta[]> {
    return this.http.get<SerMeta[]>(this.sersUrl)
      .pipe(
        tap(sersMeta => console.log(`fetched ser meta objects`)),
        catchError(this.handleError('getSersMeta', []))
      );
  }

  getSer (id: number):  Observable<Ser> {
    const url = `${this.sersUrl}Complete/${id}`; // TODO: remove "Complete from id template string
    return this.http.get<Ser>(url).pipe(
      tap(ser => console.log(`fetched ser id=${id}`)),
      catchError(this.handleError<Ser>(`getSer id=${id}`))
    );
  }

  private handleError<T> (operation = 'operation', result?: T) {
    return (error: any): Observable<T> => {

      // TODO: send the error to remote logging infrastructure
      console.error(error); // log to console instead

      // TODO: better job of transforming error for user consumption (Snackbar)
      console.error(`${operation} failed: ${error.message}`);

      // Let the app keep running by returning an empty result.
      return of(result as T);
    };
  }
}
