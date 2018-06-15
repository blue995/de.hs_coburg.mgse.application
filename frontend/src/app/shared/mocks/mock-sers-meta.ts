import { SerMeta } from '../models/ser-meta';

export const SERS_META: SerMeta[] = [
  {
    completeName: 'Informatik',
    degrees: [
      {
        completeName: 'Bachelor',
        sers: [
          { serId: 1, shortName: 'SPO B IF 1', validityDate: '14.01.2017' },
          { serId: 2, shortName: 'SPO B IF 2', validityDate: '14.01.2018' },
          { serId: 3, shortName: 'SPO B IF 3', validityDate: '14.01.2019' }
        ]
      },
      {
        completeName: 'Master',
        sers: [
          { serId: 4, shortName: 'SPO M IF 1', validityDate: '14.05.2016' },
          { serId: 5, shortName: 'SPO M IF 2', validityDate: '14.05.2017' }
        ]
      }
    ]
  },
  {
    completeName: 'Soziale Arbeit',
    degrees: [
      {
        completeName: 'Bachelor',
        sers: [
          { serId: 6, shortName: 'SPO B SOZ 1', validityDate: '14.01.2017' },
          { serId: 7, shortName: 'SPO B SOZ 2', validityDate: '14.01.2018' },
          { serId: 8, shortName: 'SPO B SOZ 3', validityDate: '14.01.2019' }
        ]
      },
      {
        completeName: 'Master',
        sers: [
          { serId: 9, shortName: 'SPO M SOZ 1', validityDate: '14.05.2016' },
          { serId: 10, shortName: 'SPO M SOZ 2', validityDate: '14.05.2017' }
        ]
      }
    ]
  },
  {
    completeName: 'Betriebswirtschaft',
    degrees: [
      {
        completeName: 'Bachelor',
        sers: [
          { serId: 11, shortName: 'SPO B BW 1', validityDate: '14.01.2017' },
          { serId: 12, shortName: 'SPO B BW 2', validityDate: '14.01.2018' },
          { serId: 13, shortName: 'SPO B BW 3', validityDate: '14.01.2019' }
        ]
      },
      {
        completeName: 'Master',
        sers: [
          { serId: 14, shortName: 'SPO M BW 1', validityDate: '14.05.2016' },
          { serId: 15, shortName: 'SPO M BW 2', validityDate: '14.05.2017' }
        ]
      }
    ]
  }
];

