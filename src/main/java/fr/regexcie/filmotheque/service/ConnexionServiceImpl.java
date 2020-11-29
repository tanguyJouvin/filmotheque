package fr.regexcie.filmotheque.service;

import javax.validation.constraints.Null;

import org.springframework.stereotype.Service;

import fr.regexcie.filmotheque.bo.Membre;
import fr.regexcie.filmotheque.dal.MembreRepository;

/**
 * 
 * @author valentin
 *
 */
@Service
public class ConnexionServiceImpl implements ConnexionService{
	
	
	private MembreRepository membreDAO;
	
	public ConnexionServiceImpl(MembreRepository membreDAO) {
		this.membreDAO = membreDAO;
	}
	
	/**
	 * @author Valentin
	 * @return Membre
	 * @param String login, String mdp
	 * Verifie si les login et mot de passe correspondent à un membre
	 */
	@Override
	public boolean connexion(String login, String mdp) {
		boolean result;
		
		if (membreDAO.findByLoginAndMotDePasse(login, mdp).equals(null))
		{
			result = false;
		}
		else 
		{
			result = true;
		}
		
		return result;
	}

}
