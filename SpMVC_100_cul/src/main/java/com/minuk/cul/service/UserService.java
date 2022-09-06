package com.minuk.cul.service;

import com.minuk.cul.model.UserVO;
import com.minuk.cul.persistance.UserDao;

public interface UserService extends UserDao{

	public UserVO login(UserVO userVO);
	public int join(UserVO userVO);
	
}