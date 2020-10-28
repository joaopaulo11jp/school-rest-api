package io.github.joaopaulo11jp.school.resources.teachers;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PATCH;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import io.github.joaopaulo11jp.school.resources.teachers.handlers.CreateTeacherHandler;
import io.github.joaopaulo11jp.school.resources.teachers.handlers.ListTeachersHandler;
import io.github.joaopaulo11jp.school.resources.teachers.handlers.RetrieveTeacherHandler;
import io.github.joaopaulo11jp.school.resources.teachers.handlers.UpdateTeacherHandler;

@Path("/teachers")
public class TeachersResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@APIResponse(responseCode = "200", description = "Teacher's list fetched")
	public List<ListTeachersHandler.DTO> list() {
		return Collections.emptyList();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@APIResponse(responseCode = "200", description = "Teacher's data")
	public RetrieveTeacherHandler.DTO retrieve() {
		return new RetrieveTeacherHandler.DTO();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@APIResponse(responseCode = "201", description = "Teacher registered successfully.")
	@APIResponse(responseCode = "400", description = "There's another teacher with this same national id.")
	public Response create(@RequestBody(description = "Register a new teacher.") CreateTeacherHandler.DTO payload) {
		return Response.ok().build();
	}
	
	@Path("/{id}")
	@PATCH
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@APIResponse(responseCode = "200", description = "Teacher's data updated successfully.")
	public Response update(@PathParam("id") String id,
							@RequestBody(description = "Update teacher's data.") UpdateTeacherHandler.DTO payload) {
		return Response.ok().build();
	}
	
	
}
