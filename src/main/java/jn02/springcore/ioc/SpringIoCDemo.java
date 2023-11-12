package jn02.springcore.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIoCDemo {
	
	public static void main(String[] args) {
		// ApplicationCOntext is an Interface.
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj = ac.getBean("hw1", HelloWorld.class);
		obj.sayHello();
		
		HelloWorld obj1 = ac.getBean("hw2", HelloWorld.class);
		obj1.sayHello();
		
		System.out.println(obj==obj1);
		
	}

}
