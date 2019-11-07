package com.company.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.util.WebUtils;

import com.company.domain.LoginDto;
import com.company.domain.MemberVo;
import com.company.service.MemberService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class LoginController {

	@Autowired
	private MemberService service;
	
	@GetMapping("/")
	public String main() {
		return "home";
	}
	@GetMapping("/loginForm")
	public void loginForm(@ModelAttribute("loginDto") LoginDto loginDto) {
		log.info("loginForm....");
	}
	
	@PostMapping("/loginPost")
	public void loginPost(LoginDto loginDto, HttpSession httpSession, Model model) throws Exception {
		MemberVo member = service.login(loginDto);
		
		if(member == null) {
			return;
		}
		
		model.addAttribute("user", member);
		model.addAttribute("id", member.getId());
		model.addAttribute("pw", member.getPassword());
	}
	
	//logout
	@GetMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession) throws Exception{
		Object object = httpSession.getAttribute("login");
		if(object != null) {
			MemberVo member = (MemberVo) object;
			httpSession.removeAttribute("login");
			httpSession.invalidate();
			Cookie loginCookie = WebUtils.getCookie(request, "loginCookie");
			if(loginCookie != null) {
				loginCookie.setPath("/");
				loginCookie.setMaxAge(0);
				response.addCookie(loginCookie);
			}
			log.info("logout.....");
		}
		
		return "/logout";
	}
	
}
