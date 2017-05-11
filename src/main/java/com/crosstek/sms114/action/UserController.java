package com.crosstek.sms114.action;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.codehaus.groovy.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.domain.User;
import com.crosstek.sms114.service.DeptService;
import com.crosstek.sms114.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private DeptService deptService;
			@RequestMapping("listUser")
			String listUser(Map<String,Object> map,PageModel<User> page){
				page=userService.search(page);
				map.put("userList", page.getData());
				map.put("page", page);
				return "user/user_list2";
			}
			
			@RequestMapping("editUser")
			String editUser(User user,String userId,Map<String,Object> map){
				if(StringUtils.isNotBlank(userId)){
					user=userService.searchById(Long.valueOf(userId));
					
				}	
				List deptlist=deptService.search();
				map.put("user", user);
				map.put("deptlist", deptlist);
				return "user/user_edit";
			}

			@RequestMapping("saveUser")
			String saveUser(User user){
				
				userService.save(user);
				
				return "redirect:listUser";
			}
			
			
			
}
