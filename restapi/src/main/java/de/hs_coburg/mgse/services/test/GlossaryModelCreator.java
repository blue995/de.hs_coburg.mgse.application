package de.hs_coburg.mgse.services.test;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import de.hs_coburg.mgse.persistence.model.Glossary;
import de.hs_coburg.mgse.persistence.model.GlossaryEntry;
import de.hs_coburg.mgse.persistence.model.GlossarySection;

public class GlossaryModelCreator {
    public boolean createModel() {
        boolean resp = true;
        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            Glossary g = new Glossary();
            List<GlossarySection> l_gs = new ArrayList<GlossarySection>();

            GlossarySection gs_0 = new GlossarySection();
            List<GlossaryEntry> l_ge_0 = new ArrayList<GlossaryEntry>();

            GlossaryEntry ge_0 = new GlossaryEntry();
            ge_0.setWord("Master of Science");
            ge_0.setMeaning("Masterabschluss eines naturwissenschaftlichen Studienganges");
            ge_0.setAbbreviation("M.Sc.");
            l_ge_0.add(ge_0);
            //0
            GlossaryEntry ge_1 = new GlossaryEntry();
            ge_1.setWord("Master of Arts");
            ge_1.setMeaning("Masterabschluss eines geistes-, kultur-, sozial- oder wirtschaftswissenschaftlichen Studienganges");
            ge_1.setAbbreviation("M.A.");
            l_ge_0.add(ge_1);
            //1
            GlossaryEntry ge_2 = new GlossaryEntry();
            ge_2.setWord("Master of Business Administration");
            ge_2.setMeaning("Masterabschluss eines Studienganges, welcher hauptsächlich Managementkompetenzen vermittelt.");
            ge_2.setAbbreviation("MBA");
            l_ge_0.add(ge_2);
            //2
            GlossaryEntry ge_3 = new GlossaryEntry();
            ge_3.setWord("Bachelor of Science");
            ge_3.setMeaning("Bachelorabschluss eines naturwissenschaftlichen Studienganges");
            ge_3.setAbbreviation("B.Sc.");
            l_ge_0.add(ge_3);
            //3

            gs_0.setEntries(l_ge_0);
            gs_0.setCompleteName("Abschlüsse");

            l_gs.add(gs_0);
            //0
            GlossarySection gs_1 = new GlossarySection();
            List<GlossaryEntry> l_ge_1 = new ArrayList<GlossaryEntry>();

            GlossaryEntry ge_4 = new GlossaryEntry();
            ge_4.setWord("Tobias Blaufuß");
            ge_4.setMeaning("");
            ge_4.setAbbreviation("TB");
            l_ge_1.add(ge_4);
            //4
            GlossaryEntry ge_5 = new GlossaryEntry();
            ge_5.setWord("Jonathan Emmanuel Braat");
            ge_5.setMeaning("");
            ge_5.setAbbreviation("JEB");
            l_ge_1.add(ge_5);
            //5
            GlossaryEntry ge_6 = new GlossaryEntry();
            ge_6.setWord("Hakan Senkaya");
            ge_6.setMeaning("");
            ge_6.setAbbreviation("HS");
            l_ge_1.add(ge_6);
            //6

            gs_1.setEntries(l_ge_1);
            gs_1.setCompleteName("Professoren");

            l_gs.add(gs_1);
            //1
            GlossarySection gs_2 = new GlossarySection();
            List<GlossaryEntry> l_ge_2 = new ArrayList<GlossaryEntry>();

            GlossaryEntry ge_7 = new GlossaryEntry();
            ge_7.setWord("Studien- und Prüfungsordnung");
            ge_7.setMeaning("");
            ge_7.setAbbreviation("SPO");
            l_ge_2.add(ge_7);
            //7
            GlossaryEntry ge_8 = new GlossaryEntry();
            ge_8.setWord("Bayerischen Hochschulgesetzes");
            ge_8.setMeaning("");
            ge_8.setAbbreviation("BayHSchG");
            l_ge_2.add(ge_8);
            //8

            gs_2.setEntries(l_ge_2);
            gs_2.setCompleteName("Allgemein");

            l_gs.add(gs_2);
            //2
            GlossarySection gs_3 = new GlossarySection();
            List<GlossaryEntry> l_ge_3 = new ArrayList<GlossaryEntry>();

            GlossaryEntry ge_9 = new GlossaryEntry();
            ge_9.setWord("Programmieren 1");
            ge_9.setMeaning("");
            ge_9.setAbbreviation("Prog1");
            l_ge_3.add(ge_9);
            //9

            gs_3.setEntries(l_ge_3);
            gs_3.setCompleteName("Module");

            l_gs.add(gs_3);
            //3
            GlossarySection gs_4 = new GlossarySection();
            List<GlossaryEntry> l_ge_4 = new ArrayList<GlossaryEntry>();

            GlossaryEntry ge_10 = new GlossaryEntry();
            ge_10.setWord("Schriftliche Prüfung");
            ge_10.setMeaning("");
            ge_10.setAbbreviation("schrPr");
            l_ge_4.add(ge_10);
            //10

            gs_4.setEntries(l_ge_4);
            gs_4.setCompleteName("Prüfungsarten");

            l_gs.add(gs_4);
            //4
            GlossarySection gs_5 = new GlossarySection();
            List<GlossaryEntry> l_ge_5 = new ArrayList<GlossaryEntry>();

            GlossaryEntry ge_11 = new GlossaryEntry();
            ge_11.setWord("Übung");
            ge_11.setMeaning("");
            ge_11.setAbbreviation("Ü");
            l_ge_5.add(ge_11);
            //11
            GlossaryEntry ge_12 = new GlossaryEntry();
            ge_12.setWord("Lehrvortrag");
            ge_12.setMeaning("");
            ge_12.setAbbreviation("V");
            l_ge_5.add(ge_12);
            //12
            GlossaryEntry ge_13 = new GlossaryEntry();
            ge_13.setWord("Seminaristischer Unterricht");
            ge_13.setMeaning("");
            ge_13.setAbbreviation("SU");
            l_ge_5.add(ge_13);
            //13
            GlossaryEntry ge_14 = new GlossaryEntry();
            ge_14.setWord("Praktikum");
            ge_14.setMeaning("");
            ge_14.setAbbreviation("Pr");
            l_ge_5.add(ge_14);
            //14

            gs_5.setEntries(l_ge_5);
            gs_5.setCompleteName("Lehrveranstaltungsarten");

            l_gs.add(gs_5);
            //5

            g.setSections(l_gs);
            em.persist(g);

            //commit and close Transaction
            em.getTransaction().commit();
            //em.close();
        } catch(Exception e) {
            e.printStackTrace();
            resp = false;
        }
        return resp;
    }
}
