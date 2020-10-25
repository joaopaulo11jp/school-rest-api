package io.github.joaopaulo11jp.school.core;

public interface MappedDTO<T> {
	
	MappedDTO<T> fromResource(T resource);
	T toResource(MappedDTO<T> dto);

}
