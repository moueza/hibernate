package myPack;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entities.Phone;
import entities.PhoneList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author manu
 */
public class Exec2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();
		Phone p = new Phone("165454");
		Phone p2 = new Phone("265454");
		Phone p3 = new Phone("365454");
		em.persist(p);
		em.persist(p2);
		em.persist(p3);

		PhoneList pl = new PhoneList();
		pl.setName("pl");
		List<Phone> l = new ArrayList<>();
		l.add(p);
		pl.setPhonesCollection(l);
		em.persist(pl);
		tx.commit();

		tx.begin();
		p3.setPhoneNumber("truc");
		em.remove(p);
		tx.commit();

		Phone p4 = em.find(Phone.class, 2);
		System.out.println("found tel = " + p4);
		// p4.setNom("Nouveau");

		System.out.println("");

		List<Phone> list = em.createQuery("select p from Phone p order by p.phoneNumber asc").getResultList();
		for (Phone phonee : list) {
			System.out.println("retrieved from result"+phonee);

		}

		System.out.println("---------------------------------");

//		System.out.println(p);
//		System.out.println(p2);
//		System.out.println(p3);
//		System.out.println(p4);

//		tx.begin();
//		em.merge(p);
//		tx.commit();

	}
}
