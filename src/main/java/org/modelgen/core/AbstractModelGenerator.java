package org.modelgen.core;

public abstract class AbstractModelGenerator<T extends Model> implements ModelGenerator<T> {

	protected String grammerFile;
	protected Grammer grammer;
	
	protected void readGrammer(String grammerFile) throws ModelGenerationException {
		GrammerFileReader reader = new GrammerFileReader();
		this.grammer = reader.read(grammerFile);
	}
	
	@Override
	public void open() throws ModelGenerationException {
		
	}

	@Override
	public T read() throws ModelGenerationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void write(T t) throws ModelGenerationException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws ModelGenerationException {
		// TODO Auto-generated method stub

	}

}
