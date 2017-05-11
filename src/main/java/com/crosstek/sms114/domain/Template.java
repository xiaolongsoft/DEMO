package com.crosstek.sms114.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import com.crosstek.sms114.common.PageModel;

public class Template  extends PageModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long temId;//id
	  
	private String subject;//主题
	  
	private String content;//内容
	  
	private Timestamp startTime;//开始时间
	  
	private Timestamp endTime;//结束时间
	  
	private Timestamp ctime;//
	  
	private String status;//

	public Long getTemId() {
		return temId;
	}

	public void setTemId(Long temId) {
		this.temId = temId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getStartTime() {
		return startTime;
	}

	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}

	public Timestamp getEndTime() {
		return endTime;
	}

	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}

	public Timestamp getCtime() {
		return ctime;
	}

	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	  
	
}