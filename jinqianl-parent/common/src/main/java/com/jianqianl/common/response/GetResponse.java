/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.jianqianl.common.response;

public class GetResponse extends BaseResponse {
	private static final long serialVersionUID = 4720915672127248578L;
	private Object data;

	public Object getData() {
		return this.data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}