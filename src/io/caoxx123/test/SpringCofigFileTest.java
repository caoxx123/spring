package io.caoxx123.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.caoxx123.pojo.Category;

public class SpringCofigFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml"});
		Category c=(Category) context.getBean("c");
		System.out.println(c.toString());
	}

}
