import { Paragraph } from './paragraph';
import { CourseOfStudy } from './course-of-study';
import { StudySection } from './study-section';
import { Footnote } from './footnote';
import { Glossary } from './glossary';

export class Ser {
  id: number;
  shortName: String;
  title: String;
  validityDate: String;
  courseOfStudy: CourseOfStudy;
  preface: String;
  footnotes: Footnote[];
  glossary: Glossary;
  paragraphs: Paragraph[];
  studySections: StudySection[];
}
