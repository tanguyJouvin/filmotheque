package fr.regexcie.filmotheque.controllers;

/**
 * 
 * @author tanguy
 *
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@GetMapping({"/", "", "/connexion"})
	public String connexion(Model model) {
		
		return "connexion";
	}
	
	@PostMapping("/connexion")
	public String connexionOk(@RequestParam String login,
			@RequestParam String mdp,
	//@ModelAttribute Membre membre, 
			Model model) {
		
		
		System.out.println("model " + model);
		
		if (service.connexion(login,mdp)){
			
			return "redirect:/film";
		}
		
		return "connexion";
	}
}
