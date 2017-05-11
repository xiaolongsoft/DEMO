package com.crosstek.sms114.action;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crosstek.sms114.common.PageModel;
import com.crosstek.sms114.domain.Receive;
import com.crosstek.sms114.domain.Send;
import com.crosstek.sms114.domain.Template;
import com.crosstek.sms114.service.ReceiveService;
import com.crosstek.sms114.service.SendService;
import com.crosstek.sms114.service.TemplateService;

/**
 * 系统平台controller
 * @author 殷晓龙
 *
 */
@Controller
@RequestMapping("/sms")
public class SMSController {
		@Autowired	
		SendService sendService;
		@Autowired
		ReceiveService receiveService;
		@Autowired
		TemplateService templateService;
		@RequestMapping("editSms")
		public String smsPlatform(Map<String,Object> map,Template template){
			template.setOffset(0);
			template.setPageSize(1000);
			PageModel<Template> page=templateService.search(template);
			map.put("page", page);
			map.put("templateVo", template);
			return "/sms/sms_edit";
			
			
		}
		 
		@RequestMapping("saveMsg")
		public String saveMsg(Send send){
			
			sendService.saveSend(send);
			
			return "redirect:editSms";
			
		}
		@RequestMapping("reSaveSend")
		public String reSaveSend(Send send){
			
			
			sendService.saveSend(send);
			
			return "redirect:listSend";
			
		}
		
		
		@RequestMapping("listSend")
		public String listSend(Map<String,Object> map,Send send){
			
			PageModel<Send> page=sendService.search(send);
			map.put("send", send);
			map.put("page", page);
			return "/sms/send_list";
			
		}
		@RequestMapping("listReceive")
		public String listReceive(Map<String,Object> map,PageModel<Receive> page ){
				page=receiveService.search(page);
			map.put("page", page);
			
			return "/sms/receive_list";
			
		}
		
		
}
