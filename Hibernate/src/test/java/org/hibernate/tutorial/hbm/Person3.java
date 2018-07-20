package org.hibernate.tutorial.hbm;

import java.util.Date;

public class Person3 {
	private Long id;

	private String title;
	private Date date;
	Integer integ;

	public Integer getInteg() {
		return integ;
	}

	public void setInteg(Integer integ) {
		this.integ = integ;
	}

	public Person3() {
		// this form used by Hibernate
	}

	public Person3(String title, Date date,Integer integg) {
		// for application use, to create new events
		this.title = title;
		this.date = date;
		this.integ=integg;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
