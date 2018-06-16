import { InMemoryDbService } from 'angular-in-memory-web-api';

import { SERS } from './mock-sers';
import { SERS_META } from './mock-sers-meta';
import { COURSES_META } from './mock-courses-meta';
import {COURSE_CATALOGUES} from './mock-course-catalogues';

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const sersComplete = SERS;
    const sers = SERS_META;

    const coursesComplete = COURSE_CATALOGUES;
    const courses = COURSES_META;

    return {sers, sersComplete, courses, coursesComplete};
  }
}
