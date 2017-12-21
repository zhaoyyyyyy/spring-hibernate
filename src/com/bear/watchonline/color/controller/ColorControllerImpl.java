package com.bear.watchonline.color.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bear.watchonline.color.service.ColorServiceImpl;
import com.bear.watchonline.entity.Color;

@Controller
@RequestMapping("/color")
public class ColorControllerImpl {
	@Resource
	private ColorServiceImpl colorServiceImpl;

	@RequestMapping("/Ca")
	public String list(Model model) {
		List<Color> list = this.colorServiceImpl.findAll();
		model.addAttribute("list", list);
		return "list";
	}
}
