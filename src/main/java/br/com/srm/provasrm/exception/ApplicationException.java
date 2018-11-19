package br.com.srm.provasrm.exception;

public abstract class ApplicationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8742723117544793071L;

	public ApplicationException(final String message) {
		super(message);
	}
}
