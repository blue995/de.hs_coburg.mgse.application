import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Glossary } from '../shared/models/glossary';
import { environment } from '../../environments/environment';

const API_URL = environment.apiUrl;

@Injectable({
  providedIn: 'root'
})
export class GlossaryService {

  private glossaryUrl = 'glossary';

  constructor(private http: HttpClient) { }

  getGlossary (): Observable<Glossary> {
    return this.http.get<Glossary>(`${API_URL}/${this.glossaryUrl}`)
      .pipe(
        catchError(this.handleError<Glossary>(`getGlossary`))
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
