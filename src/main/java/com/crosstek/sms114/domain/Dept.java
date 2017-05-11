package com.crosstek.sms114.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import com.crosstek.sms114.common.PageModel;

public class Dept  extends PageModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long deptId;//主键
	  
	private Long pid;//上级部门
	  
	private String name;//名称
	  
	private Timestamp ctime;//更新时间
	  
	private Long user;//更新人

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getCtime() {
		return ctime;
	}

	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}

	public Long getUser() {
		return user;
	}

	public void setUser(Long user) {
		this.user = user;
	}

	
	  
	
	  
	
	
}