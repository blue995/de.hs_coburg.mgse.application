package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import de.hs_coburg.mgse.persistence.model.Curriculum;

import javax.persistence.EntityManager;
import java.util.List;

public class CurriculumBusiness implements CurriculumBusinessIf {

    @Override
    public List<Curriculum> readCurriculumList() throws Exception {
        List<Curriculum> curriculum_list;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            curriculum_list = em.createQuery("SELECT x FROM Curriculum x").getResultList();

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (curriculum_list == null) throw new Exception("Curriculum list not found");
        return curriculum_list;
    }

    @Override
    public Curriculum readCurriculum(long curriculum_id) throws Exception {
        Curriculum curriculum;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            curriculum = em.find(Curriculum.class, curriculum_id);

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (curriculum == null) throw new Exception("Curriculum not found");
        return curriculum;
    }

}
