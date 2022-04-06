package fr.univrouen.rss22.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RSSController {
	@GetMapping("/resume")
	public String getListRSSinXML() {
		return "Envoi de la liste des flux RSS";
	}
	
	@GetMapping("/guid")
	public String getRSSinXML(
		@RequestParam(value = "guid") String texte) {
		return ("Détail du flux RSS demandé : " + texte);
	}
	
	@GetMapping("/test")
	public String getRSSTest(
		@RequestParam(value = "nb") int guid, 
		@RequestParam(value = "search") String titre) {
		String newligne = System.getProperty("line.separator");
		return ("Test :" + newligne +
				"guid = " + guid + newligne +
				"titre = " + titre);
	}
}
