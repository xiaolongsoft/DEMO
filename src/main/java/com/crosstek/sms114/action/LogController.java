package com.crosstek.sms114.action;



import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/logs")
public class LogController {
	
	@RequestMapping("/queryLogHtml")
	public String queryLog( String user,Map<String, Object> map) {
		//如果不是管理员登陆，则查询自己的日志记录
		if(user=="admin"||user=="super"){
				System.out.println("gogo");
		}

		return "query/operlog";
	}
}