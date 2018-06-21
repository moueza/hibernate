package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Person {

	// public void Person(Integer anneeNaissance) {
	//
	// }

	Integer id;

	Integer anneeNaissance;
	String nom;
	String prenom;

	public Person() {
	}

	public Person(String nomm, int anneeNaiss) {
		nom = nomm;
		anneeNaissance = anneeNaiss;
	}

	public Integer getAnneeNaissance() {
		return anneeNaissance;
	}

	@Id
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setAnneeNaissance(Integer anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String printAlea() {
		return "printAlea";
	}
}
