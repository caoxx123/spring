package io.caoxx123.aoptest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.caoxx123.service.ProductService;

public class TestSpringAop {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContextAopAnntation.xml");
		ProductService productService=(ProductService)context.getBean("productservice");
		productService.doservie();
	}
}
