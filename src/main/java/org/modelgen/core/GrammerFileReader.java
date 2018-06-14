package org.modelgen.core;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class GrammerFileReader {

	public Grammer read(String grammerFile) throws ModelGenerationException {
		try {
			LineNumberReader lnr = new LineNumberReader(new FileReader(grammerFile));
			Grammer grammer = new Grammer();

			String line = "";
			while ((line = lnr.readLine()) != null) {
				Command command = convert(line);
				grammer.add(command);
			}

			if (lnr != null) {
				lnr.close();
			}
			return grammer;
		} catch (IOException e) {
			throw new ModelGenerationException(e);
		}
	}

	private Command convert(String line) {
		Command command = new Command();

		String[] token = line.sub
		
		
		return command;
	}
}
