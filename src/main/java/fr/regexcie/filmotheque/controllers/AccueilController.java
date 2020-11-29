package fr.regexcie.filmotheque.controllers;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import fr.regexcie.filmotheque.bo.Categorie;
import fr.regexcie.filmotheque.bo.Film;
import fr.regexcie.filmotheque.bo.Personne;
import fr.regexcie.filmotheque.service.FilmService;

/**
 * 
 * @author tanguy
 *
 */
@Controller
public class AccueilController {
	
	/**
	 * Attributs de classe
	 */
    private FilmService filmService;
    /**
     * Constructeur et injection de dépendance
     * @param filmService
     */
    @Autowired
    public AccueilController(FilmService filmService) {

		this.filmService = filmService;
	}

	/**
	 * Contrôleur 
	 */
    @GetMapping("/film")
    public String listeFilm(Model model){
    	//service de l'acceuil
    	List<Film> films = filmService.afficherListeFilms();
   
        model.addAttribute("films", films);
      
        return "accueil";
    }
    
    @GetMapping("/film/{id}")
    public String detailFilm(Model model, @PathVariable("id") Long id){
    	
    	Film film = new Film();
    	if(id != null) {
    		Optional<Film> optionalFilm = filmService.afficherUnFilm(id);
    		if(optionalFilm.isPresent()) {
    			film = optionalFilm.get();
    		}
    	}

        model.addAttribute("id", id);
        model.addAttribute("film", film);

        return "detail";
    }
    
    @GetMapping("/avis")
    public String avis(Model model){
    	//TODO à finir
        
        return "avis";
    }
    
    @GetMapping("/creation")
    public String creerFilm(Model model){
    	//TODO à finir
        
        return "creation";
    }
    
    @PostMapping("/creation")
    public String modifierFilm(Model model){
    	//TODO à finir
        return "creation";
    }
}