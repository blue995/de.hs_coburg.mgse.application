package de.hs_coburg.mgse.services.test;

import de.hs_coburg.mgse.persistence.HibernateUtil;
import de.hs_coburg.mgse.persistence.test.StudentInfo;

import de.hs_coburg.mgse.persistence.model.CourseOfStudies;
import de.hs_coburg.mgse.persistence.model.AdmissionRequirement;
import de.hs_coburg.mgse.persistence.model.ModuleAdmissionRequirement;

import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "hello" path)
 */
@Path("hello")
public class HelloWorldResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        String msg = "Got it!";
        try{
            EntityManager em = HibernateUtil.getEntityManager();
            em.getTransaction().begin();
            StudentInfo info = new StudentInfo();
            info.setName("Hakan");
            em.persist(info);
            em.getTransaction().commit();
            //em.close();
        } catch(Exception e){
            e.printStackTrace();
            msg = "Maybe not..";
        }


        try{
            AdmissionRequirement ar = new AdmissionRequirement();
            ar.setValue("some value");

            EntityManager em = HibernateUtil.getEntityManager();

            for (int i=0; i<3; i++) {
                em.getTransaction().begin();
                CourseOfStudies info = new CourseOfStudies();

                info.setCompleteName("Course " + (i+1));
                info.setEcts(6);
                info.setSemester(i + 1);

                info.getRequirements().add(ar);

                em.persist(info);
                em.getTransaction().commit();
            }
        } catch(Exception e){
            e.printStackTrace();
            msg = "Maybe not..";
        }

        return msg;
    }
}
