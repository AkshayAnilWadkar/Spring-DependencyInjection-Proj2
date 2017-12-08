package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.Application;

public class Test {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
	Application app=(Application) context.getBean("callAxis");
	System.out.println("Axis is :");
	app.print();
	app=(Application) context.getBean("callSBI");
	System.out.println("SBI is :");
	app.print();
	
}
}
