package com.crosstek.sms114.service;
import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.domain.Template;

public interface TemplateService {

	Template searchById(Long tem_id);
	
	PageModel<Template> search(PageModel<Template> page);
	
	int insert(Template template);

	int update(Template template);
	
	int delete(Long tem_id);

	void save(Template template);
	
}