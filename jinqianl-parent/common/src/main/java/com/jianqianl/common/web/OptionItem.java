package com.jianqianl.common.web;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 编  号：
 * 名  称：OptionItem
 * 描  述：前端option选项
 * 完成日期：2017年3月14日
 * 编码作者：RenDongPing
 */
public class OptionItem {

    private String text;

    private String value;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}