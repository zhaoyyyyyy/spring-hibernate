package com.bear.watchonline.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bear.watchonline.entity.UserInfo;
import com.bear.watchonline.entity.UserLogin;
import com.bear.watchonline.user.dao.UserDaoImpl;

@Service
@Transactional(readOnly=false)
public class UserServiceImpl {
	@Resource
	private UserDaoImpl userDaoImpl;
	
	public List<UserInfo> findAll(){
		List<UserInfo> list = userDaoImpl.findAll();
		return list;
	}
	public boolean findById(String loginName,String password) {
		UserLogin userLogin = userDaoImpl.findById(loginName, password);
		if(userLogin!=null) {
			return true;
		}
		return false;
	}
	
	public UserLogin getUserById(String loginName) {
		return userDaoImpl.getUserById(loginName);
	}
	public boolean deleteUser(String loginName) {
		return userDaoImpl.deleteUser(loginName);
	}
	
	public void regist(UserInfo ui) {
		this.userDaoImpl.saveUser(ui);
	}
	public void registU(UserLogin ul) {
		this.userDaoImpl.saveU(ul);
	}
}
