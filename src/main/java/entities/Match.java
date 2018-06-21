package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Match {
	@Id
	Integer id;
	Person personne;
	String lieu;
	// heure
	public Person getPersonne() {
		return personne;
	}
	public void setPersonne(Person personne) {
		this.personne = personne;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
}
