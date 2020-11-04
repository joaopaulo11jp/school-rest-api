package io.github.joaopaulo11jp.school.core;

import java.util.UUID;

import javax.validation.constraints.NotNull;

public class ResourceUUID {

	private String id;

	public String getId() {
		return id;
	}
	
	private ResourceUUID(String id) {
		this.id = id;
	}
	
	public static ResourceUUID from(@NotNull UUID id) {
		return new ResourceUUID(id.toString());
	}
	
	public static ResourceUUID from(@NotNull String id) {
		return new ResourceUUID(id);
	}
}
