import { GlossaryEntry } from './glossary-entry';

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

class CourseType {
  name: String;
  abbreviation: String;
}

class ExamType {
  name: String;
  abbreviation: String;
  examTestUnit: String;
  lowerBound: number;
  upperBound: number;
}
