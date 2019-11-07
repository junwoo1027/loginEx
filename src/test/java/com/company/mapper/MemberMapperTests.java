package com.company.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.domain.LoginDto;
import com.company.domain.MemberVo;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTests {

	@Autowired
	private MemberMapper mapper;
	
	@Test
	public void TestList() {
		mapper.getList().forEach(member -> log.info(member));
	}
	
//	@Test
//	public void register() {
//		MemberVo member = new MemberVo();
//		
//		member.setId("zzz");
//		member.setPassword("AAA");
//		member.setWriter("FFF");
//		
//		mapper.register(member);
//		
//		log.info(member);
//	}
	
//	@Test
//	public void id() {
//		LoginDto loginDto = new LoginDto();
//		
//		loginDto.setId("testid");
//		
//		mapper.login(loginDto);
//		
//		log.info(loginDto);
//	}
}
