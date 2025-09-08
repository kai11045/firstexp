package com.example.introsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping({"/", "/home"})
	public String home(Model model) {
		model.addAttribute("title", "快速信息");
		return "home";
	}

	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "关于我");
		return "about";
	}

	@GetMapping("/projects")
	public String projects(Model model) {
		model.addAttribute("title", "项目作品");
		return "projects";
	}

	@GetMapping("/interests")
	public String interests(Model model) {
		model.addAttribute("title", "兴趣");
		return "interests";
	}

	@GetMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("title", "联系我");
		return "contact";
	}
}