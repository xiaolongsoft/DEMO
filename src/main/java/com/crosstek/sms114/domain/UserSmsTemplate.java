package com.crosstek.sms114.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import com.crosstek.sms114.common.PageModel;

public class UserSmsTemplate extends PageModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;//
	  
	private Long tem_id;//id
	  
	private Long user_id;//id
	  
	private Timestamp ctime;//
	  
	public Long getId() {
		 return id;
	}
	
	public void setId(Long id) {
		 this.id = id;
	}
	
	public Long getTem_id() {
		 return tem_id;
	}
	
	public void setTem_id(Long tem_id) {
		 this.tem_id = tem_id;
	}
	
	public Long getUser_id() {
		 return user_id;
	}
	
	public void setUser_id(Long user_id) {
		 this.user_id = user_id;
	}

	public Timestamp getCtime() {
		return ctime;
	}

	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}
	

	
}