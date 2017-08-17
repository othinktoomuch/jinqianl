/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.jianqianl.common.response;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

public class ListResponse<T> extends BaseResponse {
	private static final long serialVersionUID = -4862030606070066914L;
	private List<T> data;

	public List<T> getData() {
		return this.data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}