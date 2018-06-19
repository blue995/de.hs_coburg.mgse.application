import {Module} from './module';

export class StudySection {
  completeName: String;
  firstSemester: number;
  lastSemester: number;
  sumOfEcts: number;
  sumOfSemesterHours: number;
  sumOfQuantifiers: number;
  moduleTypes: ModuleType[];
}

export class ModuleType {
  typeName: String;
  modules: Module[];
}
