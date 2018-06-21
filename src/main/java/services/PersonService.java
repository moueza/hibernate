package services;

import java.util.List;

import entities.Person;

public interface PersonService {
	public void savePerson(Person personn);

	public Person personAgeMax(List<Person> personsCollection);
}
