package com.ex.jinju.service;

import com.ex.jinju.dto.req.LoginDTO;
import com.ex.jinju.dto.res.UserInfoDTO;

public interface LoginService {
	
	UserInfoDTO goLogin(LoginDTO dto);

}
