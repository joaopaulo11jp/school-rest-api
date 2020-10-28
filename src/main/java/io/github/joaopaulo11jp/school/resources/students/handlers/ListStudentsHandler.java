package io.github.joaopaulo11jp.school.resources.students.handlers;

import java.util.List;

public interface ListStudentsHandler {
	
	List<DTO> handle();
	
	public static class DTO {}
}
