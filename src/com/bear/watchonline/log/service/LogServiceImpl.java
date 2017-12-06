package com.bear.watchonline.log.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bear.watchonline.entity.Log;
import com.bear.watchonline.log.dao.LogDaoImpl;
@Service
@Transactional(readOnly=true)
public class LogServiceImpl {
	@Resource
	private LogDaoImpl logDaoImpl;
	
	public List<Log> findAll() {
		return this.logDaoImpl.findAll();
	}
}
