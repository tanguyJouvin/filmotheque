package fr.regexcie.filmotheque.service;

import java.util.List;
import java.util.Optional;

import fr.regexcie.filmotheque.bo.Film;

/**
 * @author tanguy
 * 
 */
public interface FilmService {
	
	List<Film> afficherListeFilms();
	
	void creerFilm(Film film);
	
	void modifierFilm(Film film);
	
	void supprimerFilm();

	Optional<Film> afficherUnFilm(Long id);
}
