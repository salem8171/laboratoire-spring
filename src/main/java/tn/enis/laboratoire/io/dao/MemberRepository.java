package tn.enis.laboratoire.io.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enis.laboratoire.io.entities.Membre;

public interface MemberRepository extends JpaRepository<Membre, Long> {
	Membre findByCin(String cin);
	List<Membre> findByNomStartingWith(String caractere);
	Membre findByEmail(String email);
}
