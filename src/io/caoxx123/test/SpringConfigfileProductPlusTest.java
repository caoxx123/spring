package io.caoxx123.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.caoxx123.pojo.Product;
import io.caoxx123.pojo.ProductPlus;

public class SpringConfigfileProductPlusTest {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextproductplus.xml");
		ProductPlus productPlus=(ProductPlus) context.getBean("ProductPlus");
		System.out.println(productPlus.toString());
	}
}
