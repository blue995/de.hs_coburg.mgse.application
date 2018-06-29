package de.hs_coburg.mgse.persistence.creators;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import javax.persistence.EntityManager;

import de.hs_coburg.mgse.persistence.model.Aid;

public class AidModelCreator {
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

            //implement me
            Aid a0 = new Aid();
            a0.setCompleteName("Nicht programmierbarer Taschenrechner");
            em.persist(a0);
            Aid a1 = new Aid();
            a1.setCompleteName("Alles mit Einschränkungen");
            em.persist(a1);

            //commit and close Transaction
            em.getTransaction().commit();
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
