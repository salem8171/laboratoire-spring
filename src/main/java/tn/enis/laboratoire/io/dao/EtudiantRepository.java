package tn.enis.laboratoire.io.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enis.laboratoire.io.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {
	List<Etudiant> findByDiplome(String diplome);
}
