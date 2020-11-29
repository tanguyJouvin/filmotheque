package fr.regexcie.filmotheque.bo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

/**
 * @author tanguy
 */
@Entity
public class Film implements Serializable{

	/**
	 *ATTRIBUTS DE CLASSE
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String titre;
	private int annee;
	private String description;
	

	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinColumn(name="personne_id")
	private Personne realisateur;
	
	//relation unidirectionnelle
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(
			name= "film_acteur",
			joinColumns = @JoinColumn(name="film_id"),
			inverseJoinColumns = @JoinColumn(name="personne_id")
			)
	private List<Personne> acteurs;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true, targetEntity = Categorie.class)
	@JoinColumn(name= "category_id")
	private Categorie categorie;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true, targetEntity = Avis.class)
	@JoinColumn(name= "avis_id")
	private List<Avis> avis;
	
	
	/**
	 * CONSTRUCTEURS
	 */
	public Film() {}


	public Film(String titre, int annee, String description, Personne realisateur, List<Personne> acteurs,
			Categorie categorie, List<Avis> avis) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.description = description;
		this.realisateur = realisateur;
		this.acteurs = acteurs;
		this.categorie = categorie;
		this.avis = avis;
	}
	
	public Film(String titre, int annee, String description, Personne realisateur, List<Personne> acteurs,
			Categorie categorie) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.description = description;
		this.realisateur = realisateur;
		this.acteurs = acteurs;
		this.categorie = categorie;
	}


	public Film(@NotBlank String titre, int annee, String description, Personne realisateur,
			Categorie categorie) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.description = description;
		this.realisateur = realisateur;
		this.categorie = categorie;
	}

	public Long getId() {

		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public int getAnnee() {
		return annee;
	}


	public void setAnnee(int annee) {
		this.annee = annee;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Personne getRealisateur() {
		return realisateur;
	}


	public void setRealisateur(Personne realisateur) {
		this.realisateur = realisateur;
	}


	public List<Personne> getActeurs() {
		return acteurs;
	}


	public void setActeurs(List<Personne> acteurs) {
		this.acteurs = acteurs;
	}


	public Categorie getCategorie() {
		return categorie;
	}


	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}


	public List<Avis> getAvis() {
		return avis;
	}


	public void setAvis(List<Avis> avis) {
		this.avis = avis;
	}


	@Override
	public String toString() {
		return "Film [id=" + id + ", titre=" + titre + ", annee=" + annee + ", description=" + description
				+ ", realisateur=" + realisateur + ", acteurs=" + acteurs + ", categories=" + categorie + ", avis="
				+ avis + "]";
	}

}

