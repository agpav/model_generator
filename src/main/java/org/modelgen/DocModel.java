package org.modelgen;

import java.util.List;

import org.modelgen.core.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocModel implements Model {

	private String packageName;
	private List<String> interfaces;
	private List<String> classes;
	private List<String> enums;
	private List<String> exceptions;
	private List<String> errors;
	private List<String> annotations;

	private List<String> abstractClasses;
	private List<String> concreteClasses;
	private List<String> innerClasses;
	private List<String> nestedClasses;
	private List<String> staticClasses;

}