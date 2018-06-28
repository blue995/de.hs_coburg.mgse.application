package de.hs_coburg.mgse.modelcreator;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;

import de.hs_coburg.mgse.persistence.model.ExamTypeDeclaration;
import de.hs_coburg.mgse.persistence.model.GlossaryEntry;

public class ExamTypeDeclarationModelCreator {
    public static boolean createModel() {
        boolean resp = true;

        resp = resp && createModelPart0();

        return resp;
    }

    //0: ExamTypeDeclaration
    private static boolean createModelPart0() {
        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            ExamTypeDeclaration etd0 = new ExamTypeDeclaration();
            GlossaryEntry ge0 = (GlossaryEntry) em.createQuery("SELECT ge FROM GlossaryEntry ge WHERE ge.abbreviation = 'schrPr' AND ge.meaning = '' AND ge.word = 'Schriftliche Prüfung'").getSingleResult();
            etd0.setDetails(ge0);
            etd0.setUnit("Minuten");
            em.persist(etd0);

            //commit and close Transaction
            em.getTransaction().commit();
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
