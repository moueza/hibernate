package org.hibernate.tutorial.hbm;

public class Person2 {
	Integer id;

	String namee;

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
