package org.modelgen;

import org.modelgen.core.ModelFileGenerator;

enum Types {
	Interfaces("Interfaces"), Classes("Classes"), Enums("Enums"), Exceptions("Exceptions"), Errors(
			"Errors"), Annotations("Annotation Types");

	private String name;

	private Types(String name) {
		this.name = name;
	}
}

public class PrintService {

	public static final String DIR = "./src/main/resources/";
	public static final String INPUT_FILE = DIR + "docfile.txt";
	public static final String GRAMMER_FILE = DIR + "grammer.mdf";

	public static void main(String[] args) throws Exception {

	}

	private DocModel readFile() throws Exception {
		ModelFileGenerator<DocModel> mfr = new ModelFileGenerator<>();
		mfr.open(INPUT_FILE, GRAMMER_FILE);
		DocModel dm = mfr.read();
		mfr.close();
		return dm;
	}
}