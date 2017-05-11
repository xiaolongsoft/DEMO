package com.crosstek.sms114.domain;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.crosstek.sms114.common.PageModel;

public class Send extends PageModel<Send> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5421445083310994222L;

	private Long mtId;//
	  
	private String receiverInfo;//接收号码
	  
	private String content;//内容
	  
	private String subject;//主题
	  
	private Timestamp sendTime;//发送时间
	  
	private String mediaTaskId;//返回结果任务id
	  
	private String moId;//关联上行表id
	  
	private Timestamp ctime;//创建时间
	  
	private Timestamp mtime;//更新时间
	  
	private Long userId;//业务员id
	  
	private Long sysuid;//更新人
	  
	private Long mcount;//更新次数

	public Long getMtId() {
		return mtId;
	}

	public void setMtId(Long mtId) {
		this.mtId = mtId;
	}

	public String getReceiverInfo() {
		return receiverInfo;
	}

	public void setReceiverInfo(String receiverInfo) {
		this.receiverInfo = receiverInfo;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Timestamp getSendTime() {
		return sendTime;
	}

	public void setSendTime(Timestamp sendTime) {
		this.sendTime = sendTime;
	}

	public String getMediaTaskId() {
		return mediaTaskId;
	}

	public void setMediaTaskId(String mediaTaskId) {
		this.mediaTaskId = mediaTaskId;
	}

	public String getMoId() {
		return moId;
	}

	public void setMoId(String moId) {
		this.moId = moId;
	}

	public Timestamp getCtime() {
		return ctime;
	}

	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}

	public Timestamp getMtime() {
		return mtime;
	}

	public void setMtime(Timestamp mtime) {
		this.mtime = mtime;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getSysuid() {
		return sysuid;
	}

	public void setSysuid(Long sysuid) {
		this.sysuid = sysuid;
	}

	public Long getMcount() {
		return mcount;
	}

	public void setMcount(Long mcount) {
		this.mcount = mcount;
	}
	
	  
	
	
	
}