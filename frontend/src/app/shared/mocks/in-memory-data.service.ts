import { InMemoryDbService } from 'angular-in-memory-web-api';

import { SERS } from './mock-sers';
import { SERS_META } from './mock-sers-meta';
import { COURSES_META } from './mock-courses-meta';
import { COURSE_CATALOGUES } from './mock-course-catalogues';
import { CURRICULA_META } from './mock-curricula-meta';
import { GLOSSARY } from './mock-glossary';

export class InMemoryDataService implements InMemoryDbService {
  createDb() {
    const sersComplete = SERS;
    const sers = SERS_META;

    const coursesComplete = COURSE_CATALOGUES;
    const courses = COURSES_META;

    const curricula = CURRICULA_META;

    const glossary = GLOSSARY;

    return {sers, sersComplete, courses, coursesComplete, curricula, glossary};
  }
}
