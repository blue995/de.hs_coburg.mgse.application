import {Curriculum} from '../models/curriculum';

export const CURRICULA: Curriculum[] = [
  {
    id: 1,
    version: 2,
    validityDate: '01.10.2014',
    semester: 'SUMMER_SEMESTER',
    year: 2018,
    completeName: 'Studienplan für die theoretischen und praktischen Studiensemester des ' +
    'Studienganges Informatik neu (Bachelor) an der Hochschule Coburg',
    curriculumStudySections: [
      {
        completeName: 'Erster Studienabschnitt (1. u. 2. theoretisches Studiensemester)',
        curriculumEntries: [
          {
            semester: 1,
            rota: 'jährlich',
            moduleCompleteName: 'Analysis',
            moduleAbbreviation: 'Ana',
            ects: 7,
            semesterHours: 6,
            moduleCourseTypes: [
              { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
              { name: 'Übung', abbreviation: 'Ü' }
            ],
            moduleExamTypes: [
              {
                name: 'Schriftliche Prüfung',
                abbreviation: 'schrP',
                examTestUnit: 'Min',
                lowerBound: 90,
                upperBound: 120
              }
            ],
            aidList: [
              'alle m. E.'
            ],
            responsiblePerson: [
              {
                firstName: 'Michael',
                lastName: 'Geisler',
                email: 'michael.geisler@hs-coburg.de',
                room: '2-215a',
                abbreviation: 'Gs'
              }
            ],
            testers: [
              // nothing here
            ]
          },
          {
            semester: 2,
            rota: 'jährlich',
            moduleCompleteName: 'Diskrete Mathematik',
            moduleAbbreviation: 'DMth',
            ects: 5,
            semesterHours: 4,
            moduleCourseTypes: [
              { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
              { name: 'Übung', abbreviation: 'Ü' }
            ],
            moduleExamTypes: [
              {
                name: 'Schriftliche Prüfung',
                abbreviation: 'schrP',
                examTestUnit: 'Min',
                lowerBound: 60,
                upperBound: 90
              }
            ],
            aidList: [
              'alle m. E.'
            ],
            responsiblePerson: [
              {
                firstName: 'Michael',
                lastName: 'Geisler',
                email: 'michael.geisler@hs-coburg.de',
                room: '2-215a',
                abbreviation: 'Gs'
              }
            ],
            testers: [
              {
                firstName: 'Vorname',
                lastName: 'Kühnlenz',
                email: 'email@adresse.de',
                room: '123',
                abbreviation: 'Kü'
              }
            ]
          },
          {
            semester: 2,
            rota: 'jährlich',
            moduleCompleteName: 'Diskrete Mathematik',
            moduleAbbreviation: 'DMth',
            ects: 5,
            semesterHours: 4,
            moduleCourseTypes: [
              { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
              { name: 'Übung', abbreviation: 'Ü' }
            ],
            moduleExamTypes: [
              {
                name: 'Schriftliche Prüfung',
                abbreviation: 'schrP',
                examTestUnit: 'Min',
                lowerBound: 60,
                upperBound: 90
              }
            ],
            aidList: [
              'alle m. E.'
            ],
            responsiblePerson: [
              {
                firstName: 'Michael',
                lastName: 'Geisler',
                email: 'michael.geisler@hs-coburg.de',
                room: '2-215a',
                abbreviation: 'Gs'
              }
            ],
            testers: [
              {
                firstName: 'Vorname',
                lastName: 'Kühnlenz',
                email: 'email@adresse.de',
                room: '123',
                abbreviation: 'Kü'
              }
            ]
          }
        ]
      },

      {
        completeName: 'Erster Studienabschnitt (1. u. 2. theoretisches Studiensemester)',
        curriculumEntries: [
          {
            semester: 1,
            rota: 'jährlich',
            moduleCompleteName: 'Analysis',
            moduleAbbreviation: 'Ana',
            ects: 7,
            semesterHours: 6,
            moduleCourseTypes: [
              { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
              { name: 'Übung', abbreviation: 'Ü' }
            ],
            moduleExamTypes: [
              {
                name: 'Schriftliche Prüfung',
                abbreviation: 'schrP',
                examTestUnit: 'Min',
                lowerBound: 90,
                upperBound: 120
              }
            ],
            aidList: [
              'alle m. E.'
            ],
            responsiblePerson: [
              {
                firstName: 'Michael',
                lastName: 'Geisler',
                email: 'michael.geisler@hs-coburg.de',
                room: '2-215a',
                abbreviation: 'Gs'
              }
            ],
            testers: [
              // nothing here
            ]
          },
          {
            semester: 2,
            rota: 'jährlich',
            moduleCompleteName: 'Diskrete Mathematik',
            moduleAbbreviation: 'DMth',
            ects: 5,
            semesterHours: 4,
            moduleCourseTypes: [
              { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
              { name: 'Übung', abbreviation: 'Ü' }
            ],
            moduleExamTypes: [
              {
                name: 'Schriftliche Prüfung',
                abbreviation: 'schrP',
                examTestUnit: 'Min',
                lowerBound: 60,
                upperBound: 90
              }
            ],
            aidList: [
              'alle m. E.'
            ],
            responsiblePerson: [
              {
                firstName: 'Michael',
                lastName: 'Geisler',
                email: 'michael.geisler@hs-coburg.de',
                room: '2-215a',
                abbreviation: 'Gs'
              }
            ],
            testers: [
              {
                firstName: 'Vorname',
                lastName: 'Kühnlenz',
                email: 'email@adresse.de',
                room: '123',
                abbreviation: 'Kü'
              }
            ]
          },
          {
            semester: 2,
            rota: 'jährlich',
            moduleCompleteName: 'Diskrete Mathematik',
            moduleAbbreviation: 'DMth',
            ects: 5,
            semesterHours: 4,
            moduleCourseTypes: [
              { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
              { name: 'Übung', abbreviation: 'Ü' }
            ],
            moduleExamTypes: [
              {
                name: 'Schriftliche Prüfung',
                abbreviation: 'schrP',
                examTestUnit: 'Min',
                lowerBound: 60,
                upperBound: 90
              }
            ],
            aidList: [
              'alle m. E.'
            ],
            responsiblePerson: [
              {
                firstName: 'Michael',
                lastName: 'Geisler',
                email: 'michael.geisler@hs-coburg.de',
                room: '2-215a',
                abbreviation: 'Gs'
              }
            ],
            testers: [
              {
                firstName: 'Vorname',
                lastName: 'Kühnlenz',
                email: 'email@adresse.de',
                room: '123',
                abbreviation: 'Kü'
              }
            ]
          }
        ]
      },

      {
        completeName: 'Erster Studienabschnitt (1. u. 2. theoretisches Studiensemester)',
        curriculumEntries: [
          {
            semester: 1,
            rota: 'jährlich',
            moduleCompleteName: 'Analysis',
            moduleAbbreviation: 'Ana',
            ects: 7,
            semesterHours: 6,
            moduleCourseTypes: [
              { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
              { name: 'Übung', abbreviation: 'Ü' }
            ],
            moduleExamTypes: [
              {
                name: 'Schriftliche Prüfung',
                abbreviation: 'schrP',
                examTestUnit: 'Min',
                lowerBound: 90,
                upperBound: 120
              }
            ],
            aidList: [
              'alle m. E.'
            ],
            responsiblePerson: [
              {
                firstName: 'Michael',
                lastName: 'Geisler',
                email: 'michael.geisler@hs-coburg.de',
                room: '2-215a',
                abbreviation: 'Gs'
              }
            ],
            testers: [
              // nothing here
            ]
          },
          {
            semester: 2,
            rota: 'jährlich',
            moduleCompleteName: 'Diskrete Mathematik',
            moduleAbbreviation: 'DMth',
            ects: 5,
            semesterHours: 4,
            moduleCourseTypes: [
              { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
              { name: 'Übung', abbreviation: 'Ü' }
            ],
            moduleExamTypes: [
              {
                name: 'Schriftliche Prüfung',
                abbreviation: 'schrP',
                examTestUnit: 'Min',
                lowerBound: 60,
                upperBound: 90
              }
            ],
            aidList: [
              'alle m. E.'
            ],
            responsiblePerson: [
              {
                firstName: 'Michael',
                lastName: 'Geisler',
                email: 'michael.geisler@hs-coburg.de',
                room: '2-215a',
                abbreviation: 'Gs'
              }
            ],
            testers: [
              {
                firstName: 'Vorname',
                lastName: 'Kühnlenz',
                email: 'email@adresse.de',
                room: '123',
                abbreviation: 'Kü'
              }
            ]
          },
          {
            semester: 2,
            rota: 'jährlich',
            moduleCompleteName: 'Diskrete Mathematik',
            moduleAbbreviation: 'DMth',
            ects: 5,
            semesterHours: 4,
            moduleCourseTypes: [
              { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
              { name: 'Übung', abbreviation: 'Ü' }
            ],
            moduleExamTypes: [
              {
                name: 'Schriftliche Prüfung',
                abbreviation: 'schrP',
                examTestUnit: 'Min',
                lowerBound: 60,
                upperBound: 90
              }
            ],
            aidList: [
              'alle m. E.'
            ],
            responsiblePerson: [
              {
                firstName: 'Michael',
                lastName: 'Geisler',
                email: 'michael.geisler@hs-coburg.de',
                room: '2-215a',
                abbreviation: 'Gs'
              }
            ],
            testers: [
              {
                firstName: 'Vorname',
                lastName: 'Kühnlenz',
                email: 'email@adresse.de',
                room: '123',
                abbreviation: 'Kü'
              }
            ]
          }
        ]
      }
    ]
  }
];
