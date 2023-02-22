package com.ex.jinju.mapper;

import com.ex.jinju.dto.req.LoginDTO;
import com.ex.jinju.dto.res.UserInfoDTO;

public interface LoginMapper {
	
	UserInfoDTO goLogin(LoginDTO dto);

}
