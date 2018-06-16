import { CourseMeta } from '../models/course-meta';

export const COURSES_META: CourseMeta[] = [
  {
    completeName: 'Informatik',
    degrees: [
      {
        completeName: 'Bachelor',
        courseCatalogues: [
          { catalogueId: 1, shortName: 'Modulhandbuch', validityDate: '14.01.2017' },
          { catalogueId: 2, shortName: 'Modulhandbuch', validityDate: '14.01.2018' },
          { catalogueId: 3, shortName: 'Modulhandbuch', validityDate: '14.01.2019' }
        ]
      },
      {
        completeName: 'Master',
        courseCatalogues: [
          { catalogueId: 4, shortName: 'Modulhandbuch', validityDate: '14.05.2016' },
          { catalogueId: 5, shortName: 'Modulhandbuch', validityDate: '14.05.2017' }
        ]
      }
    ]
  },
  {
    completeName: 'Soziale Arbeit',
    degrees: [
      {
        completeName: 'Bachelor',
        courseCatalogues: [
          { catalogueId: 6, shortName: 'Modulhandbuch', validityDate: '14.01.2017' },
          { catalogueId: 7, shortName: 'Modulhandbuch', validityDate: '14.01.2018' }
        ]
      },
      {
        completeName: 'Master',
        courseCatalogues: [
          { catalogueId: 8, shortName: 'Modulhandbuch', validityDate: '14.05.2016' }
        ]
      }
    ]
  },
  {
    completeName: 'Betriebswirtschaft',
    degrees: [
      {
        completeName: 'Bachelor',
        courseCatalogues: [
          { catalogueId: 9, shortName: 'Modulhandbuch', validityDate: '14.01.2017' }
        ]
      },
      {
        completeName: 'Master',
        courseCatalogues: [
          { catalogueId: 10, shortName: 'Modulhandbuch', validityDate: '14.05.2016' }
        ]
      }
    ]
  }
];

