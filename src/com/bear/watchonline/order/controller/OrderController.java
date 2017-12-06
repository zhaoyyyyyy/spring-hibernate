package com.bear.watchonline.order.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bear.watchonline.entity.Order;
import com.bear.watchonline.entity.UserLogin;
import com.bear.watchonline.order.service.OrderServiceImpl;
import com.bear.watchonline.user.service.UserServiceImpl;
@Controller
public class OrderController {
	@Resource
	private OrderServiceImpl os;
	@Resource
	private UserServiceImpl us;
	
	@RequestMapping("/getOrders")
	public String getOrders(HttpServletRequest request,String loginName) {
		UserLogin user = us.getUserById(loginName);
		List<Order> list = os.getOrderByUserid(loginName);
		request.getSession().setAttribute("orderList", list);
		request.getSession().setAttribute("user", user);
		request.getSession().setAttribute("size", list.size());
		return "redirect:/admin/order.jsp";
	}
}
