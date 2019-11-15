package tn.enis.laboratoire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import tn.enis.laboratoire.io.entities.EnseignantChercheur;
import tn.enis.laboratoire.io.entities.Membre;
import tn.enis.laboratoire.service.IMemberService;

@RestController
@CrossOrigin
public class MemberRestController {
	
	@Autowired
	IMemberService memberService;
	
	@GetMapping(value="/members")
	public List<Membre> findMembers() {
//		Membre membre = new Etudiant();
//		membre.setNom("Salem");
//		ArrayList<Membre> list = new ArrayList<Membre>();
//		list.add(membre);
//		return list;
		return memberService.findAll();
	}
	
	@GetMapping(value="/member/{id}")
	public Membre findOneMemberById(@PathVariable Long id) {
		return memberService.findMember(id);
	}
	
	@PostMapping(value="/member/enseignant")
	public Membre addMembre(@RequestBody EnseignantChercheur enseignantChercheur)
	{
		return memberService.addMember(enseignantChercheur);
	}
	
	@PutMapping(value="/member/enseignant/{id}")
	public Membre updateMembre(@RequestBody EnseignantChercheur enseignantChercheur, @PathVariable Long id)
	{
		enseignantChercheur.setId(id);
		return memberService.updateMember(enseignantChercheur);
	}
	
	@DeleteMapping(value="/member/{id}")
	public void deleteMember(@PathVariable Long id)
	{
		memberService.deleteMember(id);
	}
}
