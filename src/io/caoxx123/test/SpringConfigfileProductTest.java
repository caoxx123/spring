package io.caoxx123.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.caoxx123.pojo.Product;

public class SpringConfigfileProductTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextproduct.xml");
		Product product=(Product) context.getBean("Product");
		System.out.println(product.toString());
	}
}
