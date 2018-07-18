package services;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.tutorial.hbm.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonDAOtest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/** from ExemplaJPA imie master Exec2 */
	@Test
	public void testSavePerson() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		Person p = new Person();
		// ("MOUEZA",1978);
		p.setName("MOUEZA");
		p.setBirthYear(1978);
		em.persist(p);

		tx.commit();

		// tx.begin();
		//
		// em.remove(p2);
		// tx.commit();

		// Personne p4 = em.find(Personne.class, 2);
		// System.out.println(p4);
		// p4.setNom("Nouveau");

		// System.out.println("");
		//
		// List<Personne> list = em.createQuery("select p from Personne p order by p.nom
		// asc").getResultList();
		// for (Personne personne : list) {
		// System.out.println(personne);
		//
		// }
		//
		// System.out.println("---------------------------------");
		//
		// System.out.println(p);
		// System.out.println(p2);
		// System.out.println(p3);
		// System.out.println(p4);
		//
		// tx.begin();
		// em.merge(p);
		// tx.commit();
		//
	}

}
