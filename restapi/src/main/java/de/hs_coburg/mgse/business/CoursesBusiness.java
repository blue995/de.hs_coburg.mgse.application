package de.hs_coburg.mgse.business;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import de.hs_coburg.mgse.persistence.model.CourseOfStudies;
import javax.persistence.EntityManager;
import java.util.List;


public class CoursesBusiness implements CoursesBusinessIf {

    @Override
    public List<CourseOfStudies> readCourseOfStudiesList() throws Exception {
        List<CourseOfStudies> course_list;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            course_list = em.createQuery("SELECT x FROM CourseOfStudies x").getResultList();

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (course_list == null) throw new Exception("CourseOfStudies list not found");
        return course_list;
    }

    @Override
    public CourseOfStudies readCourseOfStudies(long course_id) throws Exception {
        CourseOfStudies course;

        try {
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();

            course = em.find(CourseOfStudies.class, course_id);

            em.getTransaction().commit();
            //em.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception(e);
        }

        if (course == null) throw new Exception("CourseOfStudies not found");
        return course;
    }

}
