package com.sip.ams.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HomeController {
	@PostMapping("/result")
	@ResponseBody
	public String resultat(@RequestParam("nom") String n, @RequestParam("nom") String e)
	{
	return "vous avez taper deux fois :"+n+"un email "+e;
}
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
