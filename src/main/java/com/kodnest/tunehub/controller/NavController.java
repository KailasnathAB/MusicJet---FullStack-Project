package com.kodnest.tunehub.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class NavController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/registeration")
	public String registeration() {
		return "registeration";
	}
	@GetMapping("/newsong")
	public String newSong() {
		return "newsong";
	}
	@GetMapping("/About")
	public String About() {
		return "About";
	}
	@GetMapping("/Home")
	public String Home() {
		return "login";
	}
	@GetMapping("/Contact")
	public String Contact() {
		return "Contact";
	}
	
	
	
	

}
