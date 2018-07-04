package org.hibernate.tutorial.hbm;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.MappingException;
import org.junit.After;
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

	/**
	 * https://docs.jboss.org/hibernate/orm/5.2/quickstart/html_single/#tutorial-native
	 */
	@Before
	public void setUp() throws Exception {

		// A SessionFactory is set up once for an application!
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings
																									// from
																									// hibernate.cfg.xml
				.build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble
			// building the SessionFactory
			// so destroy it manually.
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	@After
	public void tearDown() throws Exception {
	}


	/*** http://www.baeldung.com/hibernate-mappingexception-unknown-entity */
//	@Test(expected = MappingException.class)
	@Transactional
	public void givenEntityIsPersisted_thenException() {
		// sessionFactory.getCurrentSession().saveOrUpdate(new Person());
	}

//	@Test()
	@Transactional
	public void personDAOtest() {
		// sessionFactory.getCurrentSession().saveOrUpdate(new Person());
		PersonDAO pd = new PersonDAO();
		assertNotNull(pd);
	}

	 @Transactional
	@Test()
	public void savePersonTest() {
		Person p = new Person();
	//	p.setNom("Peter");
		//p.setAnneeNaissance(1903);
		PersonDAO pd = new PersonDAO();
		pd.savePerson(p);
	}
}
