package com.crosstek.sms114.action;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.domain.Template;
import com.crosstek.sms114.domain.UserSmsTemplate;
import com.crosstek.sms114.service.TemplateService;
import com.crosstek.sms114.service.UserService;
import com.crosstek.sms114.service.UserSmsTemplateService;

@Controller
@RequestMapping("/template")
public class TempleLateController {
	
	@Autowired
	UserService userService;
	
	@Autowired	
	TemplateService templateService;
	@Autowired
	UserSmsTemplateService userTemplateService;
	
		@RequestMapping("/listTemplate")
		public String  listTemplate(Map<String,Object> map,Template template){
			
			map.put("theme", template.getSubject());
			
			PageModel<Template> page=templateService.search(template);
			
			map.put("page", page);
			return "template/template_list";
			
			
		}
		
		
		@RequestMapping("/editTemplate")
		public String   editTemplate(Template template,Long temId,String allot,Map<String,Object> map){
				if(temId!=null){
					template=templateService.searchById(temId);
				}
				
				map.put("templateVo", template);
			  
			  
			return "template/template_edit";
		}
		@RequestMapping("/allotTemplate")
		public String   allotTemplate(Template template,Long temId,String allot,Map<String,Object> map){
			if(temId!=null){
				template=templateService.searchById(temId);
			}
			
			map.put("templateVo", template);
			
				map.put("allot","allot");
				map.put("treeData", userService.getUsersTreeData(temId));				
			
			return "template/template_edit";
		}
		
		@RequestMapping("/saveTemplate")
		public String  saveTemplate(Template template){
				
			templateService.save(template);
			
			return "redirect:listTemplate";
		}
		
		@RequestMapping("/deleteTemplate")
		public String  deleteTemplate(Long temId){
				
			templateService.delete(temId);
			
			return "redirect:listTemplate";
		}
		
		@RequestMapping("/ajaxSaveUserTemplate")
		public String 	ajaxSaveUserTemplate(Long temId,String uids,HttpServletResponse response){
					
					if(temId!=null&&uids!=null){
						
						String[] uid=uids.split(",");
						UserSmsTemplate ut=null;
						for(int i=0;i<uid.length;i++){
							ut=new UserSmsTemplate();
							ut.setUser_id(Long.valueOf(uid[i]));
							ut.setTem_id(temId);
							userTemplateService.save(ut);
						}
						try {
							response.getWriter().write("success!");
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
			
			return null;
			
			
		}
		

}
