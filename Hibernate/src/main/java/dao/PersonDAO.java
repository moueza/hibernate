package dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;

import entities.Person;
import dao.Event;

public class PersonDAO {
	public void PersonDAO() {
		this.eventVALUED1.setDate(new Date());
		this.eventVALUED2.setDate(new Date());
	}

	@Autowired
	Event eventVALUED1;

	@Autowired
	Event eventVALUED2;

	public Event getEvent() {
		return eventVALUED1;
	}

	public void setEvent(Event event) {
		this.eventVALUED1 = event;
	}

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
			// session.save(new Event("Our very first eventVALUED1!", new Date()));
			session.save(this.getEventVALUED1());

			// session.save(new Event("A follow up eventVALUED1", new Date()));
			session.save(this.getEventVALUED2());

			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble
			// building the SessionFactory
			// so destroy it manually.
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}

	public Event getEventVALUED1() {
		return eventVALUED1;
	}

	public void setEventVALUED1(Event eventVALUED1) {
		this.eventVALUED1 = eventVALUED1;
	}

	public Event getEventVALUED2() {
		return eventVALUED2;
	}

	public void setEventVALUED2(Event eventVALUED2) {
		this.eventVALUED2 = eventVALUED2;
	}

	public Person retrievePerson() {
		return null;

	}

	public void savePersonsCollection(List<Person> personsCollection) {

	}

}
