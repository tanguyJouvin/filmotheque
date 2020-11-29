package fr.regexcie.filmotheque;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.regexcie.filmotheque.bo.Avis;
import fr.regexcie.filmotheque.bo.Categorie;
import fr.regexcie.filmotheque.bo.Film;
import fr.regexcie.filmotheque.bo.Membre;
import fr.regexcie.filmotheque.bo.Personne;
import fr.regexcie.filmotheque.dal.AvisRepository;
import fr.regexcie.filmotheque.dal.CategorieRepository;
import fr.regexcie.filmotheque.dal.FilmRepository;
import fr.regexcie.filmotheque.dal.MembreRepository;
import fr.regexcie.filmotheque.dal.PersonneRepository;


/**
 * 
 * @author tanguy
 *
 */
@SpringBootApplication
public class Filmotheque1Application {

	public static void main(String[] args) {
		SpringApplication.run(Filmotheque1Application.class, args);
	}
	
//	@Bean
//	public CommandLineRunner cat(CategorieRepository ct, PersonneRepository p, FilmRepository fm, AvisRepository a, MembreRepository membreDAO) {
//		return (args) -> {
//			
//			Membre alain = new Membre("Denis", "123", false);
//			Membre michel = new Membre("Michel", "456", true);
//			Membre lea = new Membre("Lea", "789", false);
//			System.out.println(alain);
//			
//			membreDAO.save(alain);
//			membreDAO.save(michel);
//			membreDAO.save(lea);
//			System.out.println(michel.toString());
//			
//			a.save(new Avis("On peut être certain que les critiques utiliseront cette période de transition politique américaine...", alain));
//			
//			a.save(new Avis("On n’attendait pas Ron Howard dans ce type de ...", michel));
//			
//			a.save(new Avis(" L'histoire est basée sur des faits réels. On est captivé !", lea));
//
//			
//			Categorie c1 = new Categorie("horreur");
//			Categorie c2 = new Categorie("science fiction");
//			Categorie c3 = new Categorie("romantique");
//			Categorie c4 = new Categorie("policier");
//			Categorie c5 = new Categorie("comédie");
//			 ct.save(c1);
//			 ct.save(c2);
//			 ct.save(c3);
//			 ct.save(c4);
//			 ct.save(c5);
//			 List<Categorie> categories = new ArrayList<>();
//			 System.out.println(categories);
//			 
//			 Personne p1 = new Personne("Gondrit", "Michel", false, true);
//			 Personne p2 = new Personne("Pacino", "Al", true, true);
//			 Personne p3 = new Personne("Phoenix", "Joaquin", true, false);
//			 Personne p4 = new Personne("Gondrit", "Michel", false, true);
//			 Personne p5 = new Personne("Arnold", "Andrea", false, true);
//			 Personne p6 = new Personne("Coppola", "Sofia", true, true);
//			 Personne p7 = new Personne("Knightley ", "Keira", true, false);
//			 Personne p8 = new Personne("Cameron", "James", false, true);
//			 Personne p9 = new Personne("Jeunet", "Jean-Pierre", false, true);
//			 p.save(p1);
//			 p.save(p2);
//			 p.save(p3);
//			 p.save(p4);
//			 p.save(p5);
//			 p.save(p6);
//			 p.save(p7);
//			 p.save(p8);
//			 p.save(p9);
//			 List<Personne> personnes = new ArrayList<>();
//			 
//			 System.out.println(personnes);
//			 Film f1 = new Film("Joker", 2019, 
//		        		"Le film, qui relate une histoire originale inédite sur grand écran, se focalise sur la figure emblématique de l’ennemi juré de Batman.",
//		        		p1, c4);
//			 Film f2 = new Film("Fight Club", 2019, "Le narrateur, sans identité précise, vit seul, travaille seul, dort seul.",
//		        		p5, c2);
//			 Film f3 = new Film("Fast and Furious 5", 2011, "Depuis que Brian et Mia Toretto ont extirpé Dom des mains de la justice, ils ont dû franchir de nombreuses frontières",
//		        		p5, c4);
//			 Film f4 = new Film("Un enfant disparaît", 2020, "Parti faire du skate, Mirco, 10 ans, n'est jamais revenu. D’après un fait divers tragique",
//		        		p4, c3);
//			 Film f5 = new Film("Un long dimanche de fiançailles", 2004, "En 1919, Mathilde a 19 ans. Deux ans plus tôt, son fiancé Manech est parti sur le front de la Somme. Comme des millions d'autres, il est", 
//		        		p8, c2);
//			 Film f6 = new Film("Avatar 2", 2022,  "en cours de tournage",
//		        		p7, c1);
//			 Film f7 = new Film("Skyfall", 2012, 
//		        		"Lorsque la dernière mission de Bond tourne mal, plusieurs agents infiltrés se retrouvent exposés dans le monde entier.",
//		        		p1, c3) ;
//				       fm.save(f1);
//				       fm.save(f2);
//				       fm.save(f3);
//				       fm.save(f4);
//				       fm.save(f5);
//				       fm.save(f6);
//				       fm.save(f7);
//				       
//					 
//			System.out.println(("\nListe des personnes"));
//			System.out.println(("------------"));
//			for(Personne pers: p.findAll()) {
//				System.out.println(pers.toString());
//			}
//			
//			System.out.println(("\nListe des categories"));
//			System.out.println(("------------"));
//			for(Categorie cat: ct.findAll()) {
//				System.out.println(cat.toString());
//			}
//		};
//	}
	
}
	