/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.jianqianl.common.exception;

public class BaseRuntimeException extends RuntimeException implements IBaseException {
	private static final long serialVersionUID = 154363543212L;
	protected String numberCode;
	protected String code;
	protected String message;

	public BaseRuntimeException() {
	}

	public BaseRuntimeException(String code, String message) {
		super(code + " - " + message);
		this.code = code;
		this.message = message;
	}

	public BaseRuntimeException(String code, String message, Throwable cause) {
		super(code + " - " + message, cause);
		this.code = code;
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public String getFullMessage() {
		return this.code + " - " + this.message;
	}
}