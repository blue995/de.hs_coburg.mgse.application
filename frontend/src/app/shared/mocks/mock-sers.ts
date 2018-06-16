import { Ser } from '../models/ser';

export const SERS: Ser[] = [
  {
    id: 1,
    shortName: 'SPO B IF 3',
    title: 'Studien- und Prüfungsordnung für den Bachelorstudiengang Informatik\n' +
    'an der Hochschule für angewandte Wissenschaften Coburg (SPO B IF)',
    validity: '25. Juni 2014',
    courseOfStudy: {
      name: 'Informatik',
      ects: 210,
      semesters: 7,
      requirements: 'Abitur',
      faculty: { name: 'Elektrotechnik & Informatik', shortName: 'E/INF'},
      degree: { glossaryEntry: {word: 'Bachelor of Science', abbreviation: 'B. Sc.'} }
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
    studySections: [],
    footnotes: []
  }
];
