package com.crosstek.sms114.service;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.common.TreeData;
import com.crosstek.sms114.dao.DeptDao;
import com.crosstek.sms114.dao.UserDao;
import com.crosstek.sms114.dao.UserSmsTemplateMapper;
import com.crosstek.sms114.domain.User;

import net.sf.json.JSONArray;
import utils.UserUtils;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userMapper;
	@Autowired
	private DeptDao deptDao;
	@Autowired
	private UserSmsTemplateMapper userTempalteDao;
	public User searchById(Long user_id){
		return userMapper.selectByPrimaryKey(user_id);
	}
	
	@Transactional
	public int insert(User user) {
		return userMapper.insert(user);
	}
	
	@Transactional
	public int update(User user) {
		return userMapper.updateByPrimaryKey(user);
	}
	
	@Transactional
	public int delete(Long user_id){
		return userMapper.deleteByPrimaryKey(user_id);
	}
	
	public PageModel<User> search(PageModel<User> page) {
		List<User> items = userMapper.search(page);
		page.setCount(userMapper.getRecordCount(page));
		page.setData(items);
		return page;
	}
	
	public void save(User u){
		if(u.getUserId()==null){
				u.setCtime(new Timestamp(System.currentTimeMillis()));
				u.setUserId(UserUtils.getUserFromSession().getUserId());
				userMapper.insert(u);
			
		}else{
			userMapper.updateByPrimaryKey(u);
		}
		
	}

	@Override
	public User checkLogin(String name, String pwd) {
		
		return userMapper.findUser(name,pwd);
	}
	
	public String getUsersTreeData(Long id){
		//拥有该模板的所有用户ID
		List<Long> userIds=userTempalteDao.searchByTemplateId(id);
		//所有部门
		List<TreeData> depts=deptDao.searchTreeData();
		for(TreeData d:depts){
			if(userMapper.selectByDeptId(d.getId()).size()>0){
					d.setOpen(true);
			}
		}
		
		
		//所有用户
		List<TreeData> users=userMapper.searchTreeData();
		
		//给拥有该模板的用户添加选中值
		for(TreeData t:users){
			t.setId(-1L);
			if(userIds.contains(Long.valueOf(t.getValue()))){
				t.setChecked(true);
			}
		}
			
		depts.addAll(users);	
			
			String json=JSONArray.fromObject(depts).toString();
			
			System.out.println(json);
		
		return  json;
		
	}

}