/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.jianqianl.common.response;

import java.util.HashMap;
import java.util.Map;

public class DataResponse extends BaseResponse {
	private static final long serialVersionUID = 3041502940706093596L;
	private Map<String, Object> data = new HashMap();

	public Map<String, Object> getData() {
		return this.data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}