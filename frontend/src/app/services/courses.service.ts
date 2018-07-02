import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { CourseCatalogueMeta } from '../shared/models/course-catalogue-meta';
import { catchError } from 'rxjs/operators';
import { CourseCatalogue } from '../shared/models/course-catalogue';
import { environment } from '../../environments/environment';

const API_URL = environment.apiUrl;

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  private coursesUrl = 'courses';

  constructor(private http: HttpClient) { }

  getCoursesMeta (): Observable<CourseCatalogueMeta[]> {
    return this.http.get<CourseCatalogueMeta[]>(`${API_URL}/${this.coursesUrl}`)
      .pipe(
        catchError(this.handleError('getCoursesMeta', []))
      );
  }

  getCourseCatalogue (id: number): Observable<CourseCatalogue> {
    const url = `${API_URL}/$${this.coursesUrl}/${id}`; //
    return this.http.get<CourseCatalogue>(url)
      .pipe(
        catchError(this.handleError<CourseCatalogue>(`getCourseCatalogue id=${id}`))
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
