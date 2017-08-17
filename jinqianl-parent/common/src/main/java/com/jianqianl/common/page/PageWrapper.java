package com.jianqianl.common.page;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * 编  号：
 * 名  称：PageWrapper
 * 描  述：分页查询包装类
 * 完成日期：2017年2月29日
 * 编码作者：RenDongPing
 * @param <T>
 */
public class PageWrapper<T> implements Serializable {
	private static final long serialVersionUID = 1L;
	//当前页
	private int pageNumber = 1;
	//每页的数量
	private int pageSize = 10;
	//总页数
	private int totalPages;
	//总记录数
	private long total;
	//结果集
	private List<T> rows;
	//查询参数
	private Map<String, Object> params = new HashMap<String, Object>();

	public PageWrapper() {
	}

	public PageWrapper(Map<String, Object> params) {
		this.params = params;
		this.pageNumber = 1;
	}

	public PageWrapper(Map<String, Object> params, int pageNumber) {
		this.params = params;
		this.pageNumber = pageNumber;
	}

	public Map<String, Object> getParams() {
		return this.params;
	}

	public void setParams(Map<String, Object> params) {
		this.params = params;
	}

	public int getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPages() {
		return this.totalPages;
	}

	public boolean hasRows() {
		return this.getRows() != null && this.getRows().size() > 0;
	}

	public boolean hasNextPage() {
		return this.pageNumber < this.totalPages;
	}

	public boolean hasPreviousPage() {
		return this.pageNumber >= 1;
	}

	public boolean isFirstPage() {
		return this.pageNumber == 1;
	}

	public boolean isLastPage() {
		return (long) this.pageNumber == this.totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public long getTotal() {
		return this.total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public List<T> getRows() {
		return this.rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}