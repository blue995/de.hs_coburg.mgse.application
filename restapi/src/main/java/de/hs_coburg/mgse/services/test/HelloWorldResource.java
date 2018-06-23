package de.hs_coburg.mgse.services.test;
import de.hs_coburg.mgse.persistence.model.*;
import de.hs_coburg.mgse.persistence.HibernateUtil;
import de.hs_coburg.mgse.persistence.model.*;
import de.hs_coburg.mgse.persistence.test.StudentInfo;

import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

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
        /*
        String msg = "Got it!";
        try{

            GlossaryModelCreator.createModel();


        } catch(Exception e){
            e.printStackTrace();
            msg = "Maybe not..";
        }
        return msg;*/

        boolean msg = true;
/*
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
            msg = true;
        } catch(Exception e){
            e.printStackTrace();
            msg = false;
        }

        try{
            EntityManager em = HibernateUtil.getEntityManager();

            em.getTransaction().begin();
            Faculty info = new Faculty();
            info.setCompleteName("Informatik");
            em.persist(info);
            em.getTransaction().commit();

            em.getTransaction().begin();
            info = new Faculty();
            info.setCompleteName("Elektrotechnik");
            em.persist(info);
            em.getTransaction().commit();

            em.getTransaction().begin();
            info = new Faculty();
            info.setCompleteName("Maschinenbau");
            em.persist(info);
            em.getTransaction().commit();

            msg = true;
        } catch(Exception e){
            e.printStackTrace();
            msg = false;
        }*/

        GlossaryModelCreator gmc = new GlossaryModelCreator();
        msg = msg && gmc.createModel();

        DegreeModelCreator dmc = new DegreeModelCreator();
        msg = msg && dmc.createModel();

        CourseModelCreator cmc = new CourseModelCreator();
        msg = msg && cmc.createModel();

        if(msg)
            return "Got it!";
        else
            return "Maybe not..";
    }
}
