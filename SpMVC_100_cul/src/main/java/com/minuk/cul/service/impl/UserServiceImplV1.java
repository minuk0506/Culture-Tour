package com.minuk.cul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.minuk.cul.config.QualifierConfig;
import com.minuk.cul.model.UserVO;
import com.minuk.cul.persistance.UserDao;
import com.minuk.cul.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.SERVICE.USER_V1)
public class UserServiceImplV1 implements UserService{
	
	@Autowired
	protected PasswordEncoder passwordEncoder;
	@Autowired
	protected UserDao userDao;

	@Bean
	public void create_user_table() {
			userDao.create_user_table();
	}

	@Override
	public List<UserVO> findByName(String name) {
		// TODO Auto-generated method stub
		return userDao.findByName(name);
	}

	@Override
	public List<UserVO> findByNickName(String nickName) {
		// TODO Auto-generated method stub
		return userDao.findByNickName(nickName);
	}

	@Override
	public UserVO findByEmail(String email) {
		return userDao.findByEmail(email);
	}

	@Override
	public List<UserVO> selectAll() {
		// TODO Auto-generated method stub
		return userDao.selectAll();
	}

	@Override
	public UserVO findById(String id) {
		return userDao.findById(id);
	}

	@Override
	public int insert(UserVO vo) {
		// TODO Auto-generated method stub
		return userDao.insert(vo);
	}

	@Override
	public int update(UserVO vo) {
		// TODO Auto-generated method stub
		return userDao.update(vo);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return userDao.delete(id);
	}
	@Override
	public int join(UserVO userVO) {
		
		List<UserVO> users = userDao.selectAll();
		if(users == null || users.size() < 1) {
			userVO.setRole("ADMIN");
		} else {
			userVO.setRole("GUEST");
		}
		
		// password 를 암호화 하자
		String planPassword = userVO.getPassword();
		String encPassword = passwordEncoder.encode(planPassword);
	
		// 암호화된 password 를 다시 VO 에 setting
		userVO.setPassword(encPassword);
		
		// user 정보를 insert
		userDao.insert(userVO);
		
		return 0;
	}
	@Override
	public UserVO login(UserVO userVO) {
		
		UserVO loginUsers = userDao.findById(userVO.getUsername());
		
		String encPassword = loginUsers.getPassword();
		String planPassword = userVO.getPassword();
		// (평문, 암호화된 문자열)
		if(passwordEncoder.matches(planPassword, encPassword)) {
			return loginUsers;
		}
		
		return null;
	}

}
