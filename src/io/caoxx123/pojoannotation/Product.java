package io.caoxx123.pojoannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("product")//该注解表明这是一个bean
public class Product {
	private int id;
	private String name="ProductAnnotation";
	@Autowired
	private Category category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "this product name is "+this.name+" this product's category is "+this.getCategory().getName();
	}
}
