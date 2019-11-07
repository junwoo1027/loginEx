package com.company.commons;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import lombok.extern.log4j.Log4j;

@Log4j
public class LoginInterceptor extends HandlerInterceptorAdapter{
	
	private static final String LOGIN = "login";

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
	
		HttpSession httpSession = request.getSession();
		ModelMap modelMap = modelAndView.getModelMap();
		Object member = modelMap.get("user");
		
		if(member != null) {
			log.info("new login success");
			log.info(modelMap.get("id"));
			log.info(modelMap.get("pw"));
			httpSession.setAttribute(LOGIN, member);
			response.sendRedirect("/");
		}
	}
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		HttpSession httpSession = request.getSession();
		
		if(httpSession.getAttribute(LOGIN) != null) {
			log.info("clear login data before");
			httpSession.removeAttribute(LOGIN);
		}
		
		return true;
	}
	
}
