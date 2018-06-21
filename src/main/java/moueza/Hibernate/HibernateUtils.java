package moueza.Hibernate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.cfg.AnnotationConfiguration;/**https://www.mkyong.com/hibernate/hibernate-the-type-annotationconfiguration-is-deprecated/*/
import org.hibernate.cfg.Configuration;

/**https://www.mistra.fr/tutoriel-hibernate-creation-manipulation-entites-jpa/tutoriel-hibernate-contexte-persistance-sessions.html*/
public class HibernateUtils {
	private static final SessionFactory sessionFactory;

	// Crée une unique instance de la SessionFactory à partir de hibernate.cfg.xml
	static {
		try {
			// sessionFactory = new
			// AnnotationConfiguration().configure().buildSessionFactory();
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (HibernateException ex) {
			throw new RuntimeException("Problème de configuration : " + ex.getMessage(), ex);
		}
	}

	// Renvoie une session Hibernate
	public static Session getSession() throws HibernateException {
		return sessionFactory.openSession();
	}
}