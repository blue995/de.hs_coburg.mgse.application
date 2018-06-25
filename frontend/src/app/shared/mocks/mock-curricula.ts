import { Curriculum } from '../models/curriculum';
import {Glossary} from '../models/glossary';

export const CURRICULA: Curriculum[] = [
  {
    id: 1,
    version: 2,
    validityDate: '01.10.2014',
    semester: 'SUMMER_SEMESTER',
    year: 2018,
    completeName: 'Studienplan für die theoretischen und praktischen Studiensemester des ' +
    'Studienganges Informatik neu (Bachelor) an der Hochschule Coburg',
    footnotes: [
      { number: 1, text: 'alle m.E. = alle, außer PC, Laptop, programmierbarer Taschenrechner und Telekommunikationsmittel' },
      { number: 2, text: 'Es kann freiwillig studienbegleitend eine prSTA abgelegt werden. Wurde die schrP bestanden,' +
        ' werden die für die studienbegleitende prSTA erreichten' +
        ' Punkte auf die in der schrP erreichten Punkte im Umfang von 10% der in der schrP erreichbaren Punkte addiert.' },
      { number: 3, text: 'schrP und prStA haben für die Bildung der Endnote das Gewicht 1 zu 1. Zum Bestehen muss bei beiden' +
        ' Leistungsnachweisen mindestens die Note „ausreichend“ erzielt werden' }
    ],
    glossary: {
      id: 1,
      sections: [
        {
          id: 1,
          completeName: 'Abkürzungen',
          entries: [
            {
              id: 1,
              word: 'Bachelorarbeit',
              abbreviation: 'BA'
            }
          ]
        }
      ]
    },
    curriculumStudySections: [
      {
        completeName: 'Erster Studienabschnitt (1. u. 2. theoretisches Studiensemester)',
        subsectionTypes: [
          {
            subsectionTypeName: 'Pflichtfächer',
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
                responsiblePersons: [
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
                responsiblePersons: [
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
                responsiblePersons: [
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
            subsectionTypeName: 'Wahlpflichtfächer',
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
                responsiblePersons: [
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
                responsiblePersons: [
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
                responsiblePersons: [
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
            subsectionTypeName: 'Schluesselqualifikation',
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
                responsiblePersons: [
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
                responsiblePersons: [
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
                responsiblePersons: [
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
    ]
  }
];
