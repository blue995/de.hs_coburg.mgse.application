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

        boolean msg;

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

        /*
        Glossary glossary = new Glossary();
        List<GlossarySection> gs_list = new ArrayList<>();

        // Abschlüsse
        List<GlossaryEntry> ge_list = new ArrayList<>();
        GlossarySection gs = new GlossarySection();
        gs.setCompleteName("Abschlüsse");

        GlossaryEntry ge = new GlossaryEntry();
        ge.setAbbreviation("M.Sc.");
        ge.setMeaning("Masterabschluss eines naturwissenschaftlichen Studienganges");
        ge.setWord("Master of Science");
        ge_list.add(ge);

        ge = new GlossaryEntry();
        ge.setAbbreviation("Master of Arts");
        ge.setMeaning("Masterabschluss eines geistes-, kultur-, sozial- oder wirtschaftswissenschaftlichen Studienganges");
        ge.setWord("Master of Science");
        ge_list.add(ge);

        ge = new GlossaryEntry();
        ge.setAbbreviation("Master of Business Administration");
        ge.setMeaning("Masterabschluss eines Studienganges, welcher hauptsächlich Managementkompetenzen vermittelt.");
        ge.setWord("MBA");
        ge_list.add(ge);

        ge = new GlossaryEntry();
        ge.setAbbreviation("Bachelor of Science");
        ge.setMeaning("Bachelorabschluss eines naturwissenschaftlichen Studienganges");
        ge.setWord("B.Sc.");
        ge_list.add(ge);

        gs.setEntries(ge_list);
        gs_list.add(gs);

        // Professoren
        ge_list = new ArrayList<>();
        gs = new GlossarySection();
        gs.setCompleteName("Professoren");

        ge = new GlossaryEntry();
        ge.setAbbreviation("AM");
        ge.setWord("Abel Müller");
        ge_list.add(ge);

        ge = new GlossaryEntry();
        ge.setAbbreviation("BM");
        ge.setWord("Bebel Maier");
        ge_list.add(ge);

        ge = new GlossaryEntry();
        ge.setAbbreviation("CF");
        ge.setWord("Cebel Fischer");
        ge_list.add(ge);

        ge = new GlossaryEntry();
        ge.setAbbreviation("DB");
        ge.setWord("Debel Bauer");
        ge_list.add(ge);

        gs.setEntries(ge_list);
        gs_list.add(gs);

        glossary.setSections(gs_list);

        try{
            AdmissionRequirement ar = new AdmissionRequirement();
            ar.setValue("some value");

            EntityManager em = HibernateUtil.getEntityManager();

            for (int i=0; i<3; i++) {
                em.getTransaction().begin();
                em.persist(glossary);
                em.getTransaction().commit();
            }

            msg = true;
        } catch(Exception e){
            e.printStackTrace();
            msg = false;
        }
        */

        msg = msg && GlossaryModelCreator.createModel();

        if(msg)
            return "Got it!";
        else
            return "Maybe not..";
    }
}
