package fr.regexcie.filmotheque.bo;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/**
 * 
 * @author tanguy
 *
 */
@Entity
public class Membre implements Serializable{

	/**
	 *ATTRIBUTS DE CLASSE
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String login;
	private String mdp;
	private boolean estAdmin;
	
	/**
	 *CONSTRUCTEURS
	 */
	public Membre() {}
	
	public Membre(@NotBlank String login, String mdp, boolean estAdmin) {
		super();
		this.login = login;
		this.mdp = mdp;
		this.estAdmin = estAdmin;
	}

	public Membre(Long id, @NotBlank String login, String mdp, boolean estAdmin) {
		super();
		this.id = id;
		this.login = login;
		this.mdp = mdp;
		this.estAdmin = estAdmin;
	}

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

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public boolean isEstAdmin() {
		return estAdmin;
	}

	public void setEstAdmin(boolean estAdmin) {
		this.estAdmin = estAdmin;
	}

	@Override
	public String toString() {
		return "Membre [id=" + id + ", login=" + login + ", mdp=" + mdp + ", estAdmin=" + estAdmin + "]";
	}

}
