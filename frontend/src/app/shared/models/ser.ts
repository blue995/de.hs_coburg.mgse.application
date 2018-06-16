import {Paragraph} from './paragraph';
import {CourseOfStudy} from './course-of-study';

export class Ser {
  id: number;
  shortName: String;
  title: String;
  validity: String; // could change this to a class like in the metamodel
  courseOfStudy: CourseOfStudy;
  preface: String;
  paragraphs: Paragraph[];
}
