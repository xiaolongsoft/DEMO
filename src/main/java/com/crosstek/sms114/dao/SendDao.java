package com.crosstek.sms114.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.crosstek.sms114.common.BaseDao;
import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.domain.Send;
@Mapper
@Repository
public interface SendDao extends BaseDao {
	
    int deleteByPrimaryKey(@Param(value="mtId")Long mt_id);

    int insert(Send Send);

    Send selectByPrimaryKey(@Param(value="mtId")Long mt_id);

    int updateByPrimaryKey(Send Send);

	List<Send> search(PageModel page);
	
	int modyfiCount(Long mtId);
	
}