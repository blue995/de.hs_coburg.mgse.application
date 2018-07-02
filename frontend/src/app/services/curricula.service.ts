import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CurriculumMeta } from '../shared/models/curriculum-meta';
import { catchError } from 'rxjs/operators';
import { Curriculum } from '../shared/models/curriculum';
import { environment } from '../../environments/environment';
import { HsisServiceError } from '../shared/errorhandling/HsisServiceError';

const API_URL = environment.apiUrl;

@Injectable({
  providedIn: 'root'
})
export class CurriculaService {

  private curriculaUrl = 'curricula';
  private error = new HsisServiceError();

  constructor(private http: HttpClient) { }

  getCurriculaMeta (): Observable<CurriculumMeta[]> {
    return this.http.get<CurriculumMeta[]>(`${API_URL}/${this.curriculaUrl}`)
      .pipe(
        catchError(this.error.handleError( 'getCurriculaMeta', []))
      );
  }

  getCurriculum (id: number): Observable<Curriculum> {
    const url = `${API_URL}/${this.curriculaUrl}/${id}`;
    return this.http.get<Curriculum>(url)
      .pipe(
        catchError(this.error.handleError<Curriculum>(`getCurriculum id=${id}`))
      );
  }
}
