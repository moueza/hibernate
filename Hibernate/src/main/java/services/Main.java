package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acme.PersonManager;
import com.my.BarClass;

public class Main {
	// https://stackoverflow.com/questions/8313070/spring-bean-injection-in-a-main-method-class
	@Autowired
	PersonManager personManager;

	public void runn() {
		// verif
		System.out.println(personManager.printt());
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/applicationContext.xml");
		BarClass bar = (BarClass) context.getBean("bar");

		// verif
		Main main = new Main();
		main.runn();
		System.out.println(bar.print0());
	}

}
