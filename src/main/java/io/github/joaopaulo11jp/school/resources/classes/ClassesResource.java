package io.github.joaopaulo11jp.school.resources.classes;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tags;
import org.jboss.resteasy.spi.NotImplementedYetException;

import io.github.joaopaulo11jp.school.resources.classes.handlers.CreateClassHandler;
import io.github.joaopaulo11jp.school.resources.classes.handlers.ListClassesHandler;
import io.github.joaopaulo11jp.school.resources.classes.handlers.RetrieveClassHandler;
import io.github.joaopaulo11jp.school.resources.classes.handlers.UpdateClassHandler;

@Path("/classes")
@Tags(refs = "Classes")
public class ClassesResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@APIResponse(responseCode = "200", description = "Class' list fetched")
	public List<ListClassesHandler.DTO> list() {
		return Collections.emptyList();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@APIResponse(responseCode = "200", description = "Class' data fetched.")
	public RetrieveClassHandler.DTO retrieve() {
		return new RetrieveClassHandler.DTO();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@APIResponse(responseCode = "201", description = "Class created successfully.")
	@APIResponse(responseCode = "400", description = "Invalid submited data.")
	public Response create(CreateClassHandler.DTO dto) {
		return Response.ok().build();
	}
	
	@PATCH
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@APIResponse(responseCode = "200", description = "Class updated successfully.")
	@APIResponse(responseCode = "400", description = "Invalid submited data.")
	public Response update(UpdateClassHandler.DTO dto) {
		return Response.ok().build();
	}
	
	@DELETE
	@Path("/{id}")
	@APIResponse(responseCode = "200", description = "Class was removed.")
	public void delete() {
		throw new NotImplementedYetException();
	}

}
