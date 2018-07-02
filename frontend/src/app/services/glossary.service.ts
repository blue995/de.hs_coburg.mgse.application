import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Glossary } from '../shared/models/glossary';
import { environment } from '../../environments/environment';
import { HsisServiceError } from '../shared/errorhandling/HsisServiceError';

const API_URL = environment.apiUrl;

@Injectable({
  providedIn: 'root'
})
export class GlossaryService {

  private glossaryUrl = 'glossary';
  private error = new HsisServiceError();

  constructor(private http: HttpClient) { }

  getGlossary (): Observable<Glossary> {
    return this.http.get<Glossary>(`${API_URL}/${this.glossaryUrl}`)
      .pipe(
        catchError(this.error.handleError<Glossary>(`getGlossary`))
    );
  }
}
