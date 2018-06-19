import { Glossary } from '../models/glossary';

export const GLOSSARY: Glossary = <Glossary> {
  id: 0,

  sections: [
    {
      id: 0,
      completeName: "Allgemein",
      entries: [{
        abbreviation: "SPO",
        id: 8,
        word: "Studien- und Prüfungsordnung"
      }, {
        abbreviation: "BayHSchG",
        id: 9,
        word: "Bayerischen Hochschulgesetzes"
      }]
    },
    {
      id: 1,
      completeName: "Abschlüsse",
      entries: [{
        abbreviation: "M.Sc.",
        id: 0,
        word: "Master of Science",
        meaning: "Masterabschluss eines naturwissenschaftlichen Studienganges"
      }, {
        abbreviation: "MA",
        id: 1,
        word: "Master of Arts",
        meaning: "Masterabschluss eines geistes-, kultur-, sozial- oder wirtschaftswissenschaftlichen Studienganges"
      }, {
        abbreviation: "MBA",
        id: 2,
        word: "Master of Business Administration",
        meaning: "Masterabschluss eines Studienganges, welcher hauptsächlich Managementkompetenzen vermittelt."
      }, {
        abbreviation: "B.Sc.",
        id: 3,
        word: "Bachelor of Science",
        meaning: "Bachelorabschluss eines naturwissenschaftlichen Studienganges"
      }]
    },
    {
      id: 2,
      completeName: "Professoren",
      entries: [{
        abbreviation: "AM",
        id: 4,
        word: "Abel Müller"
      }, {
        abbreviation: "BM",
        id: 5,
        word: "Bebel Maier"
      }, {
        abbreviation: "CF",
        id: 6,
        word: "Cebel Fischer"
      }, {
        abbreviation: "DB",
        id: 7,
        word: "Debel Bauer"
      }]
    },
    {
      id: 3,
      completeName: "Module",
      entries: [{
        abbreviation: "Prog1",
        id: 10,
        word: "Programmieren 1"
      }]
    },
    {
      id: 4,
      completeName: "Prüfungsarten",
      entries: [{
        abbreviation: "Prog1",
        id: 11,
        word: "Schriftliche Prüfung"
      }]
    },
    {
      id: 5,
      completeName: "Lehrveranstaltungsarten",
      entries: [{
        abbreviation: "Ü",
        id: 12,
        word: "Übung"
      }, {
        abbreviation: "V",
        id: 13,
        word: "Lehrvortrag"
      }, {
        abbreviation: "SU",
        id: 14,
        word: "Seminaristischer Unterricht"
      }, {
        abbreviation: "Pr",
        id: 15,
        word: "Praktikum"
      }]
    }
  ]
};
