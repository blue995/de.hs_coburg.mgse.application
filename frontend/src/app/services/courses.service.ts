import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, of } from 'rxjs';
import { CourseCatalogueMeta } from '../shared/models/course-catalogue-meta';
import { catchError, tap } from 'rxjs/operators';
import { CourseCatalogue } from '../shared/models/course-catalogue';

/* currently not needed because we are only using a GET request */
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class CoursesService {

  // TODO: store in config/ routes file
  private coursesUrl = 'api/courses';

  constructor(private http: HttpClient) { }

  getCoursesMeta (): Observable<CourseCatalogueMeta[]> {
    return this.http.get<CourseCatalogueMeta[]>(this.coursesUrl)
      .pipe(
        tap(courseCataloguesMeta => console.log(`fetched course meta objects`)),
        catchError(this.handleError('getCoursesMeta', []))
      );
  }

  getCourseCatalogue (id: number): Observable<CourseCatalogue> {
    const url = `${this.coursesUrl}Complete/${id}`; // TODO: remove "Complete from id template string
    return this.http.get<CourseCatalogue>(url).pipe(
      tap(courseCatalogue => console.log(`fetched course catalogue id=${id}`)),
      catchError(this.handleError<CourseCatalogue>(`getCourseCatalogue id=${id}`))
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
