package com.gcnto.artgallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcnto.artgallery.dao.ArtDAO;
import com.gcnto.artgallery.entity.Art;

@Controller
@RequestMapping("/gallery")
public class HomeController {

	@Autowired
	private ArtDAO artDAO;
	
	@GetMapping("/home")
	public String getHome(Model model) {
		
		List<Art> artList = artDAO.accessArtList();
		
		model.addAttribute("artList", artList);

		return "home";
	}
	
}
