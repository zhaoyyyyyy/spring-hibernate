package com.bear.watchonline.watch.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bear.watchonline.entity.Color;
import com.bear.watchonline.entity.Page;
import com.bear.watchonline.entity.Watch;
import com.bear.watchonline.entity.WatchType;
import com.bear.watchonline.watch.service.WatchServiceImpl;
import com.bear.watchonline.watchType.service.WatchTypeServiceImpl;
@Controller
public class WatchControllerImpl {
	@Resource
	private WatchServiceImpl watchServiceImpl;
	@Resource
	private WatchTypeServiceImpl watchTypeServiceImpl;
	//前台展示商品列表
	@RequestMapping("/getWatches")
	public String getWatches(HttpServletRequest request) {
		//分页
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
		return "redirect:/product/list.jsp";
	}
	//后台展示商品
	@RequestMapping("/getWatchs")
	public String getWatchs(HttpServletRequest request) {
		//分页
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
	//搜索栏的功能
	@RequestMapping("/searchList")
	public String searchList(String watchName,HttpServletRequest request) {
		List<Watch> list = watchServiceImpl.getWatchByPartName(watchName);
		request.getSession().setAttribute("watchList",list);
		return "redirect:/product/list.jsp";
	}
	//跳到商品详情列表页
	@SuppressWarnings("unchecked")
	@RequestMapping("/singleWatch")
	public String singleWatch(String watchName,HttpSession session) throws IOException {
		List<Watch> list=(List<Watch>) session.getAttribute("watchList");
		Watch w = new Watch();
		for(Watch wat : list) {
			if(wat.getWatchName().equals(watchName))
				w = wat;
		}
		session.setAttribute("watch", w);
		return "redirect:/product/single.jsp";
	}
	//后台搜索查到确定的商品,
	@RequestMapping("/getThisWatch")
	public String getThisWatch(String watchName,HttpServletRequest request) {
		List<WatchType> list = watchTypeServiceImpl.findAll();
		Watch watch = watchServiceImpl.findByName(watchName);
		request.getSession().setAttribute("typeList",list);
		request.getSession().setAttribute("watch",watch);
		return "redirect:/admin/editorWatch.jsp";
	}
	//后台的修改商品
	@RequestMapping("/editorWatch")
	public String editorWatch(Watch watch,HttpServletRequest request) {
		String msg = "修改成功！";
		request.getSession().setAttribute("msg", msg);
		Watch watch1 = watchServiceImpl.findByName(watch.getWatchName());
		int typeId = Integer.parseInt(request.getParameter("type"));
		WatchType wt = watchTypeServiceImpl.getById(typeId);
		watch.setWatchType(wt);
		watchServiceImpl.editorWatch(watch);
		return "redirect:/admin/success.jsp";
	}
	//后台添加商品
	@RequestMapping("/addWatch")
	public String addWatch(String watchName,int price,int typeId,int colorId/*String img, String typeName, String colorName*/) {
		Watch w = new Watch();
		//WatchType wt = new WatchType();
		//Color c = new Color();
		w.setWatchName(watchName);
		w.setPrice(price);
		/*w.setImg(img);*/
		
		//wt.setTypeId(typeId);
		/*wt.setTypeName(typeName);*/
		
		//c.setColorId(colorId);
		/*c.setColorName(colorName);*/
		
		//w.setWatchType(wt);
		//w.setColor(c);
		watchServiceImpl.saveWatch(w);
		return "redirect:/admin/success.jsp";
	}
	//后台删除商品
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
