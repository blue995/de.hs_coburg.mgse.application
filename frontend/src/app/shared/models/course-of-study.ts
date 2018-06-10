import { Faculty } from './faculty';
import { Degree } from './degree';

export class CourseOfStudy {
  name: String;
  ects: number;
  semesters: number;
  requirements: String;
  faculty: Faculty;
  degree: Degree;
}
