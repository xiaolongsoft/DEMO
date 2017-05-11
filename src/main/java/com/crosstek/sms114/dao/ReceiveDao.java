package com.crosstek.sms114.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crosstek.sms114.common.BaseDao;
import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.domain.Receive;

@Mapper
@Repository
public interface ReceiveDao extends BaseDao{
	
    int deleteByPrimaryKey(@Param(value="moId")Long mo_id);

    int insert(Receive Receive);

    Receive selectByPrimaryKey(@Param(value="mo_id")Long mo_id);

    int updateByPrimaryKey(Receive Receive);

	List<Receive> search(PageModel<Receive> page);
	
}