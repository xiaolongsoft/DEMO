package com.crosstek.sms114.service;
import java.util.List;

import com.crosstek.sms114.domain.UserSmsTemplate;

public interface UserSmsTemplateService {

	UserSmsTemplate searchById(Long id);
	
	List<UserSmsTemplate> search();
	
	int insert(UserSmsTemplate userSmsTemplate);

	int update(UserSmsTemplate userSmsTemplate);
	
	int delete(Long id);

	void  save(UserSmsTemplate ut);
	
}