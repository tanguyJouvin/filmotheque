/**
 * 
 */
package fr.regexcie.filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.regexcie.filmotheque.bo.Film;

/**
 * @author tanguy
 *
 */
public interface FilmRepository extends JpaRepository<Film, Long> {

}
