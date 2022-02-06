package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
	@RequestMapping("/information")//url
	public String info(Model model)
	
	{  
	
	String formation = "Fullstack";
		System.out.println("okkkk");
		model.addAttribute("workshop",formation);
		ArrayList<String> tab =new ArrayList<String> ();
		tab.add("OCA");
		tab.add("OCP");
		tab.add("Spring") ; 
		tab.add("Angular");
		model.addAttribute("tab",tab);
		return"home/info";
	}

	
	private void add(String string) {
		// TODO Auto-generated method stub
		
	}


	@RequestMapping("/affichage")
	public String affiche()
	{    System.out.println("methode affichage");
		return"home/affichage";
	}
}
