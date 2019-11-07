package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.domain.MemberVo;
import com.company.service.MemberService;

@Controller
public class MemberRegister {

	@Autowired
	private MemberService service;
	
	
	@GetMapping("/register")
	public void register() {
		
	}
	
	@PostMapping("/register")
	public String register(MemberVo member, RedirectAttributes rttr) {
		service.register(member);
		
		return "redirect:/login";
	}
}
