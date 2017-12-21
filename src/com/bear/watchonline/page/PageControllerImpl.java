package com.bear.watchonline.page;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bear.watchonline.entity.Page;
import com.bear.watchonline.entity.Watch;
import com.bear.watchonline.watch.service.WatchServiceImpl;

@Controller
public class PageControllerImpl {
	@Resource
	private WatchServiceImpl ws;
	@RequestMapping("/search")
	public String search(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object att = session.getAttribute("watchs");
		List<Watch> list = null;
		if(att==null) {
			list=ws.findAll();
			session.setAttribute("watchs", list);
			
		}else {
			list=(List<Watch>)att;
		}
		String pages=request.getParameter("page");
		Integer dpage=1;
		if(pages!=null) {
			dpage=Integer.parseInt(pages);
		}
		Page page = new Page();
		page.setTotalcount(list.size());
		page.setTotalpage();
		page.setDpage(dpage);
		Integer end = dpage*page.getPagecount();
		if(end>page.getTotalcount()) {
			end = page.getTotalcount();
		}
		List<Watch> subList = list.subList((dpage-1)*page.getPagecount(), end);
		request.getSession().setAttribute("watchList", subList);
		request.getSession().setAttribute("page", page);
		return "redirect:/admin/gallery.jsp";
	}
	
	@RequestMapping("/searchP")
	public String searchP(HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object att = session.getAttribute("watchs");
		List<Watch> list = null;
		if(att==null) {
			list=ws.findAll();
			session.setAttribute("watchs", list);
			
		}else {
			list=(List<Watch>)att;
		}
		String pages=request.getParameter("page");
		Integer dpage=1;
		if(pages!=null) {
			dpage=Integer.parseInt(pages);
		}
		Page page = new Page();
		page.setTotalcount(list.size());
		page.setTotalpage();
		page.setDpage(dpage);
		Integer end = dpage*page.getPagecount();
		if(end>page.getTotalcount()) {
			end = page.getTotalcount();
		}
		List<Watch> subList = list.subList((dpage-1)*page.getPagecount(), end);
		request.getSession().setAttribute("watchList", subList);
		request.getSession().setAttribute("page", page);
		return "redirect:/product/list.jsp";
	}
}
