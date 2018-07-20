package org.hibernate.tutorial.hbm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 56
 * http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#configurations-hbmddl
 */
@Entity(name = "Match")
public class Match {
	/**https://stackoverflow.com/questions/16142071/hibernate-ids-for-this-class-must-be-manually-assigned-before-calling-save
	 * 
	 * 170 http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#naturalid-api*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	   Integer id;

	 @Column(name = "namee")
	String namee;

	
	public Match() {
	}

	public Match(String string) {
		this.namee = string;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNamee() {
		return namee;
	}

	public void setNamee(String namee) {
		this.namee = namee;
	}



}
