import {CurriculumEntry} from './curriculum-entry';

export class Curriculum {
  id: number;
  version: number;
  year: number;
  completeName: String;
  curriculumEntries: CurriculumEntry[];
}
