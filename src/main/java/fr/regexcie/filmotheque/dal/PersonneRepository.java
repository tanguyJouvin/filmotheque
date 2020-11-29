/**
 * 
 */
package fr.regexcie.filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.regexcie.filmotheque.bo.Personne;

/**
 * @author tanguy
 *
 */
public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
