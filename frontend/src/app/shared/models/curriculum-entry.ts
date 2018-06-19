import {CourseType, ExamType} from './module';

export class CurriculumEntry {
  semester: number;
  rota: String;
  moduleCompleteName: String;
  moduleShortName: String;
  moduleCourseTypes: CourseType[];
  moduleExamTypes: ExamType[];
  aidList: String[];
  responsiblePerson: String;        // joined string of professor abbreviations
  lecturers: String;                // joined string of professor abbreviations
}
