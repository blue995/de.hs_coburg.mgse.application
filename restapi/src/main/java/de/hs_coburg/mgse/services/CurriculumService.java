package de.hs_coburg.mgse.services;

import de.hs_coburg.mgse.business.CurriculumBusiness;
import de.hs_coburg.mgse.business.CurriculumBusinessIf;
import de.hs_coburg.mgse.persistence.model.Curriculum;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/curricula")
public class CurriculumService {

    private static CurriculumBusinessIf bg;

    static {
        bg = new CurriculumBusiness();
    }

    /*
     * get curriculum list
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGlossaryList() {
        if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
        List<Curriculum> curriculum_list;

        try {
            curriculum_list = bg.readCurriculumList();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

        if (curriculum_list == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("Curriculum list not found")).build();
        return Response.ok(curriculum_list).build();
    }

    /*
     * get a course of studies
     */
    @GET
    @Path("/{curriculum_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGlossarySection(@PathParam("curriculum_id") long curriculum_id) {
        if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
        Curriculum curriculum;

        try {
            curriculum = bg.readCurriculum(curriculum_id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

        if (curriculum == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("Curriculum not found for id: '" + curriculum_id)).build();
        return Response.ok(curriculum).build();
    }

}
