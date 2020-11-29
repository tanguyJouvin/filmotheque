package fr.regexcie.filmotheque.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import fr.regexcie.filmotheque.bo.Film;
import fr.regexcie.filmotheque.dal.FilmRepository;


/**
 * 
 * @author tanguy
 *
 */
@Service
public class FilmServiceImpl implements FilmService{

	private FilmRepository repo;
	
	//injection de dépendance par constructeur
	public FilmServiceImpl(FilmRepository repo) { this.repo = repo; }

	@Override
	public List<Film> afficherListeFilms() {
	
		return repo.findAll();
	}

	/**
	 * méthode pour afficher un film
	 * @param film
	 * @return
	 */

	@Override
	public Optional<Film> afficherUnFilm(Long id) {

		return repo.findById(id);
	}

	@Override
	public void creerFilm(Film film) {
		repo.save(film);
		
	}

	@Override
	public void modifierFilm(Film film) {
	//TODO à finir
		
	}

	@Override
	public void supprimerFilm() {
		//TODO à finir
		
	}

	
}
