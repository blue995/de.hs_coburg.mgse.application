export class Glossary {
  id:       number;
  sections: GlossarySection[];
}

export class GlossarySection {
  id: number;
  completeName: String;
  entries: GlossaryEntry[];
}

export class GlossaryEntry {
  id: number;
  word: String;
  abbreviation: String;
  description?: String;
}
