package com.crosstek.sms114.common;


import java.util.List;

public class PageModel<T>  {

	private List<T> data;
	private Long count;
	private int offset;
	private int pageSize = 10;
	private String linkUrl;

	public PageModel() {
	}

	public PageModel(int offset, int pageSize) {
		this.offset=offset;
		this.pageSize=pageSize;
	}
	public PageModel(String offset, String pageSize) {
		try {
			this.offset = Integer.parseInt(offset);
		} catch (Exception e) {
			this.offset = 0;
		}
		try {
			this.pageSize = Integer.parseInt(pageSize);
		} catch (Exception e) {
			this.pageSize = 10;
		}
	}
	

	public List<?> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}



	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public int getOffset() {
		return offset;
	}

	public void setOffset(int offset) {
		this.offset = offset;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	
}
