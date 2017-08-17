/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.jianqianl.common.response;

import org.apache.commons.lang.builder.ToStringBuilder;

public class AddResponse extends BaseResponse {
	private static final long serialVersionUID = -6429474575770308931L;
	private Object data;

	public Object getData() {
		return this.data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}