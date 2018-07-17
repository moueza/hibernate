package entities;

public class Person {
	

	// public void Person(Integer age) {
	//
	// }
	String name;
	Integer birthYear;
	Integer age;

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
