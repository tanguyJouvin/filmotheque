package fr.regexcie.filmotheque.controllers;

/**
 * 
 * @author valentin
 *
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.regexcie.filmotheque.bo.Membre;
import fr.regexcie.filmotheque.service.ConnexionService;

@Controller
@SessionAttributes({"membre"})
public class MembreController {
	
	private ConnexionService service;

	public MembreController(ConnexionService service) {
		this.service = service;
	}
	
	@GetMapping({"/", "", "/login"})
	public String login() {
		return "login";
	}
	
	@PostMapping({ "/connexion"})
	public String connexion(Model modele, @RequestParam("login") String login, @RequestParam("mdp") String mdp) {
		
		System.out.println("oui");
		if (service.connexion(login, mdp)){
			
			return "accueil";
		}
		
		return "login";
	}
}
