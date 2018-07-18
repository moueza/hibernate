package services;

import java.util.List;

import org.hibernate.tutorial.hbm.Person;
import org.springframework.beans.factory.annotation.Autowired;

import dao.PersonDAO;

public class PersonneServiceImpl implements PersonService {
	@Autowired
	PersonDAO personDAO;

	// TODO l autre direction presentation collecte

	// public void savePerson(Person personVALUED) {
	/**
	 * normalement, plus besoin de bean a cet endroit car deja introduit à 1 + ht
	 * niveau
	 */
	public void savePerson(Person personn) {
		personDAO.savePerson(personn);
	}

	public Person personAgeMax(List<Person> personsCollection) {
		// TODO Auto-generated method stub
		return null;
	}

}
