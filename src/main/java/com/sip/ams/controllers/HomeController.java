package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@RequestMapping("/information")//url
	public String info()
	{  System.out.println("okkkk")
		return"home/info";
	}

	
	@RequestMapping("/affichage")
	public String affiche()
	{    System.out.println("methode affichage")
		return"home/affichage";
	}
}
