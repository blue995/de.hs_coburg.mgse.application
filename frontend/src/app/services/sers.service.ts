import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, map, tap } from 'rxjs/operators';
import { Ser } from '../shared/models/ser';

/* currently not needed because we are only using a GET request */
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class SersService {

  private spoUrl = 'api/spos';

  constructor(private http: HttpClient) { }

  getSpos (): Observable<Ser[]> {
    return this.http.get<Ser[]>(this.spoUrl)
      .pipe(
        tap(spos => console.log(`fetched spos`)),
        catchError(this.handleError('getSpos', []))
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
