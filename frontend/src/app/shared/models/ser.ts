import { Paragraph } from './paragraph';
import { CourseOfStudy } from './course-of-study';
import { StudySection } from './study-section';
import { Footnote } from './footnote';

export class Ser {
  id: number;
  shortName: String;
  title: String;
  validity: String;
  courseOfStudy: CourseOfStudy;
  preface: String;
  paragraphs: Paragraph[];
  studySections: StudySection[];
  footnotes: Footnote[];
}
