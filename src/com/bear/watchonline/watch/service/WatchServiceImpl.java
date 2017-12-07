package com.bear.watchonline.watch.service;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bear.watchonline.entity.Page;
import com.bear.watchonline.entity.Watch;
import com.bear.watchonline.watch.dao.WatchDaoImpl;
@Service
@Transactional(readOnly=true)
public class WatchServiceImpl {
	@Resource
	private WatchDaoImpl watchDaoImpl;
	
	public List<Watch> findAll() {
		return this.watchDaoImpl.findAll();
	}
	
	public List<Watch> getBookByPartName(String watchName){
		return watchDaoImpl.getWatchByPartName(watchName);
	}
	public boolean saveWatch(Watch w) {
		return watchDaoImpl.addWatch(w);
	}
	public boolean deleteWatch(Watch watch) {
		return watchDaoImpl.deleteWatch(watch);
	}
	public boolean editorWatch(Watch watch) {
		return watchDaoImpl.editorWatch(watch);
	}
	public Watch findById(String watchName) {
		return watchDaoImpl.findById(watchName);
	}
	public int getWatchCount() {
		return watchDaoImpl.getWatchCount();
	}
	public List<Watch> selectByPage(Page page){
		return watchDaoImpl.selectByPage(page);
	}
}
