package tn.enis.laboratoire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.enis.laboratoire.io.dao.RoleRepository;
import tn.enis.laboratoire.service.IMemberService;

@SpringBootApplication
public class LaboratoireApplication implements CommandLineRunner {
	
	@Autowired
	IMemberService memberService;
	
	@Autowired
	RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(LaboratoireApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
//		Membre member = new Etudiant(11, "salem", "krichen", new Date(), "cv", "photo", "email", "dateInscri", dateInscription, sujet, diplome)
//		memberService.addMember(membre);
		
//		Role r1 = new Role("admin");
//		Role r2 = new Role("user");
//		roleRepository.save(r1);
//		roleRepository.save(r2);
//		
//		Collection<Role> lst1 = new ArrayList<Role>();
//		lst1.add(r1);
//
//		Collection<Role> lst2 = new ArrayList<Role>();
//		lst2.add(r2);
//
//		// Ajout d'un membre enseignant chercheur ayant le role admin
//
//		EnseignantChercheur ens1 = new EnseignantChercheur("01752354", "Jmaiel", "Mohamed", new Date(), "", null,
//				"jmaiel@enis.tn", "0000");
//		ens1.setRoles(lst1);
//		memberService.addMember(ens1);
//
//		// Ajout d'un membre enseignant chercheur ayant le role user
//		EnseignantChercheur ens2 = new EnseignantChercheur("01752354", "mariam", "lahami", new Date(), "", null,
//				"lahami@enis.tn", "2222");
//		ens1.setRoles(lst2);
//		memberService.addMember(ens2);
//
//		// ajout de 3 �tudiants 1 mast�re et 2 th�se ayant le role user
//		Etudiant etd1 = new Etudiant("081705454", "ben fekih", "rim", new Date(), "", null, "rim@enis.rn", "11111",
//				null, "test", "these");
//		Etudiant etd2 = new Etudiant("885705454", "ben ahmed", "sana", new Date(), "", null, "sana@enis.rn",
//				"11111", null, "test", "mastere");
//		Etudiant etd3 = new Etudiant("081454", "chaari", "rim", new Date(), "", null, "chaari@enis.rn", "11111",
//				null, "test", "these");
//		etd1.setRoles(lst2);
//		etd2.setRoles(lst2);
//		etd3.setRoles(lst2);
//		// ens1 est l'encadrant de etd1
//		etd1.setEncadrant(ens1);
//		// ens2 est l'encadrant de etd2
//		etd2.setEncadrant(ens2);
//
//		memberService.addMember(etd1);
//		memberService.addMember(etd2);
//		memberService.addMember(etd3);
	}

}
