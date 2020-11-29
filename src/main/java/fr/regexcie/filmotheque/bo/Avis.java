package fr.regexcie.filmotheque.bo;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;


/**
 * 
 * @author valentin
 *
 */
@Entity
public class Avis implements Serializable{


	/**
	 *ATTRIBUTS DE CLASSE
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String message;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "avis")
	private List<Film> films;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true, targetEntity = Membre.class)
	@JoinColumn(name="membre_id")
	private Membre membre;
	private static final long serialVersionUID = 1L;
	
	/**
	 * CONSTRUCTEURS
	 */
	public Avis() {}

	public Avis(String message) {

		this.message = message;
	}
	
	public Avis(String message, Membre membre) {
		super();
		this.message = message;
		this.membre = membre;
	}

	
	/**
	 * GETTERS ET SETTERS
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Membre getMembre() {
		return membre;
	}

	public void setMembre(Membre membre) {
		this.membre = membre;
	}

	@Override
	public String toString() {
		return "Avis [message=" + message + ", date=" + "]";
	}

	
}
