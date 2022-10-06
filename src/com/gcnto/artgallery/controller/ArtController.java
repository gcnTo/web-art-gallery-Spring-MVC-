package com.gcnto.artgallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcnto.artgallery.dao.ArtDAO;
import com.gcnto.artgallery.entity.Art;

@Controller
@RequestMapping("/gallery")
public class ArtController {
	
	@Autowired
	private ArtDAO artDAO;
	
	@GetMapping("/art/{title}")
	public String accessArt(Model model, @PathVariable String title) {
		
		List<Art> artList = artDAO.accessArtList();
		
		for (Art art : artList) {

			if (title.equals(art.getTitle())) {	
				model.addAttribute("art", art);
			}	
		}

		return "art";
		
	}

}
