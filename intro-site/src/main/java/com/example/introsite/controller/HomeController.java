package com.example.introsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping({"/", "/home"})
	public String home(Model model) {
		model.addAttribute("title", "欢迎来到我的个人网站");
		model.addAttribute("tagline", "一名热爱代码与设计的开发者");
		return "home";
	}

	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "关于我");
		model.addAttribute("bio", "你好，我是某某。专注于 Java/前端/系统设计，喜欢分享与学习。");
		return "about";
	}

	@GetMapping("/projects")
	public String projects(Model model) {
		model.addAttribute("title", "项目作品");
		return "projects";
	}

	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("title", "联系我");
		return "contact";
	}
}