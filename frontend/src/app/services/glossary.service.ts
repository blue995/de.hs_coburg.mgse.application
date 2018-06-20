import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Observable, of} from "rxjs/index";
import {catchError, tap} from "rxjs/operators";
import { Glossary } from "../shared/models/glossary";

@Injectable({
  providedIn: 'root'
})
export class GlossaryService {

  // TODO: store in config/ routes file
  private coursesUrl = 'api/glossary';

  constructor(private http: HttpClient) { }

  getGlossary (): Observable<Glossary> {
    const url = `${this.coursesUrl}`;
    return this.http.get<Glossary>(url).pipe(
      tap(Glossary => console.log(`fetched glossary`)),
      catchError(this.handleError<Glossary>(`getGlossary`))
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
