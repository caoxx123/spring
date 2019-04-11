package io.caoxx123.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.caoxx123.pojoannotation.Product;

public class SpringIOCandDIAnnotaionTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
		Product product = (Product) context.getBean("product");
		System.out.println(product.toString());
	}
}
