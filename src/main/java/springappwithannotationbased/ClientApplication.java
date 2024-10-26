package springappwithannotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApplication {
	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp=(Employee)context.getBean("emp");
		System.out.println(emp);
	}

}
