package com.virtusa.vrps.controller;


	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;


	@Controller
	public class ModeratorController {		
		
		@RequestMapping(value="/home")
		public String getHome()
		{
			return "home";
		}

	}

