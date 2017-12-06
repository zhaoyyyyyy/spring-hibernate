package com.bear.watchonline.watchType.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bear.watchonline.entity.WatchType;
import com.bear.watchonline.watchType.dao.WatchTypeDaoImpl;

@Service
@Transactional(readOnly=true)
public class WatchTypeServiceImpl {
	@Resource
	private WatchTypeDaoImpl watchTypeDaoImpl;
	//三中查找方式
	public List<WatchType> findAll() {
		return this.watchTypeDaoImpl.findAll();
	}
	
	public WatchType getByName(String typeName) {
		return watchTypeDaoImpl.getByName(typeName);	
	}
	
	public WatchType getById(int id) {
		return watchTypeDaoImpl.getById(id);
	}
	
	public boolean addWatchType(WatchType wt) {
		return watchTypeDaoImpl.addWatchType(wt);
	}
}
