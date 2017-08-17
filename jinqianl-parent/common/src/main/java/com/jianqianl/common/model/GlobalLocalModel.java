/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.jianqianl.common.model;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

public class GlobalLocalModel {
	private String transactionID;
	private Long userId;
	private String loginName;
	private String userName;
	private String clientIp;
	private String clientOs;
	private String clientMedia;
	private String targetPath;
	private Map<String, Object> contextMap = new HashMap();

	public String getTransactionID() {
		return this.transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getClientOs() {
		return this.clientOs;
	}

	public void setClientOs(String clientOs) {
		this.clientOs = clientOs;
	}

	public String getClientMedia() {
		return this.clientMedia;
	}

	public void setClientMedia(String clientMedia) {
		this.clientMedia = clientMedia;
	}

	public String getTargetPath() {
		return this.targetPath;
	}

	public void setTargetPath(String targetPath) {
		this.targetPath = targetPath;
	}

	public Map<String, Object> getContextMap() {
		return this.contextMap;
	}

	public void setContextMap(Map<String, Object> contextMap) {
		this.contextMap = contextMap;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}