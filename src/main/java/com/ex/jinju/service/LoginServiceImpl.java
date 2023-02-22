package com.ex.jinju.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.jinju.dto.req.LoginDTO;
import com.ex.jinju.dto.res.UserInfoDTO;
import com.ex.jinju.mapper.LoginMapper;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginMapper loginMapper;

	@Override
	public UserInfoDTO goLogin(LoginDTO dto) {
		
		return loginMapper.goLogin(dto);
		
	}

}
