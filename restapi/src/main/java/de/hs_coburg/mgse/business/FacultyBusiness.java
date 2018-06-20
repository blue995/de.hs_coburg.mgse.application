package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import de.hs_coburg.mgse.persistence.model.Faculty;

import javax.persistence.EntityManager;
import java.util.List;

public class FacultyBusiness implements FacultyBusinessIf {
    @Override
    public List<Faculty> readFacultyList() throws Exception {
        List<Faculty> faculty_list;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            faculty_list = em.createQuery("SELECT x FROM Faculty x").getResultList();

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (faculty_list == null) throw new Exception("Faculty list not found");
        return faculty_list;
    }

    @Override
    public Faculty readFaculty(long faculty_id) throws Exception {
        Faculty faculty;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            faculty = em.find(Faculty.class, faculty_id);

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (faculty == null) throw new Exception("Faculty not found");
        return faculty;
    }
}
