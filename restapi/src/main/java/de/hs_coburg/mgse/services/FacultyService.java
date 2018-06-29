package de.hs_coburg.mgse.services;

import de.hs_coburg.mgse.business.FacultyBusiness;
import de.hs_coburg.mgse.business.FacultyBusinessIf;

import de.hs_coburg.mgse.persistence.model.Faculty;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/faculty")
public class FacultyService {

    private static FacultyBusinessIf bg;

    static {
        bg = new FacultyBusiness();
    }

    /*
     * get faculty list
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFacultyList() {
        if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
        List<Faculty> faculty_list;

        try {
            faculty_list = bg.readFacultyList();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

        if (faculty_list == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("Faculty list not found")).build();
        return Response.ok(faculty_list).build();
    }

    /*
     * get a course of studies
     */
    @GET
    @Path("/{faculty_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getFaculty(@PathParam("faculty_id") long faculty_id) {
        if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
        Faculty faculty;

        try {
            faculty = bg.readFaculty(faculty_id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

        if (faculty == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("Faculty not found for id: '" + faculty_id)).build();
        return Response.ok(faculty).build();
    }

}
