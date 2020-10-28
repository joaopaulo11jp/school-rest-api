package io.github.joaopaulo11jp.school.resources.students.handlers;

import java.util.UUID;

public interface UpdateStudentHandler {
	
	void handler(UUID id, DTO dto);
	
	static class DTO {}

}
