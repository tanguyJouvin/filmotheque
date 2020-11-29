package fr.regexcie.filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.regexcie.filmotheque.bo.Categorie;

/**
 * 
 * @author tanguy
 *
 */
public interface CategorieRepository extends JpaRepository<Categorie, Long>{

}
