package entities;

import java.io.Serializable;

import  javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Person implements Serializable {
	//:http://www.baeldung.com/hibernate-mappingexception-unknown-entity

	// public void Person(Integer anneeNaissance) {
	//
	// }

	Integer id;

//	Integer anneeNaissance;
	String nom;
//	String prenom;

	public Person() {
	}

//	public Person(String nomm, int anneeNaiss) {
//		nom = nomm;
//		anneeNaissance = anneeNaiss;
//	}

		@Id
	public Integer getId() {
		return id;
	}

//

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Id
	public void setId(Integer id) {
		this.id = id;
	}

	public String printAlea() {
		return "printAlea";
	}
}
