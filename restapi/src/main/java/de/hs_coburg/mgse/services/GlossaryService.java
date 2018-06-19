package de.hs_coburg.mgse.services;


import java.util.List;

import javax.ws.rs.GET;
//import javax.ws.rs.PUT;
//import javax.ws.rs.POST;
//import javax.ws.rs.DELETE;

import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//import javax.ws.rs.Consumes;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import de.hs_coburg.mgse.business.GlossaryBusinessIf;
import de.hs_coburg.mgse.business.GlossaryBusiness;

import de.hs_coburg.mgse.persistence.model.Glossary;
//import de.hs_coburg.mgse.persistence.model.GlossaryEntry;
//import de.hs_coburg.mgse.persistence.model.GlossarySection;

@Path("/glossary")
public class GlossaryService {

	private static GlossaryBusinessIf bg;

	static {
		bg = new GlossaryBusiness();
	}

	/*
	 * get glossary list
	 */	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGlossaryList() {
		if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
		List<Glossary> glossary_list;

		try {
			glossary_list = bg.readGlossaryList();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
		}

		if (glossary_list == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("Glossary list not found")).build();
		return Response.ok(glossary_list).build();
	}

	/*
	 * get a glossary section [section_id]
	 */
	/*
	@GET
	@Path("/{section_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGlossarySection(@PathParam("section_id") long section_id) {
		if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
		GlossarySection section;

		try {
			section = bg.readGlossarySection(section_id);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
		}

		if (section == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("Glossary section not found for SID: '" + section_id)).build();
		return Response.ok(section).build();
	}
	*/

	/*
	 * add a new glossary section
	 */
	/*
	@POST
	@Path("/{glossary_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addGlossarySection(GlossarySection section) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();

		try {
			bg.insertGlossarySection(section);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
		}

		return Response.status(Response.Status.CREATED).build();
	}
	*/
	/*
	 * edit a glossary section [section_id]
	 */
	/*
	@PUT
	@Path("/{section_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateGlossarySection(@PathParam("section_id") long section_id, GlossarySection section) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();

		try {
			bg.updateGlossarySection(section_id, section);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
		}

		return Response.ok().build();
	}
	*/
	/*
	 * delete the glossary section [section_id]
	 */
	/*
	@DELETE
	@Path("/{section_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteGlossarySection(@PathParam("section_id") long section_id) {
		if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();

		try {
			bg.deleteGlossarySection(section_id);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
		}

		return Response.ok().build();
	}
	*/


	/*
	 * get a glossary entry [entry_id] from the section [section_id]
	 */
	/*
	@GET
	@Path("/{section_id}/{entry_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGlossaryEntry(@PathParam("section_id") long section_id, @PathParam("entry_id") long entry_id) {
		if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();
		GlossaryEntry entry;

		try {
			entry = bg.readGlossaryEntry(section_id, entry_id);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
		}

		if (entry == null) return Response.status(Response.Status.NOT_FOUND).entity(new Exception("Glossary entry not found for SID/EID: '" + section_id + "/" + entry_id)).build();
		return Response.ok(entry).build();
	}
	*/

	/*
	 * add a new glossary entry to the section [section_id]
	 */
	/*
	@POST
	@Path("/{section_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addGlossaryEntry(@PathParam("section_id") long section_id, GlossaryEntry entry) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();

		try {
			bg.insertGlossaryEntry(section_id, entry);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
		}

		return Response.status(Response.Status.CREATED).build();
	}
	*/
	/*
	 * edit a glossary entry [entry_id] in the section [section_id]
	 */
	/*
	@PUT
	@Path("/{section_id}/{entry_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateGlossaryEntry(@PathParam("section_id") long section_id, @PathParam("entry_id") long entry_id, GlossaryEntry entry) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();

        try {
            bg.updateGlossaryEntry(section_id, entry_id, entry);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

		return Response.ok().build();
	}
	*/
	/*
	 * delete the glossary entry [entry_id] from the section [section_id]
	 */
	/*
	@DELETE
	@Path("/{section_id}/{entry_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteGlossaryEntry(@PathParam("section_id") long section_id, @PathParam("entry_id") long entry_id) {
		if (bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Exception("Business interface not found")).build();

        try {
            bg.deleteGlossaryEntry(section_id, entry_id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
        }

		return Response.ok().build();
	}
	*/
}
