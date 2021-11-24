package com.cg.pms.in.exception;

public class PensionerAlreadyExistException extends RuntimeException {
	
	private static final long serialVersionUID = 6294836661695612441L;

	public PensionerAlreadyExistException() {
		super();
	}

	public PensionerAlreadyExistException(String message) {
		super(message);
	}

}
