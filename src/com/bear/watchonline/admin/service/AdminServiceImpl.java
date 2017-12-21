package com.bear.watchonline.admin.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bear.watchonline.admin.dao.AdminDaoImpl;
import com.bear.watchonline.entity.Admin;

@Service
public class AdminServiceImpl {
	@Resource
	private AdminDaoImpl adi;
	
	public List<Admin> findAll(){
		List<Admin> list = adi.findAll();
		return list;
	}
	public boolean findByNamePsd(String name,String psd) {
		Admin admin = adi.findByNamePsd(name, psd);
		if(admin!=null) {
			return true;
		}
		return false;
	}
	public boolean addAdmin(Admin admin) {
		return adi.addAdmin(admin);
	}
	public boolean updateAdmin(Admin admin) {
		return adi.updateAdmin(admin);
	}
	public boolean deleteAdmin(Admin admin) {
		return adi.deleteAdmin(admin);
	}
}
