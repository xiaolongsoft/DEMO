package com.crosstek.sms114.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.crosstek.sms114.common.BaseDao;
import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.common.TreeData;
import com.crosstek.sms114.domain.User;
@Mapper
@Repository
public interface UserDao extends BaseDao{
	
    int deleteByPrimaryKey(@Param(value="userId")Long user_id);

    int insert(User user);

    User selectByPrimaryKey(@Param(value="userId")Long user_id);
    
    List<User> selectByDeptId(@Param(value="deptId")Long deptId);

    int updateByPrimaryKey(User user);

	List<User> search(PageModel<User> page);
	
	User findUser(@Param(value="name")String name,@Param(value="pwd") String pwd);
	
	List<TreeData> searchTreeData();
	
}