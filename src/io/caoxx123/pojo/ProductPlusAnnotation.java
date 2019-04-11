package io.caoxx123.pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class ProductPlusAnnotation {
	private int id;
	private String name;
	private String color;
	private float pirce;
	
//	@Autowired
	@Resource(name="Category")//跟@Autowired注解的效果是一样的
	private Category category;
	public Category getCategory() {
		return category;
	}
//	@Autowired 跟在Category上面加Autowired效果一样
	public void setCategory(Category category) {
		this.category = category;
	}

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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPirce() {
		return pirce;
	}

	public void setPirce(float pirce) {
		this.pirce = pirce;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "this product object name is "+this.name+"this product's category is "+this.getCategory().getName();
	}
}
