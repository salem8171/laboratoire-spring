package tn.enis.laboratoire.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enis.laboratoire.io.dao.EnseignantRepository;
import tn.enis.laboratoire.io.dao.EtudiantRepository;
import tn.enis.laboratoire.io.dao.MemberRepository;
import tn.enis.laboratoire.io.entities.EnseignantChercheur;
import tn.enis.laboratoire.io.entities.Etudiant;
import tn.enis.laboratoire.io.entities.Membre;

@Service
public class MemberImpl implements IMemberService {
	
	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	EtudiantRepository etudiantRepository;
	
	@Autowired
	EnseignantRepository enseignantRepository;

	@Override
	public Membre addMember(Membre m) {
		memberRepository.save(m);
		return m;
	}

	@Override
	public void deleteMember(Long id) {
		memberRepository.deleteById(id);		
	}

	@Override
	public Membre updateMember(Membre p) {
		memberRepository.saveAndFlush(p);
		return p;
	}

	@Override
	public Membre findMember(Long id) {
		return memberRepository.findById(id).get();
	}

	@Override
	public List<Membre> findAll() {
		return memberRepository.findAll();
	}

	@Override
	public Membre findByCin(String cin) {
		return memberRepository.findByCin(cin);
	}

	@Override
	public Membre findByEmail(String email) {
		return memberRepository.findByEmail(email);
	}

	@Override
	public List<Membre> findByNom(String nom) {
		return memberRepository.findByNomStartingWith(nom);
	}

	@Override
	public List<Etudiant> findByDiplome(String diplome) {
		return etudiantRepository.findByDiplome(diplome);
	}

	@Override
	public List<EnseignantChercheur> findByGrade(String grade) {
		return enseignantRepository.findByGrade(grade);
	}

	@Override
	public List<EnseignantChercheur> findByEtablissement(String etablissement) {
		return enseignantRepository.findByEtablissement(etablissement);
	}
	
	
}
