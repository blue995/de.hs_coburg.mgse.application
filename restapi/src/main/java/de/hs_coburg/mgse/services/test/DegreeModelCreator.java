package de.hs_coburg.mgse.services.test;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import de.hs_coburg.mgse.persistence.model.Degree;
import de.hs_coburg.mgse.persistence.model.DegreeClass;
import de.hs_coburg.mgse.persistence.model.SubDegree;
import de.hs_coburg.mgse.persistence.model.GlossaryEntry;

public class DegreeModelCreator {
    public boolean createModel() {
        boolean resp = true;
        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            DegreeClass dc0 = new DegreeClass();
            dc0.setCompleteName("Bachelor");
            em.persist(dc0);

            DegreeClass dc1 = new DegreeClass();
            dc1.setCompleteName("Master");
            em.persist(dc1);


            SubDegree sd0 = new SubDegree();
            sd0.setCompleteName("Science");
            em.persist(sd0);


            Degree d0 = new Degree();
            GlossaryEntry ge0 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'B.Sc.' AND ge.meaning = 'Bachelorabschluss eines naturwissenschaftlichen Studienganges' AND ge.word = 'Bachelor of Science'").getSingleResult();
            SubDegree sd_0 = (SubDegree) em.createQuery("SELECT sd FROM SubDegree sd WHERE sd.completeName = 'Science'").getSingleResult();
            DegreeClass dc_0 = (DegreeClass) em.createQuery("SELECT dc FROM DegreeClass dc WHERE dc.completeName = 'Bachelor'").getSingleResult();
            d0.setGlossaryEntry(ge0);
            d0.setDegreeClass(dc_0);
            d0.setSubDegree(sd_0);
            em.persist(d0);
            //courseOfStudies missing

            Degree d1 = new Degree();
            GlossaryEntry ge1 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'M.Sc.' AND ge.meaning = 'Masterabschluss eines naturwissenschaftlichen Studienganges' AND ge.word = 'Master of Science'").getSingleResult();
            SubDegree sd_1 = (SubDegree) em.createQuery("SELECT sd FROM SubDegree sd WHERE sd.completeName = 'Science'").getSingleResult();
            DegreeClass dc_1 = (DegreeClass) em.createQuery("SELECT dc FROM DegreeClass dc WHERE dc.completeName = 'Master'").getSingleResult();
            d1.setGlossaryEntry(ge1);
            d1.setDegreeClass(dc_1);
            d1.setSubDegree(sd_1);
            em.persist(d1);
            //courseOfStudies missing

            em.getTransaction().commit();
            //em.close();
        } catch(Exception e) {
            e.printStackTrace();
            resp = false;
        }
        return resp;
    }
}
