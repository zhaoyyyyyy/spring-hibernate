package com.bear.watchonline.user.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bear.watchonline.entity.UserInfo;
import com.bear.watchonline.entity.UserLogin;
import com.bear.watchonline.user.service.UserServiceImpl;


@Controller
public class UserController {
	@Resource
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("/regist")
	public String regist(String loginName,String password1,String password2,String realName,
			String sex,String age,Model model) {
		String msg="注册失败！";
		UserLogin ul= new UserLogin(loginName,password1);
		UserInfo ui=new UserInfo();
		if(password1.equals(password2)) {
			ui.setLoginName(loginName);
			ui.setPassword(password1);
			ui.setRealName(realName);
			ui.setSex(sex);
			ui.setAge(age);
			
			ul.setLoginName(loginName);
			ul.setPassword(password1);
			
			ui.setUserLogin(ul);
			ul.setUserInfo(ui);
			
			userServiceImpl.regist(ui);
			userServiceImpl.registU(ul);
			return "redirect:/product/login.jsp";
		}
		model.addAttribute("error",msg);
		return "redirect:/admin/404.jsp";
		
		//ul.setUserInfo(ui);
	}
	@RequestMapping("Ulogin")
	public String login(String loginName,String password,HttpServletRequest request) {
		if(userServiceImpl.findById(loginName,password)) {
			request.getSession().setAttribute("userLogin", loginName);
			return "redirect:/product/index.html";//前台的商品页面
		}else {
			String msg = "用户名或密码错误...";
			request.getSession().setAttribute("error",msg);
			String buttonMsg="重新登录";
			request.getSession().setAttribute("button",buttonMsg);
			return "redirect:/admin/404.jsp";
		}
	}
	
	@RequestMapping("/getUsers")
	public String getUsers(HttpServletRequest request) {
		List<UserLogin> list = userServiceImpl.findAll();
		request.getSession().setAttribute("list", list);
		return "redirect:/admin/users.jsp";
	}
	@RequestMapping("/deleteUser")
	public String deleteUser(HttpServletRequest request,String loginName) {
		String msg = "删除用户成功！";
		request.getSession().setAttribute("msg", msg);
		userServiceImpl.deleteUser(loginName);
		return "redirect:/admin/success.jsp";
	}
}
