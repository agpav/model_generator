package org.modelgen.core;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Grammer {

	private List<Command> commands;

	public void add(Command command) {
		this.commands.add(command);
	}
}

@Getter
@Setter
class Command {
	private String prefix;
	private String grammer;
	private boolean multiple;
}
