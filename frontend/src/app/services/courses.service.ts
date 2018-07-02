import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CourseCatalogueMeta } from '../shared/models/course-catalogue-meta';
import { catchError } from 'rxjs/operators';
import { CourseCatalogue } from '../shared/models/course-catalogue';
import { environment } from '../../environments/environment';
import {HsisServiceError} from '../shared/errorhandling/HsisServiceError';

const API_URL = environment.apiUrl;

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  private coursesUrl = 'courses';
  private error = new HsisServiceError();

  constructor(private http: HttpClient) { }

  getCoursesMeta (): Observable<CourseCatalogueMeta[]> {
    return this.http.get<CourseCatalogueMeta[]>(`${API_URL}/${this.coursesUrl}`)
      .pipe(
        catchError(this.error.handleError('getCoursesMeta', []))
      );
  }

  getCourseCatalogue (id: number): Observable<CourseCatalogue> {
    const url = `${API_URL}/$${this.coursesUrl}/${id}`; //
    return this.http.get<CourseCatalogue>(url)
      .pipe(
        catchError(this.error.handleError<CourseCatalogue>(`getCourseCatalogue id=${id}`))
      );
  }
}
