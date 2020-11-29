package fr.regexcie.filmotheque.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.regexcie.filmotheque.bo.Avis;

/**
 * @author valentin
 *
 */
public interface AvisRepository extends JpaRepository<Avis, Long> {

}
