package io.github.joaopaulo11jp.school.resources.classes.handlers;

import java.util.List;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

public interface ListClassesHandler {
	
	List<DTO> handle();
	
	@Schema(name = "Class' data list", description = "class' data")
	static class DTO {
		
		@Schema(required = true, example = "123e4567-e89b-12d3-a456-426614174000")
		private String id;
		
		@Schema(name = "Class description", required = true, example = "Math")
		private String description;
		
		@Schema(name = "Teacher's id", required = true, example = "123e4567-e89b-12d3-a456-426614174000")
		private String teacherId;	
		
	}

}
