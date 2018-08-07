package org.hibernate.tutorial.hbm;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

/**
 * 56
 * http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#configurations-hbmddl
 */
@Entity(name = "Match2")
public class Match2 {
	/**
	 * https://stackoverflow.com/questions/16142071/hibernate-ids-for-this-class-must-be-manually-assigned-before-calling-save
	 * 
	 * 170
	 * http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#naturalid-api
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;

	@Column(name = "`namee2`")
	String namee2;

	/**http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#associations-many-to-many
	 * @JoinColumn(nullable = false,name="CUSTOMER_ID", referencedColumnName="CUSTOMER_ID")	
https://stackoverflow.com/questions/31811989/jpa-unidirectional-onetomany-fails
	@OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)*/
	@OneToMany(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
	 @JoinColumn(nullable = true,name="idperson2", referencedColumnName="idperson2")	
	Person2 joueur1;
	
	
//	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
//	private List<Person2> joueurs = new ArrayList<Person2>();
	// Person2 personne2;

	public Match2() {
	}

	public Match2(String string) {
		this.namee2 = string;
	}

	public Integer getId() {
		return id;
	}




	public Person2 getJoueur1() {
		return joueur1;
	}

	public void setJoueur1(Person2 joueur1) {
		this.joueur1 = joueur1;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNamee2() {
		return namee2;
	}

	public void setNamee2(String namee2) {
		this.namee2 = namee2;
	}

}
