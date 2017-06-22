package com.migs.cosmodemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by migc on 5/24/17.
 */

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(){
		return "home";
	}

}
