package com.bear.watchonline.admin.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bear.watchonline.admin.service.AdminServiceImpl;
import com.bear.watchonline.entity.Admin;

@Controller
public class AdminControllerImpl {
	@Resource
	private AdminServiceImpl adminServiceImpl;
	
	@RequestMapping("/login")
	public String login(String name,String password,HttpServletRequest request) {
		if(adminServiceImpl.findByNamePsd(name, password)) {
			request.getSession().setAttribute("admin", name);
			return "redirect:/admin/index.jsp";//后台页面
		}else {
			String msg = "用户名或密码错误...";
			request.getSession().setAttribute("error",msg);
			String buttonMsg="重新登录";
			request.getSession().setAttribute("button",buttonMsg);
			return "redirect:/admin/404.jsp";
		}
	}
	@RequestMapping("/registration")
	public String registration(String name,String password,String rePassword,Model model) {
		String msg = "注册失败！";
		Admin admin = new Admin();
		if(password.equals(rePassword)){
			admin.setName(name);
			admin.setPassword(password);
			adminServiceImpl.addAdmin(admin);
			return "redirect:/admin/login.jsp";
		}
		model.addAttribute("error",msg);
		return "redirect:/admin/404.jsp";
	}
	
}
