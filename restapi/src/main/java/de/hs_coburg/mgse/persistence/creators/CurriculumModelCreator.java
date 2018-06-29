package de.hs_coburg.mgse.persistence.creators;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

import de.hs_coburg.mgse.persistence.model.Aid;
import de.hs_coburg.mgse.persistence.model.CustomAid;
import de.hs_coburg.mgse.persistence.model.ModuleSpecification;
import de.hs_coburg.mgse.persistence.model.Module;
import de.hs_coburg.mgse.persistence.model.Curriculum;
import de.hs_coburg.mgse.persistence.model.ConcreteExamType;
import de.hs_coburg.mgse.persistence.model.StudyExaminationRegulations;

public class CurriculumModelCreator {
    public static boolean createModel() {
        boolean resp = true;

        resp = resp && createModelPart0();

        return resp;
    }

    //0: Aid
    private static boolean createModelPart0() {
        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            Curriculum cur0 = new Curriculum();
            cur0.setCompleteName("Studienplan für Sommersemester 2018, Informatik Bachelor");
            cur0.setVersion(1);
            cur0.setYear(1);
            cur0.setSemester("Sommersemester");
            StudyExaminationRegulations ser0 = (StudyExaminationRegulations) em.createQuery("SELECT ser FROM StudyExaminationRegulations ser WHERE ser.version = 1 AND ser.title = 'Studien- und Prüfungsordnung für den Bachelorstudiengang Informatik an der Hochschule für angewandte Wissenschaften Coburg (SPO B IF)' AND ser.foreword = 'Auf Grund von Art.13 Abs.1, 43, 44, 58 Abs.1, 61 Abs.2 und 8 und 66 des Bayerischen Hochschulgesetzes–BayHSchG– (BayRS 2210–1–1–WFK) erlässt die Hochschule für angewandteWissenschaften Coburg folgende Satzung'").getSingleResult();
            if(ser0 != null) cur0.setSer(ser0);

            //ModuleSpecification
            List<ModuleSpecification> l_ms0 = new ArrayList<ModuleSpecification>();
            ModuleSpecification ms0 = new ModuleSpecification();
            ms0.setCompleteName("E1");
            ms0.setSemester(1);
            ms0.setRota("jaehrlich");

            //IMPLEMENT ME URGENTLY


            l_ms0.add(ms0);
            ModuleSpecification ms1 = new ModuleSpecification();
            ms1.setCompleteName("E2");
            ms1.setSemester(2);
            ms1.setRota("jaehrlich");

            //IMPLEMENT ME URGENTLY


            l_ms0.add(ms1);
            cur0.setModuleSpecifications(l_ms0);
            //cur0.add(l_ms0);

            em.persist(cur0);

            //commit and close Transaction
            em.getTransaction().commit();
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
