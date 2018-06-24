import {Professor} from './professor';
import {CourseType, ExamType} from './module';


export class Curriculum {
  id: number;
  version: number;
  validityDate: String;
  semester: String;
  year: number;
  completeName: String;
  curriculumStudySections: CurriculumStudySection[];
}

export class CurriculumStudySection {
  completeName: String;
  subsectionTypes: StudySubsectionType[];
}

export class StudySubsectionType {
  subsectionTypeName: String;
  curriculumEntries: CurriculumEntry[];
}

export class CurriculumEntry {
  semester: number;
  rota: String;
  moduleCompleteName: String;
  moduleAbbreviation: String;
  ects: number;
  semesterHours: number;
  moduleCourseTypes: CourseType[];
  moduleExamTypes: ExamType[];
  aidList: String[];
  responsiblePersons: Professor[];       // can be more than one in the case of "Seminar" and similar courses
  testers: Professor[];
}
