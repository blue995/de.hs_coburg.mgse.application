import {Course} from './course';

export class CourseCatalogue {
  id: number;
  courseOfStudy: String;
  validity: String;
  facultyName: String;
  courses: Course[];
}
