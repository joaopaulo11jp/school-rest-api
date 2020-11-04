package io.github.joaopaulo11jp.school.core;

import java.util.Set;

import javax.validation.constraints.NotNull;

public class ResourceErrors {
	
	Set<String> errors;

	public Set<String> getErrors() {
		return errors;
	}
	
	private ResourceErrors(@NotNull Set<String> errors) {
		this.errors = errors;
	}
	
	public static ResourceErrors from(Set<String> errors) {
		return new ResourceErrors(errors);
	}
}
