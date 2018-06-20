package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import de.hs_coburg.mgse.persistence.model.StudyExaminationRegulations;

import javax.persistence.EntityManager;
import java.util.List;

public class SerBusiness implements SerBusinessIf {

    @Override
    public List<StudyExaminationRegulations> readStudyExaminationRegulationsList() throws Exception {
        List<StudyExaminationRegulations> ser_list;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            ser_list = em.createQuery("SELECT x FROM StudyExaminationRegulations x").getResultList();

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (ser_list == null) throw new Exception("StudyExaminationRegulations list not found");
        return ser_list;
    }

    @Override
    public StudyExaminationRegulations readStudyExaminationRegulations(long ser_id) throws Exception {
        StudyExaminationRegulations ser;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            ser = em.find(StudyExaminationRegulations.class, ser_id);

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (ser == null) throw new Exception("StudyExaminationRegulations not found");
        return ser;
    }

}
