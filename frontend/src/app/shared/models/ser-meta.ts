
export class SerMeta {
  completeName: String;   // e.g.: "Informatik"
  degrees: DegreeMeta[];  // list of degrees (can be empty, but must be included)
}

class DegreeMeta {
  completeName: String;   // e.g.: "Bachelor"
  sers: SerInfo[];        // list of study examination regulations (can be empty, but must be included
}

class SerInfo {
  serId: number;          // e.g.: "1" or whatever you defined as ser id (used to call it for detail view)
  shortName: String;      // e.g.: "SPO B IF 3" <- "SPO" + "B" (Bachelor) + "IF" (Informatik) + "3" (version 3)
  validityDate: String;   // e.g.: "14.01.2017"
}
