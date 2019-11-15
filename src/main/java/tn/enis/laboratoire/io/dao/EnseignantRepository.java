package tn.enis.laboratoire.io.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enis.laboratoire.io.entities.EnseignantChercheur;

public interface EnseignantRepository extends JpaRepository<EnseignantChercheur, Long> {
	List<EnseignantChercheur> findByGrade(String grade);
	List<EnseignantChercheur> findByEtablissement(String etablissement);
}
