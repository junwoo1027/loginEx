package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.mapper.MemberMapper;
import com.company.domain.LoginDto;
import com.company.domain.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;
	
	@Override
	public void register(MemberVo member) {
		mapper.register(member);
	}

	@Override
	public MemberVo login(LoginDto loginDto) {
		return mapper.login(loginDto);
	}
	
}
