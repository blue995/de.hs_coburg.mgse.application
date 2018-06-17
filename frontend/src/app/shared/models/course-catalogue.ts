import {Course} from './course';

export class CourseCatalogue {
  id: number;
  courseOfStudy: String;
  courseOfStudyAbbreviation: String;
  validityDate: String;
  facultyName: String;
  courses: Course[];
}
