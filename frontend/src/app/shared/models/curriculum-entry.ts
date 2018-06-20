import {CourseType, ExamType} from './module';
import {Professor} from './professor';

export class CurriculumEntry {
  semester: number;
  rota: String;
  moduleCompleteName: String;
  moduleShortName: String;
  moduleCourseTypes: CourseType[];
  moduleExamTypes: ExamType[];
  aidList: String[];
  responsiblePerson: Professor[];        // can be more than one in the case of "Seminar" and similar courses
  lecturers: Professor[];                // joined string of professor abbreviations
}
