import { Ser } from '../models/ser';

export const SERS: Ser[] = [
  {
    id: 1,
    shortName: 'SPO B IF 3',
    title: 'Studien- und Prüfungsordnung für den Bachelorstudiengang Informatik\n' +
    'an der Hochschule für angewandte Wissenschaften Coburg (SPO B IF)',
    validityDate: '25. Juni 2014',
    courseOfStudy: {
      name: 'Informatik',
      ects: 210,
      semesters: 7,
      requirements: 'Abitur',
      facultyName: 'Elektrotechnik & Informatik',
      facultyShortName: 'E/INF',
      degreeName: 'Bachelor of Science',
      degreeAbbreviation: 'B. Sc.',
    },
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
    preface: 'Auf Grund von Art.13 Abs.1, 43, 44, 58 Abs.1, 61 Abs.2 und 8 und 66 des Bayerischen Hochschulgesetzes\n' +
    '–BayHSchG– (BayRS 2210–1–1–WFK) erlässt die Hochschule für angewandte\n' +
    'Wissenschaften Coburg folgende Satzung:',
    paragraphs: [
      {
        number: 1,
        subtitle: 'Zweck der Studien– und Prüfungsordnung',
        subsections: [
          {
            text: '1Diese Studien– und Prüfungsordnung regelt\n' +
            'den Bachelorstudiengang Informatik an der\n' +
            'Hochschule für angewandte Wissenschaften\n' +
            'Coburg.\n' +
            '2Sie dient der Ausfüllung und Ergänzung\n' +
            'der Rahmenprüfungsordnung für die\n' +
            'Fachhochschulen (RaPO) vom 17. Oktober\n' +
            '2001 (BayRS 2210–4–1–4–1 WFK) und der\n' +
            'Allgemeinen Prüfungsordnung der Hochschule\n' +
            'für angewandte Wissenschaften Coburg\n' +
            '(APO) vom 14. November 2013 (Amtsblatt\n' +
            '2013) in der jeweiligen Fassung.'
          }
        ]
      },
      {
        number: 2,
        subtitle: 'Studienziel',
        subsections: [
          {
            text: '1Ziel des Bachelorstudiums ist die Vermittlung\n' +
            'der Befähigung zur selbständigen Anwendung\n' +
            'wissenschaftlicher Erkenntnisse\n' +
            'und Methoden in der Informatik. 2Der Breite\n' +
            'und Vielfalt der Informatik wird durch eine\n' +
            'umfassende Grundlagenausbildung sowie\n' +
            'der Spezialisierungsmöglichkeit in eine der\n' +
            'angebotenen Vertiefungsrichtungen Rechnung\n' +
            'getragen. 3Das Studium soll dazu befähigen,\n' +
            'sich rasch in eines der zahlreichen\n' +
            'Anwendungsgebiete einzuarbeiten, sich neue\n' +
            'Gebiete zu erschließen und sich selbständig\n' +
            'weiterzubilden.\n' +
            '4Der Bachelorabschluss befähigt\n' +
            'insbesondere zur Übernahme anwendungsorientierter\n' +
            'Fach– und Führungsaufgaben\n' +
            'im Bereich der Informatik. 5Der erfolgreiche\n' +
            'Abschluss soll es ermöglichen, das Studium\n' +
            'in einem Masterstudiengang national\n' +
            'oder international fortzusetzen.'
          }
        ]
      },
      {
        number: 3,
        subtitle: 'Regelstudienzeit, Aufbau des Studiums,\n' +
        'Vertiefungsrichtungen',
        subsections: [
          {
            number: 1,
            text: 'Die Regelstudienzeit beträgt sieben Studiensemester.'
          },
          {
            number: 2,
            text: 'Der Aufbau des Studiums ergibt sich aus\n' +
            'der Anlage zu dieser Studien- und Prüfungsordnung.\n'
          },
          {
            number: 3,
            text: 'Eine Vertiefungsrichtung ist eine Gruppe\n' +
            'von fachlich zusammengehörenden Modulen,\n' +
            'in denen ein bestimmtes Fachgebiet vertieft\n' +
            'wird. 2Module einer Vertiefungsrichtung werden\n' +
            'als fachwissenschaftliche Wahlpflichtmodule\n' +
            'nach Maßgabe des Studien- und Prüfungsplans\n' +
            'ab dem dritten Studiensemester\n' +
            'geführt.\n' +
            '3Als Vertiefungsrichtungen werden\n' +
            'angeboten:\n' +
            '1. Software-Techniken (S)\n' +
            '2. Embedded Systems (E)\n' +
            '3. Wirtschaftsinformatik (W)\n' +
            '4Ein Anspruch darauf, dass einzelne Vertiefungsrichtungen\n' +
            'durchgeführt werden, besteht\n' +
            'nicht. 5Die Prüfungskommission erkennt\n' +
            'auf Antrag des Studierenden die Ableistung\n' +
            'einer Vertiefungsrichtung nach Satz 3 an,\n' +
            'wenn mindestens 40 Leistungspunkte\n' +
            '(ECTS) aus einer einzelnen Vertiefungsrichtung\n' +
            'nachgewiesen werden.\n' +
            '6Dieser Antrag\n' +
            'ist zusammen mit der (ersten) Anmeldung zur\n' +
            'Bachelorarbeit zu stellen; Anträge nach diesem\n' +
            'Zeitpunkt sind ausgeschlossen (Ausschlussfrist).\n' +
            '7Wird kein Antrag oder ein Antrag\n' +
            'nach diesem Zeitpunkt gestellt oder ist\n' +
            'ein Antrag abzulehnen, wird im Bachelorprüfungszeugnis\n' +
            'keine Vertiefungsrichtung ausgewiesen.\n' +
            '8Die Entscheidung der Prüfungskommission\n' +
            'erfolgt mit Anerkennungsvermerk\n' +
            'zeitgleich mit der Anmeldung der Bachelorarbeit,\n' +
            'der Studierenden und Prüfungsamt unverzüglich\n' +
            'zuzuleiten ist.'
          },
          {
            number: 4,
            text: '1Die Fakultät informiert Studierende spätestens\n' +
            'zu Beginn des dritten Studiensemesters\n' +
            'über angebotene Vertiefungsrichtungen\n' +
            'und zugehörige Module. 2Die Festlegung\n' +
            'erfolgt im Studien- und Prüfungsplan'
          }
        ]
      }
    ],
    studySections: [
      {
        completeName: 'Erster Studienabschnitt - theoretische Studiensemester',
        firstSemester: 1,
        lastSemester: 2,
        sumOfEcts: 60,
        sumOfSemesterHours: 52,
        sumOfQuantifiers: 48,
        moduleTypes: [
          {
            typeName: 'Fachwissenschaftliche Pflichtmodule',
            modules: [
              {
                completeName: 'Analysis',
                ects: 7,
                quantifier: 5,
                semesterHours: 6,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Diskrete Mathematik',
                ects: 5,
                quantifier: 4,
                semesterHours: 4,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Grundlagen der Informatik',
                ects: 7,
                quantifier: 5,
                semesterHours: 6,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Rechnerarchitekturen',
                ects: 7,
                quantifier: 5,
                semesterHours: 6,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Webtechnologien',
                ects: 7,
                quantifier: 5,
                semesterHours: 6,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' },
                  { name: 'Praktikum', abbreviation: 'Pr' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Programmieren 1',
                ects: 5,
                quantifier: 4,
                semesterHours: 4,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' },
                  { name: 'Praktikum', abbreviation: 'Pr' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Programmieren 2',
                ects: 7,
                quantifier: 5,
                semesterHours: 6,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' },
                  { name: 'Praktikum', abbreviation: 'Pr' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Computernetze',
                ects: 5,
                quantifier: 4,
                semesterHours: 4,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' },
                  { name: 'Praktikum', abbreviation: 'Pr' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              }
            ]
          },
          {
            typeName: 'Schlüsselqualifikation',
            modules: [
              {
                completeName: 'Betriebswirtschaftslehre 1 und 2',
                ects: 2,
                quantifier: 1,
                semesterHours: 2,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Lehrvortrag', abbreviation: 'V' },
                  { name: 'Übung', abbreviation: 'Ü' }
                ],
                examTypes: [
                  {
                    name: 'studienbegleitende schriftliche Prüfung',
                    abbreviation: 'sschrP',
                    examTestUnit: 'Min',
                    lowerBound: 45,
                    upperBound: 60
                  }
                ],
                count: 2
              },
              {
                completeName: 'Englisch (GER B2) 1 und 2',
                ects: 2,
                quantifier: 1,
                semesterHours: 2,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Seminar', abbreviation: 'S' },
                  { name: 'Übung', abbreviation: 'Ü' }
                ],
                examTypes: [
                  {
                    name: 'studienbegleitende schriftliche Prüfung',
                    abbreviation: 'sschrP',
                    examTestUnit: 'Min',
                    lowerBound: 45,
                    upperBound: 60
                  },
                  {
                    name: 'Präsentation',
                    abbreviation: 'Prs',
                    examTestUnit: 'Min',
                    lowerBound: 15,
                    upperBound: 45
                  }
                ],
                count: 2
              },
              {
                completeName: ' Wahlpflichtmodul weitere Schlüsselqualifikation',
                ects: 2,
                quantifier: 1,
                semesterHours: 2,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' },
                  { name: 'Seminar', abbreviation: 'S' },
                  { name: 'Praktikum', abbreviation: 'Pr' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              }
            ]
          }
        ]
      },
      {
        completeName: 'Zweiter Studienabschnitt – theoretische Studiensemester',
        firstSemester: 3,
        lastSemester: 4,
        sumOfEcts: 60,
        sumOfSemesterHours: 48,
        sumOfQuantifiers: 48,
        moduleTypes: [
          {
            typeName: 'Fachwissenschaftliche Pflichtmodule',
            modules: [
              {
                completeName: 'Stochastik',
                ects: 7,
                quantifier: 5,
                semesterHours: 6,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Diskrete Mathematik',
                ects: 5,
                quantifier: 4,
                semesterHours: 4,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Grundlagen der Informatik',
                ects: 7,
                quantifier: 5,
                semesterHours: 6,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Rechnerarchitekturen',
                ects: 7,
                quantifier: 5,
                semesterHours: 6,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Webtechnologien',
                ects: 7,
                quantifier: 5,
                semesterHours: 6,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' },
                  { name: 'Praktikum', abbreviation: 'Pr' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Programmieren 1',
                ects: 5,
                quantifier: 4,
                semesterHours: 4,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' },
                  { name: 'Praktikum', abbreviation: 'Pr' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Programmieren 2',
                ects: 7,
                quantifier: 5,
                semesterHours: 6,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' },
                  { name: 'Praktikum', abbreviation: 'Pr' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              },
              {
                completeName: 'Computernetze',
                ects: 5,
                quantifier: 4,
                semesterHours: 4,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' },
                  { name: 'Praktikum', abbreviation: 'Pr' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  }
                ]
              }
            ]
          },
          {
            typeName: 'Fachwissentschaftliche Wahlpflichtmodule',
            modules: [
              {
                completeName: 'Fachwissenschaftliche Wahlpflichtmodule',
                ects: 5,
                quantifier: 5,
                semesterHours: 4,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Praktikum', abbreviation: 'Pr' },
                  { name: 'Übung', abbreviation: 'Ü' }
                ],
                examTypes: [
                  {
                    name: 'schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
                  },
                  {
                    name: 'mündliche Prüfung',
                    abbreviation: 'mdlP',
                    examTestUnit: 'Min',
                    lowerBound: 15,
                    upperBound: 45
                  }
                ],
                count: 3
              }
            ]
          },
          {
            typeName: 'Schlüsselqualifikation',
            modules: [
              {
                completeName: ' Wahlpflichtmodul weitere Schlüsselqualifikation',
                ects: 2,
                quantifier: 1,
                semesterHours: 2,
                courseTypes: [
                  { name: 'Seminaristischer Unterricht', abbreviation: 'SU' },
                  { name: 'Übung', abbreviation: 'Ü' },
                  { name: 'Seminar', abbreviation: 'S' },
                  { name: 'Praktikum', abbreviation: 'Pr' }
                ],
                examTypes: [
                  {
                    name: 'Schriftliche Prüfung',
                    abbreviation: 'schrP',
                    examTestUnit: 'Min',
                    lowerBound: 90,
                    upperBound: 120
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
