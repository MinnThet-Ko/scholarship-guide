package com.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = {"/"})
public class HomeController {

	@RequestMapping(method = RequestMethod.GET)
	public String dispatchHome() {
		return "home";
	}
}
