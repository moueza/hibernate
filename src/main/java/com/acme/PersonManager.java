package com.acme;

/**
 * Renaming Acegi Security to Spring Security
 * https://spring.io/blog/2007/01/25/why-the-name-acegi TODO bean Entity
 */
public class PersonManager {
	Integer cpt;

	public Integer getCpt() {
		return cpt;
	}

	public void setCpt(Integer cpt) {
		this.cpt = cpt;
	}

	public String printt() {
		return "in PersonManager bean";
	}
}
