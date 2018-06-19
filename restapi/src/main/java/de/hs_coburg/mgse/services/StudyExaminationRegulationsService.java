package de.hs_coburg.mgse.services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.hs_coburg.mgse.business.SerBusinessIf;
import de.hs_coburg.mgse.business.SerBusiness;

import de.hs_coburg.mgse.persistence.model.StudyExaminationRegulations;

import java.util.List;


@Path("/ser")
public class StudyExaminationRegulationsService {

    private static SerBusinessIf bg;

    static {
        bg = new SerBusiness();
    }

    /*
     * get study examination regulations list
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGlossaryList() {
        if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
        List<StudyExaminationRegulations> ser_list;

        try {
            ser_list = bg.readStudyExaminationRegulationsList();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

        if (ser_list == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("StudyExaminationRegulations list not found")).build();
        return Response.ok(ser_list).build();
    }


    /*
     * get a study examination regulation
     */
    @GET
    @Path("/{ser_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getGlossarySection(@PathParam("ser_id") long ser_id) {
        if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
        StudyExaminationRegulations ser;

        try {
            ser = bg.readStudyExaminationRegulations(ser_id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

        if (ser == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("StudyExaminationRegulations not found for id: '" + ser_id)).build();
        return Response.ok(ser).build();
    }
}
