import { Module } from './module';

export class StudySection {
  id: number;
  completeName: String;
  firstSemester: number;
  lastSemester: number;
  sumOfEcts: number;
  sumOfSemesterHours: number;
  modules: Module[];
}
