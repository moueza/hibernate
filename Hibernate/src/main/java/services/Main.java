package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.acme.PersonManager;
import com.my.BarClass;

import entities.Person;

public class Main {
	// https://stackoverflow.com/questions/8313070/spring-bean-injection-in-a-main-method-class
	PersonManager personManager;

	@Autowired
	Person person;

	@Autowired
	Person personVALUED;

	@Autowired
	Person personVALUED1;

	/** interface ou impl ? */
	@Autowired
	PersonService personService;

	public Person getPersonVALUED() {
		return personVALUED;
	}

	public void setPersonVALUED(Person personVALUED) {
		this.personVALUED = personVALUED;
	}

	ApplicationContext context;

	// TODO @Service annotation or @component
	public void runn() {
		// verif
		System.out.println(this.getPerson());
		System.out.println("lbl r10");
		System.out.println(this.getPersonVALUED().getAge());

		System.out.println("lbl r20");

		System.out.println("printAlea=" + this.getPerson().printAlea());
		System.out.println("lbl r25");
		System.out.println(this.getPerson());
		// System.out.println(personManager.printt());
		System.out.println("lbl r30");
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	public PersonManager getPersonManager() {
		return personManager;
	}

	public void setPersonManager(PersonManager personManager) {
		this.personManager = personManager;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public ApplicationContext getContext() {
		return context;
	}

	public void setContext(ApplicationContext context) {
		this.context = context;
	}

	public static void main(String[] args) {
		System.out.println("lbl0");
		/**
		 * TODO closable by try catch
		 * https://stackoverflow.com/questions/14184059/spring-applicationcontext-resource-leak-context-is-never-closed
		 */
		ApplicationContext context = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		System.out.println("lbl9");
		BarClass bar = (BarClass) context.getBean("bar");
		System.out.println("lbl11");
		System.out.println(bar.print0());

		System.out.println("lbl12");

		// verif
		// Main main = new Main();

		Main main = (Main) context.getBean("main");
		main.runn();

		System.out.println("lb130");
		/** implementer couches profondes d abord */
		main.getPersonService().savePerson(main.getPersonVALUED());
		System.out.println("lb140");
		// TODO get back
		System.out.println("lb150");
	}

}
