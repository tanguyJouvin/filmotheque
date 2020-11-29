package fr.regexcie.filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.regexcie.filmotheque.bo.Membre;

/**
 * 
 * @author tanguy
 *
 */
public interface MembreRepository extends JpaRepository<Membre, Integer>{

	Membre findByLoginAndMdp(String login, String mdp);

}
