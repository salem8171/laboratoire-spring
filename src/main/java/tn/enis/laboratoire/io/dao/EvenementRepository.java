package tn.enis.laboratoire.io.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.enis.laboratoire.io.entities.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {

}
