package dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Person;

public class PersonDAO {
	public void savePerson(Person personn) {
		// https://docs.jboss.org/hibernate/orm/5.2/quickstart/html_single/
		// A SessionFactory is set up once for an application!
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure() // configures settings
																									// from
																									// hibernate.cfg.xml
				.build();
		try {
			SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(new Event("Our very first event!", new Date()));
			session.save(new Event("A follow up event", new Date()));
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble
			// building the SessionFactory
			// so destroy it manually.
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	public Person retrievePerson() {
		return null;

	}

	public void savePersonsCollection(List<Person> personsCollection) {

	}

}
