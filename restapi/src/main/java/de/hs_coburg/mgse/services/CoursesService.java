package de.hs_coburg.mgse.services;

import de.hs_coburg.mgse.business.CoursesBusiness;
import de.hs_coburg.mgse.business.CoursesBusinessIf;

import de.hs_coburg.mgse.persistence.model.CourseOfStudies;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/courses")
public class CoursesService {

    private static CoursesBusinessIf bg;

    static {
        bg = new CoursesBusiness();
    }

    /*
     * get course of studies list
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCourseOfStudiesList() {
        if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
        List<CourseOfStudies> course_list;

        try {
            course_list = bg.readCourseOfStudiesList();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

        if (course_list == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("CourseOfStudies list not found")).build();
        return Response.ok(course_list).build();
    }

    /*
     * get a course of studies
     */
    @GET
    @Path("/{course_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCourseOfStudies(@PathParam("course_id") long course_id) {
        if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
        CourseOfStudies course;

        try {
            course = bg.readCourseOfStudies(course_id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

        if (course == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("CourseOfStudies not found for id: '" + course_id)).build();
        return Response.ok(course).build();
    }
}
