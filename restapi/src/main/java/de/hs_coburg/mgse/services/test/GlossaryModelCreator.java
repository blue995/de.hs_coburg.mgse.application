/*package de.hs_coburg.mgse.services.test;

import de.hs_coburg.mgse.persistence.model.Glossary;
import de.hs_coburg.mgse.persistence.model.GlossaryEntry;
import de.hs_coburg.mgse.persistence.model.GlossarySection;
import de.hs_coburg.mgse.persistence.model.GlossarySection;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;

import de.hs_coburg.mgse.persistence.test.StudentInfo;

import java.util.ArrayList;
import java.util.List;

public class GlossaryModelCreator {

    public static boolean createModel() {
        boolean resp = true;
        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            //StudentInfo info = new StudentInfo();
            //info.setName("neusteName");
            Glossary g = new Glossary();
            GlossarySection gs = new GlossarySection();
            GlossaryEntry ge = new GlossaryEntry();

            ge.setAbbreviation("abbreviation");
            ge.setMeaning("meaning");
            ge.setWord("word");
            List<GlossaryEntry> l_ge = new ArrayList<GlossaryEntry>();
            l_ge.add(ge);

            gs.setEntries(l_ge);
            gs.setCompleteName("compName");
            List<GlossarySection> l_gs = new ArrayList<GlossarySection>();
            l_gs.add(gs);

            g.setSections(l_gs);

            em.persist(g);

            //em.persist(info);
            em.getTransaction().commit();
            em.close();
        } catch(Exception e) {
            e.printStackTrace();
            resp = false;
        }
        return resp;
    }
}*/
package de.hs_coburg.mgse.services.test;

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
            gs_0.setCompleteName("Abschluesse");

            l_gs.add(gs_0);
            //0
            GlossarySection gs_1 = new GlossarySection();
            List<GlossaryEntry> l_ge_1 = new ArrayList<GlossaryEntry>();

            GlossaryEntry ge_4 = new GlossaryEntry();
            ge_4.setWord("maosd");
            ge_4.setMeaning("aoisnmda");
            ge_4.setAbbreviation("daoim");
            l_ge_1.add(ge_4);
            //4

            gs_1.setEntries(l_ge_1);
            gs_1.setCompleteName("Professoren");

            l_gs.add(gs_1);
            //1
            GlossarySection gs_2 = new GlossarySection();
            List<GlossaryEntry> l_ge_2 = new ArrayList<GlossaryEntry>();

            GlossaryEntry ge_5 = new GlossaryEntry();
            ge_5.setWord("Studien- und Prüfungsordnung");
            ge_5.setMeaning("Offensichtlich");
            ge_5.setAbbreviation("SPO");
            l_ge_2.add(ge_5);
            //5
            GlossaryEntry ge_6 = new GlossaryEntry();
            ge_6.setWord("Bayerischen Hochschulgesetzes");
            ge_6.setMeaning("Offensichtlich");
            ge_6.setAbbreviation("BayHSchG");
            l_ge_2.add(ge_6);
            //6

            gs_2.setEntries(l_ge_2);
            gs_2.setCompleteName("Allgemein");

            l_gs.add(gs_2);
            //2

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

