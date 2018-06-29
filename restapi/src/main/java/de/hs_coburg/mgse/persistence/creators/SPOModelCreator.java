package de.hs_coburg.mgse.persistence.creators;
import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import de.hs_coburg.mgse.persistence.model.StudySection;
import de.hs_coburg.mgse.persistence.model.StudyExaminationRegulations;
import de.hs_coburg.mgse.persistence.model.Footnote;
import de.hs_coburg.mgse.persistence.model.Sentence;
import de.hs_coburg.mgse.persistence.model.Paragraph;
import de.hs_coburg.mgse.persistence.model.SubParagraph;
import de.hs_coburg.mgse.persistence.model.CourseOfStudies;
import de.hs_coburg.mgse.persistence.model.Module;

public class SPOModelCreator {
	public static boolean createModel() {
        boolean resp = true;
        
        resp = resp && createModelPart0();
        
        return resp;
    }

	//0: SPO
	private static boolean createModelPart0() {
		try {
			EntityManager em = HibernateUtil.getEntityManager();
			em.getTransaction().begin();
			
			//StudyExaminationRegulations
			StudyExaminationRegulations ser0 = new StudyExaminationRegulations();
			CourseOfStudies cos0 = (CourseOfStudies) em.createQuery("SELECT cos FROM CourseOfStudies cos WHERE cos.completeName = 'Informatik' AND cos.ects = 210 AND cos.semester = 7").getSingleResult();
			ser0.setCourse(cos0);
			ser0.setVersion(1);
			Calendar c0 = GregorianCalendar.getInstance();
			c0.set(2018, 4, 1);  //January 30th 2000
			ser0.setValidityDate(new Date(c0.getTimeInMillis()));
			ser0.setTitle("Studien- und Prüfungsordnung für den Bachelorstudiengang Informatik an der Hochschule für angewandte Wissenschaften Coburg (SPO B IF)");
			ser0.setForeword("Auf Grund von Art.13 Abs.1, 43, 44, 58 Abs.1, 61 Abs.2 und 8 und 66 des Bayerischen Hochschulgesetzes–BayHSchG– (BayRS 2210–1–1–WFK) erlässt die Hochschule für angewandteWissenschaften Coburg folgende Satzung");
			
			//StudySection with Modules
			List<StudySection> l_ss0 = new ArrayList<StudySection>();
			StudySection ss0 = new StudySection();
			ss0.setFirstSemester(1);
			ss0.setLastSemester(2);
			ss0.setCompleteName("Theoretisches Fachsemester");
			List<Module> l_m0 = new ArrayList<Module>();
			Module m0 = (Module) em.createQuery("SELECT m FROM Module m WHERE m.completeName = 'Prog1' AND m.ects = 5 AND m.quantifier = 2.2 AND m.semesterHours = 4").getSingleResult();
			l_m0.add(m0);
			Module m1 = (Module) em.createQuery("SELECT m FROM Module m WHERE m.completeName = 'GI' AND m.ects = 7 AND m.quantifier = 2.2 AND m.semesterHours = 6").getSingleResult();
			l_m0.add(m1);
			ss0.setModules(l_m0);
			l_ss0.add(ss0);
			ser0.setStudySections(l_ss0);
			
			//Footnotes
			List<Footnote> l_fn0 = new ArrayList<Footnote>();
			Footnote fn0 = new Footnote();
			fn0.setText("Die nähere Festlegung erfolgt durch die Fakultät im Studien– und Prüfungsplan");
			l_fn0.add(fn0);
			Footnote fn1 = new Footnote();
			fn1.setText("Ein ECTS-Punkt entspricht generell einem Arbeitsaufwand von 30 Arbeitsstunden.");
			l_fn0.add(fn1);
			Footnote fn2 = new Footnote();
			fn2.setText("Soweit mehrere Prüfungsformen eingetragen sind, wird Art und Umfang der jeweiligenPrüfung im Studien– und Prüfungsplan festgelegt.");
			l_fn0.add(fn2);
			Footnote fn3 = new Footnote();
			fn3.setText("Aus der in sich geschlossenen Wahlpflichtmodulgruppe sind mindestens drei Modulezu wählen. Nähere Regelungen trifft der Studien– und Prüfungsplan.");
			l_fn0.add(fn3);
			Footnote fn4 = new Footnote();
			fn4.setText("Aus der in sich abgeschlossenen Wahlpflichtmodulgruppe sind neun Module zuwählen. Nähere Regelungen trifft der Studien– und Prüfungsplan. Die Fakultät kannam Ende des vierten Studiensemesters ein Wahlverfahren zu zulässigen Wahlpflichtkombinationendurchführen, mit dem das tatsächlich wählbare Angebot ab einerbestimmten Mindestteilnehmerzahl ermittelt wird.");
			l_fn0.add(fn4);
			Footnote fn5 = new Footnote();
			fn5.setText("Für den Erst– und den Wiederholungsversuch der Bachelorarbeit ist der Besuch desbegleitenden Bachelorseminars verpflichtend. Dabei soll der Studierende Fragestellung,Bearbeitungsansätze und –methoden sowie die Ergebnisse seiner Bachelorarbeitdarstellen und vertreten. Bei Wiederholung der Bachelorarbeit ist die Endnotedes zugehörigen Bachelorseminars maßgebend.");
			l_fn0.add(fn5);
			Footnote fn6 = new Footnote();
			fn6.setText("Prädikatsnoten mit Erfolg / ohne Erfolg abgelegt.");
			l_fn0.add(fn6);
			Footnote fn7 = new Footnote();
			fn7.setText("Sofern ein Modul mit einer schrP abschließt, kann der Studien- und Prüfungsplanfür dieses Modul festlegen, dass darin freiwillig studienbegleitend eine prStA abgelegtwerden kann. Wurde die schrP bestanden, werden die für die studienbegleitendeprStA erreichten Punkte auf die in der schrP erreichten Punkte im Umfangvon max. 10% der in der schrP erreichbaren Punkte addiert. Eine Wiederholungder studienbegleitenden prStA bei einem Versäumen infolge nicht zu vertretenderGründe findet nicht statt. Bei Wiederholung der schriftlichen Prüfung werden dieerreichten Punkte der studienbegleitenden prStA nicht angerechnet. Näheres regeltder Studien- und Prüfungsrplan.");
			l_fn0.add(fn7);
			ser0.setFootnotes(l_fn0);
			
			//Paragraph, SubParagraphs, Sentences and Relation to Footnotes
			List<Paragraph> l_p0 = new ArrayList<Paragraph>();
			Paragraph p0 = new Paragraph();
			p0.setTitle("Zweck der Studien- und Prüfungsordnung");
			p0.setNumber(1);
			
			//Sentences for Paragraphs
			List<Sentence> l_p_sent0 = new ArrayList<Sentence>();
			Sentence p_sent0 = new Sentence();
			p_sent0.setText("Diese Studien- und Prüfungsordnung regelt den Bachelorstudiengang Informatik an der			Hochschule für angewandte Wissenschaften Coburg");
			
			
			l_p_sent0.add(p_sent0);
			Sentence p_sent1 = new Sentence();
			p_sent1.setText("Sie dient der Ausfüllung und Ergänzung der Rahmenprüfungsordnung für die			Fachhochschulen (RaPO) vom 17. Oktober 2001 (BayRS 2210–1–1–WFK) und der			Allgemeinen Prüfungsordnung der Hochschule für angewandte Wissenschaften Coburg			(APO) vom 14. November 2013 (Amtsblatt 2013) in der jeweiligen Fassung");
			
			//Add Relation Paragraph->Sentence to Footnote
			List<Footnote> l_p_sent_fn0 = new ArrayList<Footnote>();
			for(Footnote fn: l_fn0) {
				if(fn.getText().equals("Die nähere Festlegung erfolgt durch die Fakultät im Studien– und Prüfungsplan")) {
					l_p_sent_fn0.add(fn);
				}
				if(fn.getText().equals("Ein ECTS-Punkt entspricht generell einem Arbeitsaufwand von 30 Arbeitsstunden.")) {
					l_p_sent_fn0.add(fn);
				}
				if(fn.getText().equals("Soweit mehrere Prüfungsformen eingetragen sind, wird Art und Umfang der jeweiligenPrüfung im Studien– und Prüfungsplan festgelegt.")) {
					l_p_sent_fn0.add(fn);
				}
			}
			p_sent1.setFootnotes(l_p_sent_fn0);
			
			l_p_sent0.add(p_sent1);
			p0.setSentences(l_p_sent0);
			
			List<SubParagraph> l_sp0 = new ArrayList<SubParagraph>();
			p0.setSubParagraphs(l_sp0);
			l_p0.add(p0);
			Paragraph p1 = new Paragraph();
			p1.setTitle("Studienziel");
			p1.setNumber(2);
			
			//Sentences for Paragraphs
			List<Sentence> l_p_sent1 = new ArrayList<Sentence>();
			Sentence p_sent2 = new Sentence();
			p_sent2.setText("Ziel des Bachelorstudiums ist die Vermittlung der Befähigung zur selbständigen Anwendung			wissenschaftlicher Erkenntnisse und Methoden in der Informatik.");
			
			
			l_p_sent1.add(p_sent2);
			Sentence p_sent3 = new Sentence();
			p_sent3.setText("Der Breite und Vielfalt der Informatik wird durch eine umfassende Grundlagenausbildung sowie			der Spezialisierungsmöglichkeit in eine der angebotenen Vertiefungsrichtungen Rechnung getragen.");
			
			
			l_p_sent1.add(p_sent3);
			Sentence p_sent4 = new Sentence();
			p_sent4.setText("Das Studium soll dazu befähigen, sich rasch in eines der zahlreichen Anwendungsgebiete einzuarbeiten, sich neue			Gebiete zu erschließen und sich selbständig weiterzubilden.");
			
			
			l_p_sent1.add(p_sent4);
			Sentence p_sent5 = new Sentence();
			p_sent5.setText("Der Bachelorabschluss befähigt insbesondere zur Übernahme anwendungsorientierter			Fach– und Führungsaufgaben im Bereich der Informatik.");
			
			
			l_p_sent1.add(p_sent5);
			Sentence p_sent6 = new Sentence();
			p_sent6.setText("Der erfolgreiche Abschluss soll es ermöglichen, das Studium in einem Masterstudiengang nationaloder international fortzusetzen.");
			
			
			l_p_sent1.add(p_sent6);
			p1.setSentences(l_p_sent1);
			
			List<SubParagraph> l_sp1 = new ArrayList<SubParagraph>();
			p1.setSubParagraphs(l_sp1);
			l_p0.add(p1);
			Paragraph p2 = new Paragraph();
			p2.setTitle("Regelstudienzeit, Aufbau des Studiums, Vertiefungsrichtungen");
			p2.setNumber(3);
			
			//Sentences for Paragraphs
			List<Sentence> l_p_sent2 = new ArrayList<Sentence>();
			p2.setSentences(l_p_sent2);
			
			List<SubParagraph> l_sp2 = new ArrayList<SubParagraph>();
			SubParagraph sp0 = new SubParagraph();
			sp0.setNumber(1);
				
			//Sentences for SubParagraphs
			List<Sentence> l_sp_sent0 = new ArrayList<Sentence>();
			Sentence sp_sent0 = new Sentence();
			sp_sent0.setText("Die Regelstudienzeit beträgt sieben Studiensemester.");
			
			//Add Relation SubParagraph->Sentence to Footnote
			List<Footnote> l_sp_sent_fn0 = new ArrayList<Footnote>();
			for(Footnote fn: l_fn0) {
				if(fn.getText().equals("Die nähere Festlegung erfolgt durch die Fakultät im Studien– und Prüfungsplan")) {
					l_sp_sent_fn0.add(fn);
				}
			}
			sp_sent0.setFootnotes(l_sp_sent_fn0);
			
			l_sp_sent0.add(sp_sent0);
			sp0.setSentences(l_sp_sent0);
			
			l_sp2.add(sp0);
			SubParagraph sp1 = new SubParagraph();
			sp1.setNumber(2);
				
			//Sentences for SubParagraphs
			List<Sentence> l_sp_sent1 = new ArrayList<Sentence>();
			Sentence sp_sent1 = new Sentence();
			sp_sent1.setText("Der Aufbau des Studiums ergibt sich aus der Anlage zu dieser Studien- und Prüfungsordnung.");
			
			//Add Relation SubParagraph->Sentence to Footnote
			List<Footnote> l_sp_sent_fn1 = new ArrayList<Footnote>();
			for(Footnote fn: l_fn0) {
				if(fn.getText().equals("Ein ECTS-Punkt entspricht generell einem Arbeitsaufwand von 30 Arbeitsstunden.")) {
					l_sp_sent_fn1.add(fn);
				}
				if(fn.getText().equals("Soweit mehrere Prüfungsformen eingetragen sind, wird Art und Umfang der jeweiligenPrüfung im Studien– und Prüfungsplan festgelegt.")) {
					l_sp_sent_fn1.add(fn);
				}
			}
			sp_sent1.setFootnotes(l_sp_sent_fn1);
			
			l_sp_sent1.add(sp_sent1);
			sp1.setSentences(l_sp_sent1);
			
			l_sp2.add(sp1);
			SubParagraph sp2 = new SubParagraph();
			sp2.setNumber(3);
				
			//Sentences for SubParagraphs
			List<Sentence> l_sp_sent2 = new ArrayList<Sentence>();
			Sentence sp_sent2 = new Sentence();
			sp_sent2.setText("Eine Vertiefungsrichtung ist eine Gruppe von fachlich zusammengehörenden Modulen,			in denen ein bestimmtes Fachgebiet vertieft wird.");
			
			
			l_sp_sent2.add(sp_sent2);
			Sentence sp_sent3 = new Sentence();
			sp_sent3.setText("Module einer Vertiefungsrichtung werden als fachwissenschaftliche Wahlpflichtmodule 			nach Maßgabe des Studien- und Prüfungsplans			ab dem dritten Studiensemester geführt.");
			
			
			l_sp_sent2.add(sp_sent3);
			Sentence sp_sent4 = new Sentence();
			sp_sent4.setText("Als Vertiefungsrichtungen werden angeboten:");
			
			
			l_sp_sent2.add(sp_sent4);
			sp2.setSentences(l_sp_sent2);
			
			l_sp2.add(sp2);
			p2.setSubParagraphs(l_sp2);
			l_p0.add(p2);
			ser0.setParagraphs(l_p0);
			
			em.persist(ser0);
			
			//commit and close Transaction
			em.getTransaction().commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
