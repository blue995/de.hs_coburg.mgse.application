import {Course} from '../models/course';

// TODO: mock course catalogues
export const COURSE_CATALOGUES: Course[] = [
  {
    id: 1,
    courseOfStudy: 'Informatik',
    moduleSpecification: 'Analysis',
    abbreviation: 'Ana',
    semesterHours: 6,
    ects: 7,
    workload: '90 h Präsenz (Seminaristischer Unterricht mit integrierten\n' +
    'Übungen)\n' +
    '120 h Eigenarbeit (40 h Nachbereitung des Lehrstoffs, 30 h\n' +
    'Bearbeitung von Übungsaufgaben, 50 h Prüfungsvorbereitung)',
    semester: 1,
    rota: 'Jaehrlich',
    duration: 'einsemestrig',
    responsiblePerson: 'Prof. Dr. Geissler',
    lecturer: 'Prof. Dr. Geissler',       // if there is more than one, the string should be joined with commas
    language: 'Deutsch',
    admissionRequirements: '-',           // e.g. Vorrückensberechtigung nach §5 Abs. 1 SPO
    prerequesites: '-',                   // e.g. math 3 for the bachelor thesis
    qualificationGoals: 'Studierende sollen wesentliche Grundlagen der Analysis bis\n' +
    'hin zur Differentialrechnung kennen und anwenden können.',
    content: 'Logik, Mengenlehre, Vollständige Induktion, Kombinatorik,\n' +
    'rationale und reelle Zahlen, komplexe Zahlen, Folgen und\n' +
    'Grenzwerte, Funktionen und Stetigkeit, Ableitungen, Satz von\n' +
    'Rolle, Extrema, Zwischenwertsatz, Taylorreihen,\n' +
    'l’Hospitalsche Regel,',
    examType: 'Schriftliche Prüfung (120 Minuten)',
    mediaTuypes: 'Tafel, Skript',
    literature: 'I.N. Bronstein, G. Semendjajew, H. Musiol, H. Mühlig, „Taschenbuch\n' +
    'der Mathematik“ I und II, Harri Deutsch, Frankfurt\n' +
    'a. M., 1993<br/>\n' +
    'T. Arens et al., „Mathematik“, Spektrum, Heidelberg, 2008<br/>\n' +
    'K. Burg, H. Haf, F. Wille, „Höhere Mathematik für Ingenieure“\n' +
    '1 – 5, B. G. Teubner, Stuttgart, 1985<br/>\n' +
    'D.W. Jordan, P. Smith, „Mathematische Methoden für die\n' +
    'Praxis”, Spektrum, Heidelberg, Berlin, 1996<br/>\n' +
    'K. Königsberger, „Analysis I“, Springer, Berlin, 1990<br/>\n' +
    'O. Forster, „Analysis 1“, Vieweg, Wiesbaden, 2004<br/>\n' +
    'Fichtenholz, „Differential- und Integralrechnung“, Harri\n' +
    'Deutsch, Frankfurt a. M.<br/>\n' +
    'G.E. Joos, E. Richter, „Höhere Mathematik“, Harri Deutsch,\n' +
    'Frankfurt a. M., 1993<br/>\n' +
    'R. Courant, F. John, „Introduction to Calculus und Analysis I“,\n' +
    'Springer, New York, 1989'
  }
];
