package com.crosstek.sms114.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.crosstek.sms114.common.BaseDao;
import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.domain.Template;
@Mapper
@Repository
public interface TemplateDao extends BaseDao{
	
    int deleteByPrimaryKey(@Param(value="temId")Long tem_id);

    int insert(Template template);

    Template selectByPrimaryKey(@Param(value="temId")Long tem_id);

    int updateByPrimaryKey(Template template);

	List<Template> search(PageModel<Template> page);
	
}