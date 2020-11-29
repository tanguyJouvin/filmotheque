package fr.regexcie.filmotheque.bo;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/**
 * 
 * @author valentin
 *
 */
@Entity
public class Membre implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *ATTRIBUTS DE CLASSE
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	// @NotBlank genere une erreur lors de la sauvegarde en bdd
	private String login;
	private String motDePasse;
	private boolean estAdmin;
	
	/**
	 *CONSTRUCTEURS
	 */
	public Membre(String login, String mdp, boolean estAdmin) {
		this.login = login;
		this.motDePasse = mdp;
		this.estAdmin = estAdmin;
	}

	public Membre() {}

	/**
	 *GETTERS ET SETTERS
	 */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public boolean isEstAdmin() {
		return estAdmin;
	}

	public void setEstAdmin(boolean estAdmin) {
		this.estAdmin = estAdmin;
	}

	@Override
	public String toString() {
		return "Le Membre est [login=" + login + ", motDePasse=" + motDePasse + ", estAdmin=" + estAdmin + "]";
	}
	
}
