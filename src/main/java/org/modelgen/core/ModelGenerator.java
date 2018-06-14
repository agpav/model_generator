package org.modelgen.core;

public interface ModelGenerator<T extends Model> {

	void open() throws ModelGenerationException;

	T read() throws ModelGenerationException;

	void write(T t) throws ModelGenerationException;

	void close() throws ModelGenerationException;
}
