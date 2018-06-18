export class Paragraph {
  number: number;
  subtitle?: String;
  subsections: Subsection[];
}

class Subsection {
  number?: number;
  text: String;
}
