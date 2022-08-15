package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/")
public class HomeController {
	ModelAndView mv = new ModelAndView();

	@GetMapping("/")
	public ModelAndView home() {
		mv.setViewName("/layout");
		return mv;
	}
}
