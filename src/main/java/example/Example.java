package example;

import example.controller.IndexController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example {
	public static void main(String[] args) {
		//ApplicationContext ctx = new FileSystemXmlApplicationContext("applicationContext.xml");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("number : " + ctx.getBeanDefinitionCount());
		IndexController indexController = (IndexController)ctx.getBean("indexController");
		System.out.println(indexController.index());
	}
}
