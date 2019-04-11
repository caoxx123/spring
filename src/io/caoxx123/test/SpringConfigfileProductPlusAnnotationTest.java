package io.caoxx123.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.caoxx123.pojo.Product;
import io.caoxx123.pojo.ProductPlus;
import io.caoxx123.pojo.ProductPlusAnnotation;

public class SpringConfigfileProductPlusAnnotationTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
		ProductPlusAnnotation productPlusAnnotation=(ProductPlusAnnotation) context.getBean("ProductPlusAnnotation");
		System.out.println(productPlusAnnotation.toString());
	}
}
