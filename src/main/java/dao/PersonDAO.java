package dao;

import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.hibernate.CallbackException;
import org.hibernate.HibernateException;
import org.hibernate.JDBCException;
import org.hibernate.LazyInitializationException;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.NonUniqueResultException;
import org.hibernate.OptimisticLockException;
import org.hibernate.PersistentObjectException;
import org.hibernate.PropertyAccessException;
import org.hibernate.QueryException;
import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.StaleStateException;
import org.hibernate.TransactionException;
import org.hibernate.TransientObjectException;
import org.hibernate.TypeMismatchException;
import org.hibernate.UnknownProfileException;
import org.hibernate.UnresolvableObjectException;
import org.hibernate.WrongClassException;
import org.hibernate.boot.MappingException;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cache.CacheException;
import org.hibernate.envers.exception.AuditException;
import org.hibernate.jdbc.BatchFailedException;
import org.hibernate.jdbc.TooManyRowsAffectedException;
import org.hibernate.loader.MultipleBagFetchException;
import org.hibernate.procedure.UnknownSqlResultSetMappingException;
import org.hibernate.type.SerializationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.classmate.AnnotationConfiguration;

import entities.Person;
import junit.framework.Test;
import services.HibernateUtil;
import dao.Event;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

//import org.junit.Test;//@Test https://stackoverflow.com/questions/16062910/annotation-type-expected

public class PersonDAO {
	@Autowired
	Event eventVALUED1;

	@Autowired
	Event eventVALUED2;

	/**
	 * 2.4 of
	 * http://docs.jboss.org/hibernate/orm/5.2/quickstart/html_single/#hibernate-gsg-tutorial-basic-config
	 * 
	 * http://www.baeldung.com/hibernate-mappingexception-unknown-entity
	 */
	// @Autowired
	private SessionFactory sessionFactory;

	/**
	 * Define a static logger variable so that it references the Logger instance
	 * named "LoggerMoi".
	 * http://logging.apache.org/log4j/2.x/manual/configuration.html
	 */
	private static final Logger logger = LogManager.getLogger(LoggerMoi.class);

	public void PersonDAO() {
		this.eventVALUED1.setDate(new Date());
		this.eventVALUED2.setDate(new Date());
		logger.trace("PersonDAO");
	}

	public static void main(String[] args) {
		Person p = new Person();
		// p.setNom("Peter");
		// p.setAnneeNaissance(1903);

		PersonDAO personDAO = new PersonDAO();
		personDAO.savePerson(p);
	}

	public Event getEvent() {
		return eventVALUED1;
	}

	public void setEvent(Event event) {
		this.eventVALUED1 = event;
	}

	public void savePerson(Person personn) {
		/**
		 * https://docs.jboss.org/hibernate/orm/5.2/quickstart/html_single<BR>
		 * A SessionFactory is set up once for an application!
		 */
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		// configures settings
		// from
		// hibernate.cfg.xml

		try {
			logger.error("in try");
			System.out.println("lbl7476 start in try");
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
			// MetadataSources ms = new MetadataSources(registry);
			System.out.println("lbl7477 in try");
			// Metadata bm = ms.buildMetadata();

			System.out.println("lbl7478 in try");
			// sessionFactory = bm.buildSessionFactory();
			// sessionFactory = HibernateUtil.getSessionFactory();
			/**
			 * https://stackoverflow.com/questions/14495088/hibernate-properties-not-found
			 */
			// Configuration configuration = new
			// AnnotationConfiguration().configure().buildSessionFactory();
			System.out.println("lbl7480 in try");
			//
			Session session = sessionFactory.openSession();
			System.out.println("lbl7485 in try " + session);

			session.beginTransaction();
			System.out.println("lbl7490 in try");

			// session.save(new Event("Our very first eventVALUED1!", new Date()));
			// session.save(this.getEventVALUED1());
			System.out.println("lbl7495 in try");

			// session.save(new Event("A follow up eventVALUED1", new Date()));
			// session.save(this.getEventVALUED2());
			// session.save(personn);
			System.out.println("lbl7500 in try");

			session.getTransaction().commit();
			System.out.println("lbl7550 in try");

			session.close();
			System.out.println("lbl7600 end in try");

		} catch (AuditException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("AuditException KO");
		} catch (BatchFailedException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("BatchFailedException KO");
		} catch (CacheException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("CacheException KO");
		} catch (CallbackException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("CallbackException KO");
		} catch (JDBCException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("JDBCException KO");
		} catch (MappingException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("MappingException KO");
		} catch (LazyInitializationException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("LazyInitializationException KO");
		} catch (MultipleBagFetchException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("MultipleBagFetchException KO");
		} catch (NonUniqueObjectException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("NonUniqueObjectException KO");
		} catch (NonUniqueResultException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("NonUniqueResultException KO");
		} catch (OptimisticLockException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("OptimisticLockException KO");
		} catch (PersistentObjectException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("PersistentObjectException KO");
		} catch (PropertyAccessException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("PropertyAccessException KO");
		} catch (QueryException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("QueryException KO");
		} catch (SerializationException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("SerializationException KO");
		} catch (SessionException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("SessionException KO");
		} catch (StaleStateException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("StaleStateException KO");
		} catch (TooManyRowsAffectedException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("TooManyRowsAffectedException KO");
		} catch (TransactionException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("TransactionException KO");
		} catch (TransientObjectException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("TransientObjectException KO");
		} catch (TypeMismatchException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("TypeMismatchException KO");
		} catch (UnknownProfileException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("UnknownProfileException KO");
		} catch (UnresolvableObjectException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("UnresolvableObjectException KO");
		}
		// TODO ValidationFailure
		catch (WrongClassException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("WrongClassException KO");
		} catch (HibernateException e) {
			/**
			 * https://docs.jboss.org/hibernate/orm/3.5/api/org/hibernate/HibernateException.html
			 */
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println("HibernateException KO");
		} catch (Exception e) {
			// The registry would be destroyed by the SessionFactory, but we had trouble
			// building the SessionFactory
			// so destroy it manually.
			StandardServiceRegistryBuilder.destroy(registry);

			// System.out.println("savePerson KO");
			logger.error("Exception e savePerson KO");
			/**
			 * https://stackoverflow.com/questions/37896398/java-hibernate-throws-exception-at-boot
			 */
			throw new RuntimeException(e);

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

	/**
	 * http://www.baeldung.com/hibernate-mappingexception-unknown-entity
	 * 
	 * @return
	 */
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		// sessionFactory.setDataSource(restDataSource());
		return sessionFactory;
	}

}
