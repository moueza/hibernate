package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acme.PersonManager;
import com.my.BarClass;

import entities.Person;

public class Main {
	// https://stackoverflow.com/questions/8313070/spring-bean-injection-in-a-main-method-class
	@Autowired(required = false)
	@Qualifier("personManager")
	PersonManager personManager;

	@Autowired(required = false)
	@Qualifier("person")
	Person person;

	ApplicationContext context;

	// TODO @Service annotation or @component
	public void runn() {
		// verif
		System.out.println(person.getAge());
		System.out.println(personManager.printt());
	}

	public static void main(String[] args) {
		System.out.println("lbl0");
		/**
		 * TODO closable by try catch
		 * https://stackoverflow.com/questions/14184059/spring-applicationcontext-resource-leak-context-is-never-closed
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/applicationContext.xml");
		BarClass bar = (BarClass) context.getBean("bar");
		System.out.println(bar.print0());
		
		System.out.println("lbl12");
		
		// verif
		Main main = new Main();
		main.runn();

		System.out.println("lb130");
		

	}

}
