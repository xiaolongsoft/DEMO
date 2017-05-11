package com.crosstek.sms114.service;
import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.domain.User;

public interface UserService {

	User searchById(Long user_id);
	
	
	int insert(User user);

	int update(User user);
	
	int delete(Long user_id);
	
	void save(User user);
	
	User checkLogin(String name,String pwd);

	PageModel<User> search(PageModel<User> page);


	String getUsersTreeData(Long id);
	
	
	
}