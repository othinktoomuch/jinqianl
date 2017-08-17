/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.jianqianl.common.response;

import org.apache.commons.lang.builder.ToStringBuilder;

public class SingleResponse<T> extends BaseResponse {
	private static final long serialVersionUID = -2389428077646809363L;
	private T data;

	public T getData() {
		return this.data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}