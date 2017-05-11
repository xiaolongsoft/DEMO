package utils;


import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;

import com.crosstek.sms114.domain.User;

public class UserUtils {
		public static User getUserFromSession(){
			ServletRequestAttributes	ra=(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
			HttpServletRequest request=ra.getRequest(); 
				User u=	(User) request.getSession().getAttribute("CurrentUser");
				return u;
			
		}
}
