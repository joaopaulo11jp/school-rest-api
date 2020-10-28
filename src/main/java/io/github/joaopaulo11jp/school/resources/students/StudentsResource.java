package io.github.joaopaulo11jp.school.resources.students;

import java.util.Collections;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import io.github.joaopaulo11jp.school.resources.students.handlers.CreateStudentHandler;
import io.github.joaopaulo11jp.school.resources.students.handlers.ListStudentsHandler;
import io.github.joaopaulo11jp.school.resources.students.handlers.RetrieveStudentHandler;
import io.github.joaopaulo11jp.school.resources.students.handlers.UpdateStudentHandler;
import io.github.joaopaulo11jp.school.resources.teachers.handlers.RetrieveTeacherHandler;

@Path("/students")
public class StudentsResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@APIResponse(responseCode = "200", description = "Teacher's list fetched")
	public List<ListStudentsHandler.DTO> list() {
		return Collections.emptyList();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@APIResponse(responseCode = "200", description = "Teacher's data")
	public RetrieveStudentHandler.DTO retrieve() {
		return new RetrieveStudentHandler.DTO();
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@APIResponse(responseCode = "201", description = "Student registered successfully.")
	@APIResponse(responseCode = "400", description = "Invalid submited data.")
	public Response create(CreateStudentHandler.DTO dto) {
		return Response.ok().build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@APIResponse(responseCode = "200", description = "Student updated successfully.")
	@APIResponse(responseCode = "400", description = "Invalid submited data.")
	public Response update(UpdateStudentHandler.DTO dto) {
		return Response.ok().build();
	}
}
