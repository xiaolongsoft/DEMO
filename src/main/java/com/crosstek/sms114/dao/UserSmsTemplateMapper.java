package com.crosstek.sms114.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.crosstek.sms114.common.BaseDao;
import com.crosstek.sms114.domain.UserSmsTemplate;
@Mapper
@Repository
public interface UserSmsTemplateMapper extends BaseDao{
	
    int deleteByPrimaryKey(@Param(value="id")Long id);

    int insert(UserSmsTemplate userSmsTemplate);

    UserSmsTemplate selectByPrimaryKey(@Param(value="id")Long id);

    int updateByPrimaryKey(UserSmsTemplate userSmsTemplate);

	List<UserSmsTemplate> search();

	List<Long> searchByTemplateId(Long id);
	
	List<Long> searchByUserId(Long id);
	
	int checkByUidAndTemId(UserSmsTemplate userSmsTemplate);
	
}