import {ModuleTypes} from './module-types';

export class StudySection {
  id?: number;
  completeName: String;
  firstSemester: number;
  lastSemester: number;
  sumOfEcts: number;
  sumOfSemesterHours: number;
  moduleTypes: ModuleTypes[];
}
