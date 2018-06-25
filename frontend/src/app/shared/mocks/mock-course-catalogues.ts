import {CourseCatalogue} from '../models/course-catalogue';

export const COURSE_CATALOGUES: CourseCatalogue[] = [
  {
    id: 1,
    courseOfStudy: 'Bachelorstudiengang Informatik',
    courseOfStudyAbbreviation: 'IF',
    validityDate: '01.01.2014',
    facultyName: 'Fakultaet Elektrotechnik und Informatik',
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
    courses: [
      {
        id: 1,
        courseOfStudy: 'Bschelor Informatik',
        moduleSpecification: 'Analysis',
        abbreviation: 'Ana',
        semesterHours: 6,
        ects: 7,
        workload: '90 h Präsenz (Seminaristischer Unterricht mit integrierten Übungen)\n' +
        '120 h Eigenarbeit (40 h Nachbereitung des Lehrstoffs,\n' +
        '30 h Bearbeitung von Übungsaufgaben, \n50 h Prüfungsvorbereitung)',
        semester: 1,
        rota: 'Jaehrlich',
        duration: 'einsemestrig',
        responsiblePerson: 'Prof. Dr. Geissler',
        lecturer: 'Prof. Dr. Geissler',       // if there is more than one, the string should be joined with commas
        language: 'Deutsch',
        admissionRequirements: '-',           // e.g. Vorrückensberechtigung nach §5 Abs. 1 SPO
        prerequesites: '-',                   // e.g. math 3 for the bachelor thesis
        qualificationGoals: 'Studierende sollen wesentliche Grundlagen der Analysis ' +
        'bis hin zur Differentialrechnung kennen und anwenden können.',
        content: 'Logik, Mengenlehre, Vollständige Induktion, Kombinatorik, rationale ' +
        'und reelle Zahlen, komplexe Zahlen, Folgen und Grenzwerte, Funktionen und Stetigkeit, ' +
        'Ableitungen, Satz von Rolle, Extrema, Zwischenwertsatz, Taylorreihen, l’Hospitalsche Regel,',
        examType: 'Schriftliche Prüfung (120 Minuten)',
        mediaTypes: 'Tafel, Skript',
        literature: 'I.N. Bronstein, G. Semendjajew, H. Musiol, H. Mühlig, „Taschenbuch' +
        'der Mathematik“ I und II, Harri Deutsch, Frankfurt a. M., 1993\n' +
        'T. Arens et al., „Mathematik“, Spektrum, Heidelberg, 2008\n' +
        'K. Burg, H. Haf, F. Wille, „Höhere Mathematik für Ingenieure“' +
        '1 – 5, B. G. Teubner, Stuttgart, 1985\n' +
        'D.W. Jordan, P. Smith, „Mathematische Methoden für die' +
        'Praxis”, Spektrum, Heidelberg, Berlin, 1996\n' +
        'K. Königsberger, „Analysis I“, Springer, Berlin, 1990\n' +
        'O. Forster, „Analysis 1“, Vieweg, Wiesbaden, 2004\n' +
        'Fichtenholz, „Differential- und Integralrechnung“, Harri' +
        'Deutsch, Frankfurt a. M.\n' +
        'G.E. Joos, E. Richter, „Höhere Mathematik“, Harri Deutsch,\n' +
        'Frankfurt a. M., 1993\n' +
        'R. Courant, F. John, „Introduction to Calculus und Analysis I“,\n' +
        'Springer, New York, 1989'
      },
      {
        id: 2,
        courseOfStudy: 'Bschelor Informatik',
        moduleSpecification: 'Analysis',
        abbreviation: 'Ana',
        semesterHours: 6,
        ects: 7,
        workload: '90 h Präsenz (Seminaristischer Unterricht mit integrierten Übungen)\n' +
        '120 h Eigenarbeit (40 h Nachbereitung des Lehrstoffs,\n' +
        '30 h Bearbeitung von Übungsaufgaben, \n50 h Prüfungsvorbereitung)',
        semester: 1,
        rota: 'Jaehrlich',
        duration: 'einsemestrig',
        responsiblePerson: 'Prof. Dr. Geissler',
        lecturer: 'Prof. Dr. Geissler',       // if there is more than one, the string should be joined with commas
        language: 'Deutsch',
        admissionRequirements: '-',           // e.g. Vorrückensberechtigung nach §5 Abs. 1 SPO
        prerequesites: '-',                   // e.g. math 3 for the bachelor thesis
        qualificationGoals: 'Studierende sollen wesentliche Grundlagen der Analysis ' +
        'bis hin zur Differentialrechnung kennen und anwenden können.',
        content: 'Logik, Mengenlehre, Vollständige Induktion, Kombinatorik, rationale ' +
        'und reelle Zahlen, komplexe Zahlen, Folgen und Grenzwerte, Funktionen und Stetigkeit, ' +
        'Ableitungen, Satz von Rolle, Extrema, Zwischenwertsatz, Taylorreihen, l’Hospitalsche Regel,',
        examType: 'Schriftliche Prüfung (120 Minuten)',
        mediaTypes: 'Tafel, Skript',
        literature: 'I.N. Bronstein, G. Semendjajew, H. Musiol, H. Mühlig, „Taschenbuch' +
        'der Mathematik“ I und II, Harri Deutsch, Frankfurt a. M., 1993\n' +
        'T. Arens et al., „Mathematik“, Spektrum, Heidelberg, 2008\n' +
        'K. Burg, H. Haf, F. Wille, „Höhere Mathematik für Ingenieure“' +
        '1 – 5, B. G. Teubner, Stuttgart, 1985\n' +
        'D.W. Jordan, P. Smith, „Mathematische Methoden für die' +
        'Praxis”, Spektrum, Heidelberg, Berlin, 1996\n' +
        'K. Königsberger, „Analysis I“, Springer, Berlin, 1990\n' +
        'O. Forster, „Analysis 1“, Vieweg, Wiesbaden, 2004\n' +
        'Fichtenholz, „Differential- und Integralrechnung“, Harri' +
        'Deutsch, Frankfurt a. M.\n' +
        'G.E. Joos, E. Richter, „Höhere Mathematik“, Harri Deutsch,\n' +
        'Frankfurt a. M., 1993\n' +
        'R. Courant, F. John, „Introduction to Calculus und Analysis I“,\n' +
        'Springer, New York, 1989'
      },
      {
        id: 3,
        courseOfStudy: 'Bschelor Informatik',
        moduleSpecification: 'Analysis',
        abbreviation: 'Ana',
        semesterHours: 6,
        ects: 7,
        workload: '90 h Präsenz (Seminaristischer Unterricht mit integrierten Übungen)\n' +
        '120 h Eigenarbeit (40 h Nachbereitung des Lehrstoffs,\n' +
        '30 h Bearbeitung von Übungsaufgaben, \n50 h Prüfungsvorbereitung)',
        semester: 1,
        rota: 'Jaehrlich',
        duration: 'einsemestrig',
        responsiblePerson: 'Prof. Dr. Geissler',
        lecturer: 'Prof. Dr. Geissler',       // if there is more than one, the string should be joined with commas
        language: 'Deutsch',
        admissionRequirements: '-',           // e.g. Vorrückensberechtigung nach §5 Abs. 1 SPO
        prerequesites: '-',                   // e.g. math 3 for the bachelor thesis
        qualificationGoals: 'Studierende sollen wesentliche Grundlagen der Analysis ' +
        'bis hin zur Differentialrechnung kennen und anwenden können.',
        content: 'Logik, Mengenlehre, Vollständige Induktion, Kombinatorik, rationale ' +
        'und reelle Zahlen, komplexe Zahlen, Folgen und Grenzwerte, Funktionen und Stetigkeit, ' +
        'Ableitungen, Satz von Rolle, Extrema, Zwischenwertsatz, Taylorreihen, l’Hospitalsche Regel,',
        examType: 'Schriftliche Prüfung (120 Minuten)',
        mediaTypes: 'Tafel, Skript',
        literature: 'I.N. Bronstein, G. Semendjajew, H. Musiol, H. Mühlig, „Taschenbuch' +
        'der Mathematik“ I und II, Harri Deutsch, Frankfurt a. M., 1993\n' +
        'T. Arens et al., „Mathematik“, Spektrum, Heidelberg, 2008\n' +
        'K. Burg, H. Haf, F. Wille, „Höhere Mathematik für Ingenieure“' +
        '1 – 5, B. G. Teubner, Stuttgart, 1985\n' +
        'D.W. Jordan, P. Smith, „Mathematische Methoden für die' +
        'Praxis”, Spektrum, Heidelberg, Berlin, 1996\n' +
        'K. Königsberger, „Analysis I“, Springer, Berlin, 1990\n' +
        'O. Forster, „Analysis 1“, Vieweg, Wiesbaden, 2004\n' +
        'Fichtenholz, „Differential- und Integralrechnung“, Harri' +
        'Deutsch, Frankfurt a. M.\n' +
        'G.E. Joos, E. Richter, „Höhere Mathematik“, Harri Deutsch,\n' +
        'Frankfurt a. M., 1993\n' +
        'R. Courant, F. John, „Introduction to Calculus und Analysis I“,\n' +
        'Springer, New York, 1989'
      }
    ]
  }
];
