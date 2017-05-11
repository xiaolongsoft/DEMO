package com.crosstek.sms114.service;
import java.util.List;

import com.crosstek.sms114.domain.Dept;

public interface DeptService {

	Dept searchById(Long deptId);
	
	List<Dept> search();
	
	int insert(Dept dept);

	int update(Dept dept);
	
	int delete(Long deptId);

	int  save(Dept dept);
	
}