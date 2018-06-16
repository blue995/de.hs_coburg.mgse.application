import { GlossaryEntry } from './glossary-entry';
import { CourseType } from './course-type';
import { ExamType } from './exam-type';

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
