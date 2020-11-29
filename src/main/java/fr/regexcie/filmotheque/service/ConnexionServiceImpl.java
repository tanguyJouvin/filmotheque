package fr.regexcie.filmotheque.service;

import javax.validation.constraints.Null;

import org.springframework.stereotype.Service;

import fr.regexcie.filmotheque.bo.Membre;
import fr.regexcie.filmotheque.dal.MembreRepository;

/**
 * 
 * @author tanguy
 *
 */
@Service
public class ConnexionServiceImpl implements ConnexionService{
	
	
	private MembreRepository membreDAO;
	
	public ConnexionServiceImpl(MembreRepository membreDAO) {
		this.membreDAO = membreDAO;
	}
	

	/**
	 * méthode de contrôle de l'identité de l'utilisateur en cours de connexion
	 */
	@Override
	public boolean connexion(String login, String mdp) {
		boolean result;
		
		if (membreDAO.findByLoginAndMdp(login, mdp).equals(null))
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
