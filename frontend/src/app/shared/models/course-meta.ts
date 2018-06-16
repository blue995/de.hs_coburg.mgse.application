export class CourseMeta {
  completeName: String;                 // e.g.: "Informatik"
  degrees: DegreeMeta[];                // list of degrees (can be empty, but must be included)
}

class DegreeMeta {
  completeName: String;                 // e.g.: "Bachelor"
  courseCatalogues: CourseCatalogue[];  // list of course catalogues (can be empty, but must be included
}

class CourseCatalogue {
  catalogueId: number;                  // e.g.: "1" or whatever you defined as catalogue id (used to call it for detail view)
  shortName: String;                    // e.g.: "Modulhandbuch"
  validityDate: String;                 // e.g.: "14.01.2017"
}
