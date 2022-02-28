package org.suai.lab_3.matrixes;

public class MatrixException extends RuntimeException {
	
	private String message;
	
	public MatrixException(String mes) {
		message = mes;
	}
	
	final public String getMessage() {
		return message;
	}
}
