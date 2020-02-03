package com.accp.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

 



public class myInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
//		if(handler instanceof HandlerMethod) {
//			HandlerMethod method = (HandlerMethod) handler;
//			if(method.getBean() instanceof loginController) {
//				return true;
//			}
//		}
		
		 
//		User user=(User) request.getSession().getAttribute("user");
//		System.out.println(user);
//		if(user!=null) {
//			return true;
//		} 
//		return false;
		return true;
	}

}
