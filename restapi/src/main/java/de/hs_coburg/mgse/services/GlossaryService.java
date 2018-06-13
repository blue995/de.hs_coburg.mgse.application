package de.hs_coburg.mgse.services;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.POST;
import javax.ws.rs.DELETE;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import javax.ws.rs.core.Context;
//import javax.ws.rs.core.UriInfo;
//import javax.naming.InitialContext;


import de.hs_coburg.mgse.persistence.test.GlossaryBl;
import de.hs_coburg.mgse.persistence.test.GlossaryEntryBl;
import de.hs_coburg.mgse.persistence.test.GlossarySectionBl;
import de.hs_coburg.mgse.business.GlossaryBusinessIf;
import de.hs_coburg.mgse.business.test.GlossaryBusiness;


@Path("/glossary")
public class GlossaryService {
	
	//@Context
    //private UriInfo context;
	
	private GlossaryBusinessIf bg;
	
	
	public GlossaryService() {
		//this.bg = this.getGlossaryBusiness();
        // TEST
		this.bg = new GlossaryBusiness();
	}
	
	
//	private GlossaryBusinessIf getGlossaryBusiness() {
//  try {
//      InitialContext ctx = new InitialContext();
//      GlossaryBusinessIf bg = (GlossaryBusinessIf) ctx.lookup("de.hs_coburg.mgse.platform.business.GlossaryBusinessIf");
//      return bg;
//  } catch (Exception e) {
//      // e.toString();
//      return null;
//  }
//}
	
	
	/*
	 * get glossary list
	 */	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGlossaryList() {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();
		List<GlossaryBl> glossary_Bl_list;

		try {
			glossary_Bl_list = bg.readGlossaryList();
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
		}

		if (glossary_Bl_list == null) return Response.status(Response.Status.NOT_FOUND).entity("{ error: 'GlossaryBl list not found' }").build();
		return Response.ok(glossary_Bl_list).build();
	}

	/*
	 * Get the glossary [glossary_id]
	 */
	@GET
	@Path("/{glossary_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGlossary(@PathParam("glossary_id") long glossary_id) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();
		GlossaryBl glossaryBl;

		try {
			glossaryBl = bg.readGlossary(glossary_id);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
		}

		if (glossaryBl == null) return Response.status(Response.Status.NOT_FOUND).entity("{ error: 'GlossaryBl not found for GID: '" + glossary_id + " }").build();
		return Response.ok(glossaryBl).build();
	}

	/*
	 * Create a new glossaryBl
	 */
	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addGlossary(GlossaryBl glossaryBl) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();

		try {
			bg.insertGlossary(glossaryBl);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
		}

		return Response.status(Response.Status.BAD_REQUEST).entity("{ error: 'GlossaryBl could not be created }").build();
	}

	/*
	 * Editing a glossaryBl [glossary_id]
	 */
	@PUT
	@Path("/{glossary_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateGlossary(@PathParam("glossary_id") long glossary_id, GlossaryBl glossaryBl) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();

		try {
			bg.updateGlossary(glossary_id, glossaryBl);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
		}

		return Response.ok().build();
	}

	/*
	 * Delete glossary glossary_id
	 */
	@DELETE
	@Path("/{glossary_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteGlossary(@PathParam("glossary_id") long glossary_id) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();

		try {
			bg.deleteGlossary(glossary_id);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
		}

		return Response.ok().build();
	}


	/*
	 * Get a glossary section [section_id] from the glossary [glossary_id]
	 */
	@GET
	@Path("/{glossary_id}/{section_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGlossarySection(@PathParam("glossary_id") long glossary_id, @PathParam("section_id") long section_id) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();
		GlossarySectionBl section;

		try {
			section = bg.readGlossarySection(glossary_id, section_id);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
		}

		if (section == null) return Response.status(Response.Status.NOT_FOUND).entity("{ error: 'GlossaryBl section not found for GID/SID: '" + glossary_id + "/" + section_id + " }").build();
		return Response.ok(section).build();
	}

	/*
	 * Add a new glossary section to the glossary [glossary_id]
	 */
	@POST
	@Path("/{glossary_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addGlossarySection(@PathParam("glossary_id") long glossary_id, GlossarySectionBl section) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();

		try {
			bg.insertGlossarySection(glossary_id, section);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
		}

		return Response.ok().build();
	}

	/*
	 * Editing a glossary section [section_id] in the glossary [glossary_id]
	 */
	@PUT
	@Path("/{glossary_id}/{section_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateGlossarySection(@PathParam("glossary_id") long glossary_id, @PathParam("section_id") long section_id, GlossarySectionBl section) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();

		try {
			bg.updateGlossarySection(glossary_id, section_id, section);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
		}

		return Response.ok().build();
	}

	/*
	 * Delete the glossary section [section_id] from the glossary [glossary_id]
	 */
	@DELETE
	@Path("/{glossary_id}/{section_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteGlossarySection(@PathParam("glossary_id") long glossary_id, @PathParam("section_id") long section_id) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();

		try {
			bg.deleteGlossarySection(glossary_id, section_id);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
		}

		return Response.ok().build();
	}


	/*
	 * Get a glossary entry [entry_id] from the section [section_id] from the glossary [glossary_id]
	 */
	@GET
	@Path("/{glossary_id}/{section_id}/{entry_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGlossaryEntry(@PathParam("glossary_id") long glossary_id, @PathParam("section_id") long section_id, @PathParam("entry_id") long entry_id) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();
		GlossaryEntryBl entry;

		try {
			entry = bg.readGlossaryEntry(glossary_id, section_id, entry_id);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
		}

		if (entry == null) return Response.status(Response.Status.NOT_FOUND).entity("{ error: 'GlossaryBl entry not found for GID/SID/EID: '" + glossary_id + "/" + section_id + "/" + entry_id + " }").build();
		return Response.ok(entry).build();
	}

	/*
	 * Add a new glossary entry to the section [section_id] from the glossary [glossary_id]
	 */
	@POST
	@Path("/{glossary_id}/{section_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addGlossaryEntry(@PathParam("glossary_id") long glossary_id, @PathParam("section_id") long section_id, GlossaryEntryBl entry) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();

		try {
			bg.insertGlossaryEntry(glossary_id, section_id, entry);
		} catch (Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
		}

		return Response.ok().build();
	}

	/*
	 * Edit a glossary entry [entry_id] in the section [section_id] from the glossary [glossary_id]
	 */
	@PUT
	@Path("/{glossary_id}/{section_id}/{entry_id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateGlossaryEntry(@PathParam("glossary_id") long glossary_id, @PathParam("section_id") long section_id, @PathParam("entry_id") long entry_id, GlossaryEntryBl entry) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();

        try {
            bg.updateGlossaryEntry(glossary_id, section_id, entry_id, entry);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
        }

		return Response.ok().build();
	}

	/*
	 * Delete the glossary entry [entry_id] from the section [section_id] from the glossary [glossary_id]
	 */
	@DELETE
	@Path("/{glossary_id}/{section_id}/{entry_id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteGlossaryEntry(@PathParam("glossary_id") long glossary_id, @PathParam("section_id") long section_id, @PathParam("entry_id") long entry_id) {
		if (this.bg == null) Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("{ error: 'Business interface not found' }").build();

        try {
            bg.deleteGlossaryEntry(glossary_id, section_id, entry_id);
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity("{ error: " + e.toString() + " }").build();
        }

		return Response.ok().build();
	}

}
