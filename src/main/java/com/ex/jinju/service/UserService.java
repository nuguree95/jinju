package com.ex.jinju.service;

import com.ex.jinju.dto.AddDTO;
import com.ex.jinju.dto.req.LoginDTO;
import com.ex.jinju.dto.res.UserInfoDTO;

public interface UserService {
	int addUser(AddDTO dto);
	
	int deleteUser(LoginDTO dto);
	
	int updateUser(UserInfoDTO dto);
	

}
