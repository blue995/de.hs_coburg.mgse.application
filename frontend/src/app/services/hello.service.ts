import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError, tap } from 'rxjs/operators';
import { environment } from '../../environments/environment';

const API_URL = environment.apiUrl;

@Injectable({
  providedIn: 'root'
})
export class HelloService {

  private helloUrl = 'hello/john';

  constructor(private http: HttpClient) {

    console.log(`current hello url: ${API_URL}/${this.helloUrl}`);
  }

  getHelloMessage (): Observable<Object> {
    return this.http.get(`${API_URL}/${this.helloUrl}`, {responseType: 'text'})
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
