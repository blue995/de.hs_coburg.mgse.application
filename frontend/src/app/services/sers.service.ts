import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { SerMeta } from '../shared/models/ser-meta';
import { Ser } from '../shared/models/ser';
import { environment } from '../../environments/environment';
import { HsisServiceError } from '../shared/errorhandling/HsisServiceError';

const API_URL = environment.apiUrl;

@Injectable({
  providedIn: 'root'
})
export class SersService {

  private sersUrl = 'ser';
  private error = new HsisServiceError();

  constructor(private http: HttpClient) { }

  getSersMeta (): Observable<SerMeta[]> {
    return this.http.get<SerMeta[]>(`${API_URL}/${this.sersUrl}`)
      .pipe(
        catchError(this.error.handleError('getSersMeta', []))
      );
  }

  getSer (id: number):  Observable<Ser> {
    const url = `${API_URL}/${this.sersUrl}/${id}`;
    return this.http.get<Ser>(url).pipe(
      catchError(this.error.handleError<Ser>(`getSer id=${id}`))
    );
  }
}
