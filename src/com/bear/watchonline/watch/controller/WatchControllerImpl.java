package com.bear.watchonline.watch.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bear.watchonline.entity.Page;
import com.bear.watchonline.entity.Watch;
import com.bear.watchonline.entity.WatchType;
import com.bear.watchonline.watch.service.WatchServiceImpl;
import com.bear.watchonline.watchType.service.WatchTypeServiceImpl;
@Controller
@RequestMapping("/watch")
public class WatchControllerImpl {
	@Resource
	private WatchServiceImpl watchServiceImpl;
	@Resource
	private WatchTypeServiceImpl watchTypeServiceImpl;

	@RequestMapping("/getWatchs")
	public String getWatchs(HttpServletRequest request) {
		String pages = request.getParameter("page");
		Integer dpage = 1;
		if(pages!=null) {
			dpage = Integer.parseInt(pages);
		}
		Page page = new Page();
		page.setTotalcount(watchServiceImpl.getWatchCount());
		page.setTotalpage();
		page.setDpage(dpage);
		List<Watch> list=watchServiceImpl.selectByPage(page);
		request.getSession().setAttribute("watchList", list);
		request.getSession().setAttribute("page", page);
		return "redirect:/admin/gallery.jsp";
	}
	@RequestMapping("/getThisWatch")
	public String getThisWatch(String watchName,HttpServletRequest request) {
		List<WatchType> list = watchTypeServiceImpl.findAll();
		Watch watch = watchServiceImpl.findById(watchName);
		request.getSession().setAttribute("typeList",list);
		request.getSession().setAttribute("watch",watch);
		return "redirect:/admin/editorWatch.jsp";
	}
	@RequestMapping("/editorWatch")
	public String editorWatch(Watch watch,HttpServletRequest request) {
		String msg = "修改成功！";
		request.getSession().setAttribute("msg", msg);
		Watch watch1 = watchServiceImpl.findById(watch.getWatchName());
		int typeId = Integer.parseInt(request.getParameter("type"));
		WatchType wt = watchTypeServiceImpl.getById(typeId);
		watch.setWatchType(wt);
		watchServiceImpl.editorWatch(watch);
		return "redirect:/admin/success.jsp";
	}
	@RequestMapping("/addWatch")
	/*public String addWatch(HttpServletRequest request,@RequestParam MultipartFile watchimg,Watch watch) throws IOException {
		String msg="添加成功！";
		request.getSession().setAttribute("msg", msg);
		int typeId = Integer.parseInt(request.getParameter("typeId"));
		int colorId = Integer.parseInt(request.getParameter("colorId"));
		WatchType wt = watchTypeServiceImpl.getById(typeId);
		watch.setWatchType(wt);
		//不会写
		watchServiceImpl.saveWatch(watch);*/
	public String addWatch(String watchName,int price/*,int type,int color,int id*/) {
		Watch watch = new Watch();
		watch.setWatchName(watchName);
		watch.setPrice(price);
		/*watch.setColor(color);
		watch.setWatchType(type);
		watch.setOrderDetail(orderDetail);*/
		watchServiceImpl.saveWatch(watch);
		return "redirect:/admin/success.jsp";
	}
	@RequestMapping("/deleteWatch")
	public String deleteWatch(String watchName,HttpServletRequest request) {
		Watch watch = new Watch();
		watch.setWatchName(watchName);
		watchServiceImpl.deleteWatch(watch);
		String msg = "删除成功！";
		request.getSession().setAttribute("msg", msg);
		return "redirect:/admin/success.jsp";
	}
}
