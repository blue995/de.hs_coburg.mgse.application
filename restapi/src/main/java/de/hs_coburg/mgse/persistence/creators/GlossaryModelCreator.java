package de.hs_coburg.mgse.persistence.creators;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;		
import java.util.ArrayList;
import java.util.List;

import de.hs_coburg.mgse.persistence.model.Glossary;
import de.hs_coburg.mgse.persistence.model.GlossaryEntry;
import de.hs_coburg.mgse.persistence.model.GlossarySection;

public class GlossaryModelCreator {
    public static boolean createModel() {
        boolean resp = true;
        
        resp = resp && createModelPart0();
        resp = resp && createModelPart1();
        
        return resp;
    }
    
	private static void setGlossaryEntryMaterials(GlossaryEntry ge, String word, String meaning, String abbreviation) {
		ge.setWord(word);
        ge.setMeaning(meaning);
        ge.setAbbreviation(abbreviation);
	}
    
	//0: Glossary
	private static boolean createModelPart0() {
		try {
			EntityManager em = HibernateUtil.getEntityManager();
			em.getTransaction().begin();

			Glossary g = new Glossary();
			List<GlossarySection> l_gs = new ArrayList<GlossarySection>();

				GlossarySection gs_0 = new GlossarySection();
				List<GlossaryEntry> l_ge_0 = new ArrayList<GlossaryEntry>();
			
				GlossaryEntry ge_0 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_0, "aaa", "dddd", "sadfadsf");
				l_ge_0.add(ge_0);
				//0
				GlossaryEntry ge_1 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_1, "bbb", "asdfdasdf", "asdsffasdf");
				l_ge_0.add(ge_1);
				//1
				GlossaryEntry ge_2 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_2, "ccc", "Madfasdfsadfmittelt.", "dfdfd");
				l_ge_0.add(ge_2);
				//2
				GlossaryEntry ge_3 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_3, "ddd", "Bachelorabschluasdfasdfss eines natusadfrwissenschaftlichen Stuasdfasdfdienganges", "B.adsfadsf.");
				l_ge_0.add(ge_3);
				//3
			
				gs_0.setEntries(l_ge_0);
				gs_0.setCompleteName("irgendwas anderes");
			
				l_gs.add(gs_0);
				//0
		
			g.setSections(l_gs);
			em.persist(g);
			
			//commit and close Transaction
			em.getTransaction().commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	private static boolean createModelPart1() {
		try {
			EntityManager em = HibernateUtil.getEntityManager();
			em.getTransaction().begin();

			Glossary g = new Glossary();
			List<GlossarySection> l_gs = new ArrayList<GlossarySection>();

				GlossarySection gs_1 = new GlossarySection();
				List<GlossaryEntry> l_ge_1 = new ArrayList<GlossaryEntry>();
			
				GlossaryEntry ge_4 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_4, "Master of Science", "Masterabschluss eines naturwissenschaftlichen Studienganges", "M.Sc.");
				l_ge_1.add(ge_4);
				//4
				GlossaryEntry ge_5 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_5, "Master of Arts", "Masterabschluss eines geistes-, kultur-, sozial- oder wirtschaftswissenschaftlichen Studienganges", "M.A.");
				l_ge_1.add(ge_5);
				//5
				GlossaryEntry ge_6 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_6, "Master of Business Administration", "Masterabschluss eines Studienganges, welcher hauptsächlich Managementkompetenzen vermittelt.", "MBA");
				l_ge_1.add(ge_6);
				//6
				GlossaryEntry ge_7 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_7, "Bachelor of Science", "Bachelorabschluss eines naturwissenschaftlichen Studienganges", "B.Sc.");
				l_ge_1.add(ge_7);
				//7
			
				gs_1.setEntries(l_ge_1);
				gs_1.setCompleteName("Abschlüsse");
			
				l_gs.add(gs_1);
				//1
				GlossarySection gs_2 = new GlossarySection();
				List<GlossaryEntry> l_ge_2 = new ArrayList<GlossaryEntry>();
			
				GlossaryEntry ge_8 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_8, "Tobias Blaufuß", "", "TB");
				l_ge_2.add(ge_8);
				//8
				GlossaryEntry ge_9 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_9, "Jonathan Emmanuel Braat", "", "JEB");
				l_ge_2.add(ge_9);
				//9
				GlossaryEntry ge_10 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_10, "Hakan Senkaya", "", "HS");
				l_ge_2.add(ge_10);
				//10
			
				gs_2.setEntries(l_ge_2);
				gs_2.setCompleteName("Professoren");
			
				l_gs.add(gs_2);
				//2
				GlossarySection gs_3 = new GlossarySection();
				List<GlossaryEntry> l_ge_3 = new ArrayList<GlossaryEntry>();
			
				GlossaryEntry ge_11 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_11, "Studien- und Prüfungsordnung", "", "SPO");
				l_ge_3.add(ge_11);
				//11
				GlossaryEntry ge_12 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_12, "Bayerischen Hochschulgesetzes", "", "BayHSchG");
				l_ge_3.add(ge_12);
				//12
			
				gs_3.setEntries(l_ge_3);
				gs_3.setCompleteName("Allgemein");
			
				l_gs.add(gs_3);
				//3
				GlossarySection gs_4 = new GlossarySection();
				List<GlossaryEntry> l_ge_4 = new ArrayList<GlossaryEntry>();
			
				GlossaryEntry ge_13 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_13, "Programmieren 1", "", "Prog1");
				l_ge_4.add(ge_13);
				//13
				GlossaryEntry ge_14 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_14, "Grundlagen der Informatik", "", "GI");
				l_ge_4.add(ge_14);
				//14
			
				gs_4.setEntries(l_ge_4);
				gs_4.setCompleteName("Module");
			
				l_gs.add(gs_4);
				//4
				GlossarySection gs_5 = new GlossarySection();
				List<GlossaryEntry> l_ge_5 = new ArrayList<GlossaryEntry>();
			
				GlossaryEntry ge_15 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_15, "Schriftliche Prüfung", "", "schrPr");
				l_ge_5.add(ge_15);
				//15
			
				gs_5.setEntries(l_ge_5);
				gs_5.setCompleteName("Prüfungsarten");
			
				l_gs.add(gs_5);
				//5
				GlossarySection gs_6 = new GlossarySection();
				List<GlossaryEntry> l_ge_6 = new ArrayList<GlossaryEntry>();
			
				GlossaryEntry ge_16 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_16, "Übung", "", "Ü");
				l_ge_6.add(ge_16);
				//16
				GlossaryEntry ge_17 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_17, "Lehrvortrag", "", "V");
				l_ge_6.add(ge_17);
				//17
				GlossaryEntry ge_18 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_18, "Seminaristischer Unterricht", "", "SU");
				l_ge_6.add(ge_18);
				//18
				GlossaryEntry ge_19 = new GlossaryEntry();
				setGlossaryEntryMaterials(ge_19, "Praktikum", "", "Pr");
				l_ge_6.add(ge_19);
				//19
			
				gs_6.setEntries(l_ge_6);
				gs_6.setCompleteName("Lehrveranstaltungsarten");
			
				l_gs.add(gs_6);
				//6
		
			g.setSections(l_gs);
			em.persist(g);
			
			//commit and close Transaction
			em.getTransaction().commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
