import {GlossaryEntry} from './glossary';

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

export class CourseType {
  name: String;
  abbreviation: String;
}

export class ExamType {
  name: String;
  abbreviation: String;
  examTestUnit: String;
  lowerBound: number;
  upperBound: number;
}
