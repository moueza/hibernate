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
@Entity(name = "Person2")
public class Person2 {
	/**https://stackoverflow.com/questions/16142071/hibernate-ids-for-this-class-must-be-manually-assigned-before-calling-save
	 * 
	 * 170 http://docs.jboss.org/hibernate/orm/5.2/userguide/html_single/Hibernate_User_Guide.html#naturalid-api*/
	@Id
	@Column(name = "`idperson2`")
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	   Integer id;

 @Column(name = "`orderidfk`")
	String namee;

@Column(name = "`birthyear`")
	Integer birthYear;

	public Person2() {
	}

	public Person2(String string) {
		this.namee = string;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
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

	public String printAlea() {
		return "printAlea";
	}
}
