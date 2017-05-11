package com.crosstek.sms114.service;

import java.sql.Timestamp;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.dao.TemplateDao;
import com.crosstek.sms114.domain.Template;
import com.crosstek.sms114.service.TemplateService;

@Service("templateService")
public class TemplateServiceImpl implements TemplateService {

	@Resource
	private TemplateDao templateMapper;
	
	public Template searchById(Long tem_id){
		return templateMapper.selectByPrimaryKey(tem_id);
	}
	
	@Transactional
	public int insert(Template template) {
		return templateMapper.insert(template);
	}
	
	@Transactional
	public int update(Template template) {
		return templateMapper.updateByPrimaryKey(template);
	}
	
	@Transactional
	public int delete(Long tem_id){
		return templateMapper.deleteByPrimaryKey(tem_id);
	}
	
	public PageModel<Template> search(PageModel<Template> page) {
		List<Template> items = templateMapper.search(page);
		page.setData(items);
		page.setCount(templateMapper.getRecordCount(page));
		
		return page;
	}

	@Override
	public void save(Template template) {
		if(template.getTemId()==null){
			template.setCtime(new Timestamp(System.currentTimeMillis()));
			templateMapper.insert(template);
			System.err.println(template.getSubject());
			System.out.println(template.getContent());
		}else{
			templateMapper.updateByPrimaryKey(template);
		}
		
	}

}