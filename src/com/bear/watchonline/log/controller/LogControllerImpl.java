package com.bear.watchonline.log.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bear.watchonline.entity.Log;
import com.bear.watchonline.log.service.LogServiceImpl;

@Controller
@RequestMapping("/log")
public class LogControllerImpl {
	@Resource
	private LogServiceImpl logServiceImpl;

	@RequestMapping("/La")
	public String list(Model model) {
		List<Log> list = this.logServiceImpl.findAll();
		model.addAttribute("list", list);
		return "list";
	}
}
