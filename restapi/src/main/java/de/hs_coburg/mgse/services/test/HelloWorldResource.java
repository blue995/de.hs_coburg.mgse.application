package de.hs_coburg.mgse.services.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import de.hs_coburg.mgse.persistence.creators.*;

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

        boolean msg = true;

        msg = msg && GlossaryModelCreator.createModel();
        msg = msg && DegreeModelCreator.createModel();
        msg = msg && AdmissionRequirementModelCreator.createModel();
        msg = msg && CourseModelCreator.createModel();
        msg = msg && CourseTypeDeclarationModelCreator.createModel();
        msg = msg && ExamTypeDeclarationModelCreator.createModel();
        msg = msg && ModuleModelCreator.createModel();
        msg = msg && SPOModelCreator.createModel();

        if(msg)
            return "Got it!";
        else
            return "Maybe not..";
    }
}
