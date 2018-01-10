package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.PersonDAO;
import entities.Person;

public class PersonneServiceImpl implements PersonService {
	@Autowired
	PersonDAO personDAO;

	//TODO l autre direction presentation collecte
	
	public void savePerson(Person personVALUED) {
	
	}

	public Person personAgeMax(List<Person> personsCollection) {
		// TODO Auto-generated method stub
		return null;
	}

}
