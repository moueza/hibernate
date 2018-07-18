package services;

import java.util.List;

import org.hibernate.tutorial.hbm.Person;

public interface PersonService {
	public void savePerson(Person personn);

	public Person personAgeMax(List<Person> personsCollection);
}
