package tn.enis.laboratoire.io.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@DiscriminatorValue("etd")
public class Etudiant extends Membre implements Serializable{
	
	private static final long serialVersionUID = -3609447092182411775L;
	@Temporal(TemporalType.DATE)
	private Date dateInscription;
	private String sujet;
	private String diplome;
	
	//relation : a un encadrant par d�faut est eager
	@ManyToOne 
	private EnseignantChercheur encadrant;
	
	public EnseignantChercheur getEncadrant() {
		return encadrant;
	}
	public void setEncadrant(EnseignantChercheur encadrant) {
		this.encadrant = encadrant;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public Etudiant() {
		super();
	}
	public Etudiant(String cin, String nom, String prenom, Date dateNaissance, String cv, byte[] photo,
			String email, String password) {
		super(cin, nom, prenom, dateNaissance, cv, photo, email, password);
	}
	public Etudiant(String cin, String nom, String prenom, Date dateNaissance, String cv, byte[] photo, String email,
			String password, Date dateInscription, String sujet, String diplome) {
		super(cin, nom, prenom, dateNaissance, cv, photo, email, password);
		this.dateInscription = dateInscription;
		this.sujet = sujet;
		this.diplome = diplome;
	}
	
	

}
