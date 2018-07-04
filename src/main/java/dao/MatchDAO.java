package dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

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
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.classmate.AnnotationConfiguration;

import entities.Match;
import entities.Person;
import services.HibernateUtil;
import dao.Event;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class MatchDAO {

	/** JPA */
	public SessionFactory sf;

	public void saveMatch(Match match) {

	}

	public Session getSession() {
		return getSessionFactory().openSession();
	}

	private SessionFactory getSessionFactory() {
		if (sf == null) {
			Bundle thisBundle = FrameworkUtil.getBundle(HibernateUtil.class);
			// Could get this by wiring up OsgiTestBundleActivator as well.
			BundleContext context = thisBundle.getBundleContext();

			ServiceReference sr = context.getServiceReference(SessionFactory.class.getName());
			sf = (SessionFactory) context.getService(sr);
		}
		return sf;
	}

	public static void main(String[] args) {
		MatchDAO m = new MatchDAO();
		// example11
		// http://docs.jboss.org/hibernate/orm/5.2/quickstart/html_single/#hibernate-gsg-tutorial-jpa-test
		m.sf = (SessionFactory) Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

		/**
		 * Ex12
		 * http://docs.jboss.org/hibernate/orm/5.2/quickstart/html_single/#hibernate-gsg-tutorial-jpa-test
		 */
		EntityManager entityManager = m.sf.createEntityManager();
		entityManager.getTransaction().begin();

		// Person p = new Person("MOUEZA", 1903);
		Person p = new Person();
		//p.setNom("MOUEZA");
		//p.setAnneeNaissance(1903);

		Match match = new Match();
		entityManager.persist(match);

		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
