package de.hs_coburg.mgse.services;

import de.hs_coburg.mgse.business.CourseCatalogueBusiness;
import de.hs_coburg.mgse.business.CourseCatalogueBusinessIf;
import de.hs_coburg.mgse.business.view.ViewCourseCatalogue;
import de.hs_coburg.mgse.persistence.model.ModuleHandbook;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/courses")
public class CourseCatalogueService {

    private static CourseCatalogueBusinessIf bg;

    static {
        bg = new CourseCatalogueBusiness();
    }

    /*
     * get course catalogue list
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getViewCourseCatalogueList() {
        if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
        List<ViewCourseCatalogue> list;

        try {
            list = bg.readViewCourseCatalogueList();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

        if (list == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("Course catalogue list not found")).build();
        return Response.ok(list).build();
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCourseCatalogueList() {
        if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
        List<ModuleHandbook> list;

        try {
            list = bg.readCourseCatalogueList();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

        if (list == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("Course catalogue list not found")).build();
        return Response.ok(list).build();
    }


    /*
     * get a course catalogue
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getViewCourseCatalogue(@PathParam("id") long id) {
        if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
        ViewCourseCatalogue item;

        try {
            item = bg.readViewCourseCatalogue(id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

        if (item == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("Course catalogue not found for id: '" + id)).build();
        return Response.ok(item).build();
    }

    @GET
    @Path("/single/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCourseCatalogue(@PathParam("id") long id) {
        if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
        ModuleHandbook item;

        try {
            item = bg.readCourseCatalogue(id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

        if (item == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("Course catalogue not found for id: '" + id)).build();
        return Response.ok(item).build();
    }
}
