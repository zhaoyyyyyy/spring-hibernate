package com.bear.watchonline.watchType.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bear.watchonline.entity.WatchType;
import com.bear.watchonline.watchType.service.WatchTypeServiceImpl;

@Controller
@RequestMapping("/watchType")
public class WatchTypeControllerImpl {
	@Resource
	private WatchTypeServiceImpl watchTypeServiceImpl;

	@RequestMapping("/getWatchTypes")
	public String getWatchTypes(HttpServletRequest request) {
		List<WatchType> list = watchTypeServiceImpl.findAll();
		request.getSession().setAttribute("typeList",list);//
		return "redirect:/admin/addWatch.jsp";
	}
	@RequestMapping("/addWatchType")
	public String addWatchType(HttpServletRequest request,int typeId,String typeName) {
		String msg="类型添加成功！";
		request.getSession().setAttribute("msg", msg);
		WatchType wt = new WatchType();
		wt.setTypeId(typeId);
		wt.setTypeName(typeName);
		
		//wt.setTypeId(request.getParameter("typeId"));
		//wt.setTypeName(request.getParameter("typeName"));//
		watchTypeServiceImpl.addWatchType(wt);
		return "redirect:/admin/success.jsp";
	}
}
