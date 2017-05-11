package com.crosstek.sms114.service;


import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crosstek.sms114.dao.DeptDao;
import com.crosstek.sms114.domain.Dept;

@Service("deptService")
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;
	
	public Dept searchById(Long deptId){
		return deptDao.selectByPrimaryKey(deptId);
	}
	
	@Transactional
	public int insert(Dept dept) {
		return deptDao.insert(dept);
	}
	
	@Transactional
	public int update(Dept dept) {
		return deptDao.updateByPrimaryKey(dept);
	}
	
	@Transactional
	public int delete(Long deptId){
		return deptDao.deleteByPrimaryKey(deptId);
	}
	
	public  int save(Dept dept){
			if(dept.getDeptId()==null){
				dept.setCtime(new Timestamp(System.currentTimeMillis()));
				deptDao.insert(dept);
						
			}else{
				deptDao.updateByPrimaryKey(dept);
			}
		return 0;
	}
	
	@Override
	public List<Dept> search() {
		
		return deptDao.search();
	}

	
	


}