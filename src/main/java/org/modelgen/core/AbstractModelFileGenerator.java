package org.modelgen.core;

public abstract class AbstractModelFileGenerator<T extends Model> extends AbstractModelGenerator<T> {

	protected String inputFile;

	public void open(String inputFile, String grammerFile) throws ModelGenerationException {
		this.inputFile = inputFile;
		this.grammerFile = grammerFile;
		super.open();
	}

}
