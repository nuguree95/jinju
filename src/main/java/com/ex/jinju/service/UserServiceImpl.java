package com.ex.jinju.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.jinju.dto.AddDTO;
import com.ex.jinju.dto.req.LoginDTO;
import com.ex.jinju.dto.res.UserInfoDTO;
import com.ex.jinju.mapper.UserMapper;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper usermapper;

	@Override
	public int addUser(AddDTO dto) {
		
		return usermapper.addUser(dto);

	}

	@Override
	public int deleteUser(LoginDTO dto) {
		return usermapper.deleteUser(dto);
	}
	
	public int updateUser(UserInfoDTO dto) {
		return usermapper.updateUser(dto);
	}

	

}
