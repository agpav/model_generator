package org.modelgen.core;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ModelFileGenerator<T extends Model> extends AbstractModelFileGenerator<T> {

	protected LineNumberReader lnr;

	@Override
	public void open(String inputFile, String grammerFile) throws ModelGenerationException {
		super.open(inputFile, grammerFile);
		try {
			lnr = new LineNumberReader(new FileReader(inputFile));
		} catch (FileNotFoundException e) {
			throw new ModelGenerationException(e);
		}
	}

	@Override
	public T read() throws ModelGenerationException {
		return null;
	}

	@Override
	public void close() throws ModelGenerationException {
		try {
			if (lnr != null) {
				lnr.close();
			}
		} catch (IOException e) {
			throw new ModelGenerationException(e);
		}
	}

}
