package org.hibernate.tutorial.hbm;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;

import org.hibernate.MappingException;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.PersonDAO;
import entities.Person;

public class PersonDAOtest {

	// PersonDAO
	@Autowired
	private SessionFactory sessionFactory;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	/*** http://www.baeldung.com/hibernate-mappingexception-unknown-entity */
	@Test(expected = MappingException.class)
	@Transactional
	public void givenEntityIsPersisted_thenException() {
		// sessionFactory.getCurrentSession().saveOrUpdate(new Person());
	}

	@Test()
	@Transactional
	public void personDAOtest() {
		// sessionFactory.getCurrentSession().saveOrUpdate(new Person());
		PersonDAO pd = new PersonDAO();
		assertNotNull(pd);
	}

	
//	@Transactional
	@Test()
	public void savePersonTest() {
		Person p = new Person();
		p.setNom("Peter");
		p.setAnneeNaissance(1903);
		PersonDAO pd = new PersonDAO();
		pd.savePerson(p);
	}
}
