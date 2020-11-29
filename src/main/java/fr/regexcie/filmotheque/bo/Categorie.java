package fr.regexcie.filmotheque.bo;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

/**
 * @author tanguy
 */
@Entity
public class Categorie implements Serializable {

	
	/**
	 *ATTRIBUTS DE CLASSE
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String libelle;
	private static final long serialVersionUID = 1L;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categorie")
	private List<Film> films;
	/**
	 *CONSTRUCTEURS
	 */
	public Categorie() {}
	
	/**
	 *GETTERS ET SETTERS
	 */
	public Categorie(String libelle) {
		this.libelle = libelle;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
		
}
