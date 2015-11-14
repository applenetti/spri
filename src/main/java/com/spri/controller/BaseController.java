package com.spri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sprit.config.HibernateConfig;

@Controller
public class BaseController {
	@RequestMapping("/test")
	public String helloWorld(Model model) {
		HibernateConfig.getSessionFactory();
		model.addAttribute("test", "test");
		return "jsonTemplate";
	}
}
