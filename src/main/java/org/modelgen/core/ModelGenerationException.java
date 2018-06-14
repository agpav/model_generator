package org.modelgen.core;

public class ModelGenerationException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ModelGenerationException() {
		super();
	}

	public ModelGenerationException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ModelGenerationException(String message, Throwable cause) {
		super(message, cause);
	}

	public ModelGenerationException(String message) {
		super(message);
	}

	public ModelGenerationException(Throwable cause) {
		super(cause);
	}

}
