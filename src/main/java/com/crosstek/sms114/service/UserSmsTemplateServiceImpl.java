package com.crosstek.sms114.service;

import java.sql.Timestamp;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crosstek.sms114.dao.UserSmsTemplateMapper;
import com.crosstek.sms114.domain.UserSmsTemplate;
import com.crosstek.sms114.service.UserSmsTemplateService;

@Service("userSmsTemplateService")
public class UserSmsTemplateServiceImpl implements UserSmsTemplateService {

	@Resource
	private UserSmsTemplateMapper userSmsTemplateMapper;
	
	public UserSmsTemplate searchById(Long id){
		return userSmsTemplateMapper.selectByPrimaryKey(id);
	}
	
	@Transactional
	public int insert(UserSmsTemplate userSmsTemplate) {
			userSmsTemplate.setCtime(new Timestamp(System.currentTimeMillis()));
		return userSmsTemplateMapper.insert(userSmsTemplate);
	}
	
	@Transactional
	public int update(UserSmsTemplate userSmsTemplate) {
		return userSmsTemplateMapper.updateByPrimaryKey(userSmsTemplate);
	}
	
	@Transactional
	public int delete(Long id){
		return userSmsTemplateMapper.deleteByPrimaryKey(id);
	}
	
	public List<UserSmsTemplate> search() {
		List<UserSmsTemplate> items = userSmsTemplateMapper.search();
		return items;
	}

	@Override
	public void save(UserSmsTemplate ut) {
		if(userSmsTemplateMapper.checkByUidAndTemId(ut)==0){
			this.insert(ut);
		};
	}

}