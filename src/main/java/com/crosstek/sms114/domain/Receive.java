package com.crosstek.sms114.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import com.crosstek.sms114.common.PageModel;

public class Receive extends PageModel<Receive> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1485325964886548347L;

	private Long moId;//
	  
	private String sendno;//发送号码
	  
	private String receiverInfo;//接收号码
	  
	private String content;//内容
	  
	private Timestamp acceptTime;//发送时间
	  
	private Timestamp ctime;//创建时间

	public Long getMoId() {
		return moId;
	}

	public void setMoId(Long moId) {
		this.moId = moId;
	}

	public String getSendno() {
		return sendno;
	}

	public void setSendno(String sendno) {
		this.sendno = sendno;
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

	public Timestamp getAcceptTime() {
		return acceptTime;
	}

	public void setAcceptTime(Timestamp acceptTime) {
		this.acceptTime = acceptTime;
	}

	public Timestamp getCtime() {
		return ctime;
	}

	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}
	  



	
}