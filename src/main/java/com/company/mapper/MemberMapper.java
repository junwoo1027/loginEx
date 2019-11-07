package com.company.mapper;

import java.util.List;

import com.company.domain.LoginDto;
import com.company.domain.MemberVo;

public interface MemberMapper {

	public List<MemberVo> getList();
	
	public void register(MemberVo member);
	
	public MemberVo login(LoginDto loginDto);
	
}
