package io.github.joaopaulo11jp.school.resources.students.handlers;

import java.util.UUID;

public interface RetrieveStudentHandler {
	
	DTO handler(UUID id);
	
	public static class DTO {}

}
