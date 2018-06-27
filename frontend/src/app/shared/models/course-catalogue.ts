import { Footnote } from './footnote';
import { Glossary } from './glossary';

export class CourseCatalogue {
  id: number;
  courseOfStudy: String;
  courseOfStudyAbbreviation: String;
  validityDate: String;
  facultyName: String;
  courses: Course[];
}
export class Course {
  id: number;
  courseOfStudy: String;
  moduleSpecification: String;
  abbreviation: String;
  semesterHours: number;
  ects: number;
  workload: String;
  semester: number;
  rota: String;
  duration: String;
  responsiblePerson: String;
  lecturer: String;               // if there is more than one, the string should be joined with commas
  language: String;
  admissionRequirements: String;  // e.g. Vorrückensberechtigung nach §5 Abs. 1 SPO
  prerequesites: String;          // e.g. math 3 for the bachelor thesis
  qualificationGoals: String;
  content: String;
  examType: String;
  mediaTypes: String;
  literature: String;
}
