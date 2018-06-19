import { CurriculumMeta } from '../models/curriculum-meta';

export const CURRICULA_META: CurriculumMeta[] = [
  {
    completeName: 'Informatik',
    degrees: [
      {
        completeName: 'Bachelor',
        curricula: [
          { curriculumId: 1, shortName: 'IFB SS 18 v1', validityDate: '14.01.2017' }]
      },
      {
        completeName: 'Master',
        curricula: [
          { curriculumId: 2, shortName: 'IFM SS18 v2', validityDate: '14.05.2016' }
        ]
      }
    ]
  },
  {
    completeName: 'Soziale Arbeit',
    degrees: [
      {
        completeName: 'Bachelor',
        curricula: [
          { curriculumId: 3, shortName: 'SOZB SS18 v4', validityDate: '14.01.2019' }
        ]
      },
      {
        completeName: 'Master',
        curricula: [
          { curriculumId: 4, shortName: 'SOZM SS18 v3', validityDate: '14.05.2016' }
        ]
      }
    ]
  },
  {
    completeName: 'Betriebswirtschaft',
    degrees: [
      {
        completeName: 'Bachelor',
        curricula: [
          { curriculumId: 5, shortName: 'BWB SS18 v1', validityDate: '14.01.2017' },
          { curriculumId: 6, shortName: 'BWB SS18 v2', validityDate: '14.01.2018' }
        ]
      },
      {
        completeName: 'Master',
        curricula: [
          { curriculumId: 7, shortName: 'BWM SS18 v1', validityDate: '14.05.2016' }
        ]
      }
    ]
  }
];
