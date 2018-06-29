import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable, of} from 'rxjs';
import {catchError, tap} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class HelloService {

  private helloUrl = 'restapi/hello';

  constructor(private http: HttpClient) { }

  getHelloMessage (): Observable<Object> {
    return this.http.get<Object>(this.helloUrl)
      .pipe(
        tap( helloMessage => console.log(`fetched hello message`)),
        catchError(this.handleError<Object>(`getHelloMessage`))
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
