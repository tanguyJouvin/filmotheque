package fr.regexcie.filmotheque.bo;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author tanguy
 *
 */
@Entity
public class Personne implements Serializable{

	/**
	 * default uuid
	 */
	private static final long serialVersionUID = 1L;
	/**
	 *ATTRIBUTS DE CLASSE
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private boolean estActeur;
	private boolean estRealisateur;
	

	/**
	 *CONSTRUCTEURS
	 */
	public Personne() {}
	
	public Personne(String nom, String prenom, boolean estActeur, boolean estRealisateur) {

		this.nom = nom;
		this.prenom = prenom;
		this.estActeur = estActeur;
		this.estRealisateur = estRealisateur;
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public boolean isEstActeur() {
		return estActeur;
	}

	public void setEstActeur(boolean estActeur) {
		this.estActeur = estActeur;
	}

	public boolean isEstRealisateur() {
		return estRealisateur;
	}

	public void setEstRealisateur(boolean estRealisateur) {
		this.estRealisateur = estRealisateur;
	}


	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", estActeur=" + estActeur
				+ ", estRealisateur=" + estRealisateur + "]";
	}

	
}
