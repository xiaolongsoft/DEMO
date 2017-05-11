package com.crosstek.sms114.dao;



import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.crosstek.sms114.common.BaseDao;
import com.crosstek.sms114.common.TreeData;
import com.crosstek.sms114.domain.Dept;
@Mapper
@Repository
public interface DeptDao extends BaseDao{
	
    int deleteByPrimaryKey(Long deptId);

    int insert(Dept dept);

    Dept selectByPrimaryKey(Long deptId);

    int updateByPrimaryKey(Dept dept);

	List<Dept> search();
	
	List<TreeData> searchTreeData();
	
}