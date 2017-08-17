/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.jianqianl.common.exception;

import org.apache.commons.lang.StringUtils;

import com.jianqianl.common.model.GlobalLocalModel;
import com.jianqianl.common.threadlocal.GlobalLocalContext;

public class BusinessException extends BaseRuntimeException {
	private static final long serialVersionUID = 12345456313434L;
	protected String code;
	protected String message;

	public BusinessException() {
	}

	public BusinessException(String code, String message) {
		super(code, message);
		this.code = code;
		this.message = message;
	}

	public BusinessException(String code, String message, Throwable e) {
		super(code, message, e);
		this.code = code;
		this.message = message;
	}

	public String getMessage() {
		return this.message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFullMessage() {
		GlobalLocalModel globalLocalModel = GlobalLocalContext.getLocalContext();
		String transactionNo = globalLocalModel.getTransactionID();
		return StringUtils.isNotBlank(transactionNo)
				? StringUtils.trimToEmpty(this.code) + " - " + transactionNo + " : "
						+ StringUtils.trimToEmpty(this.message)
				: StringUtils.trimToEmpty(this.code) + " : " + StringUtils.trimToEmpty(this.message);
	}
}