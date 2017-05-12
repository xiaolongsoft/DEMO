package com.crosstek.sms114.domain;

import java.io.Serializable;
import java.sql.Timestamp;

import com.crosstek.sms114.common.PageModel;

public class User extends PageModel  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6801631095798222213L;

	private Long userId;//id
	  
	private String name;//名称
	  
	private String pwd;//密码
	  
	private Integer roleid;//角色
	  
	private Long deptId;//部门
	  
	private Timestamp ctime;//
	  
	private String status;//
	
	private  String deptname; //  不存表 临时字段
	  
	
	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getName() {
		 return name;
	}
	
	public void setName(String name) {
		 this.name = name;
	}
	
	public String getPwd() {
		 return pwd;
	}
	
	public void setPwd(String pwd) {
		 this.pwd = pwd;
	}
	
	public Integer getRoleid() {
		 return roleid;
	}
	
	public void setRoleid(Integer roleid) {
		 this.roleid = roleid;
	}
	
	
	public String getStatus() {
		 return status;
	}
	
	public void setStatus(String status) {
		 this.status = status;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Timestamp getCtime() {
		return ctime;
	}

	public void setCtime(Timestamp ctime) {
		this.ctime = ctime;
	}
	
	
}