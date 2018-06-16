import { GlossaryEntry } from './glossary-entry';
import { ExamType } from './exam-type';
import { CourseType } from './course-type';

export class Module {
  completeName: String;
  ects: number;
  quantifier: number;
  semesterHours: number;
  courseTypes: CourseType[];
  examTypes: ExamType[];
  details?: GlossaryEntry;
  count?: number;
}
