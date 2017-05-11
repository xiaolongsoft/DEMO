package com.crosstek.sms114.action;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.domain.Dept;
import com.crosstek.sms114.domain.User;
import com.crosstek.sms114.service.DeptService;
import com.crosstek.sms114.service.UserService;

@Controller
@RequestMapping("/dept")
public class DeptController {

	@Resource
	private DeptService deptService;
	@Autowired
	private UserService userService;

			@RequestMapping("listDept")
			String listDept(Map<String,Object> map){
				 List<Dept> list=	deptService.search();
				 map.put("deptList", list);
				return "dept/dept_list";
			}
			
			@RequestMapping("editDept")
			String editDept(Dept dept,String deptId,Map<String,Object> map){
					if(StringUtils.isNotBlank(deptId)){
						dept=deptService.searchById(Long.valueOf(deptId));
					}
					List deptlist=deptService.search();
					PageModel< User> page=userService.search(new PageModel<User>(0, 500));
					map.put("deptVo", dept);
					map.put("deptlist", deptlist);
					map.put("userlist", page.getData());
				return "dept/dept_edit";
			}

			@RequestMapping("saveDept")
			String saveDept(Dept dept){
				deptService.save(dept);
				return "redirect:listDept";
			}
			@RequestMapping("deleteDept")
			String deleteDept(Long deptId){
				deptService.delete(deptId);
				
				return "redirect:listDept";
			}
			
}
