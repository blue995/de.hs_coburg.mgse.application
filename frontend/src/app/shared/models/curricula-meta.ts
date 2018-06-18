export class CurriculaMeta {
  completeName: String;                 // e.g.: "Informatik"
  degrees: DegreeMeta[];                // list of degrees (can be empty, but must be included)
}

class DegreeMeta {
  completeName: String;                 // e.g.: "Bachelor"
  courseCatalogues: CurriculumInfo[];       // list of curricula (can be empty, but must be included
}

class CurriculumInfo {
  curriculumId: number;                  // e.g.: "1" or whatever you defined as curriculum id (used to call it for detail view)
  shortName: String;                    // e.g.: "IFB SS 18 v4" <- "IFB" (Informatik Bachelor) SS 18 "v4" (version 3)
  validityDate: String;                 // e.g.: "14.01.2017"
}
