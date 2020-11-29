package fr.regexcie.filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.regexcie.filmotheque.bo.Membre;

/**
 * 
 * @author valentin
 *
 */
public interface MembreRepository extends JpaRepository<Membre, Integer>{

	Membre findByLoginAndMotDePasse(String login, String mdp);

}
