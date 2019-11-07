package com.company.service;

import com.company.domain.LoginDto;
import com.company.domain.MemberVo;

public interface MemberService {

	public void register(MemberVo member);
	
	public MemberVo login(LoginDto loginDto);
	
}
