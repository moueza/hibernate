package org.hibernate.tutorial.hbm;

public class Person2 {
	Integer id;

	// public void Person(Integer age) {
	//
	// }
	String name;
	Integer birthYear;
	Integer age;

	public Person2(String string) {
		this.name = string;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String printAlea() {
		return "printAlea";
	}
}
