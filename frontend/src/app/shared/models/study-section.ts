import {ModuleType} from './module-type';

export class StudySection {
  completeName: String;
  firstSemester: number;
  lastSemester: number;
  sumOfEcts: number;
  sumOfSemesterHours: number;
  sumOfQuantifiers: number;
  moduleTypes: ModuleType[];
}
