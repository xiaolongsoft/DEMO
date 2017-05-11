package com.crosstek.sms114.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crosstek.sms114.domain.User;
import com.crosstek.sms114.service.UserService;

@Controller
public class LoginController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = { "/signon.shtml", "/", "/index.jsp", "/index.html", "/index" })
	public String login(HttpServletRequest request, Map<String, Object> result) {
	User userSession = (User) request.getSession().getAttribute("userSession");
		if (userSession != null) {
			return "redirect:/user/mainHtml";
		}
		String loginname = request.getParameter("loginname");
		String password = request.getParameter("password");
		if (loginname == null || password == null || "".equals(password) || "".equals(loginname)) {
			return "user/login";
		}


		User user = userService.checkLogin(loginname, password);
		if (user == null) {
			result.put("loginname", loginname);
			result.put("loginMsg", "账户名或者密码不正确！");
			return "user/login";
		}

		request.getSession().setAttribute("CurrentUser", user);
		
		return "redirect:/user/mainHtml";
	}
	
	@RequestMapping("/user/mainHtml")
	public String main(Map<String, Object> map, HttpServletRequest request) {
		//User u = (User) request.getSession().getAttribute("userSession");
		return "user/main";
	}

	
}
