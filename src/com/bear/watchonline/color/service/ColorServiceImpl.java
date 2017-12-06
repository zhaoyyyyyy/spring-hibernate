package com.bear.watchonline.color.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bear.watchonline.color.dao.ColorDaoImpl;
import com.bear.watchonline.entity.Color;
@Service
@Transactional(readOnly=true)
public class ColorServiceImpl {
	@Resource
	private ColorDaoImpl colorDaoImpl;
	
	public List<Color> findAll() {
		return this.colorDaoImpl.findAll();
	}
}
