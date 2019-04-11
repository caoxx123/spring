package io.caoxx123.pojo;

public class ProductPlus {
	private int id;
	private String name;
	private String color;
	private float pirce;
	private Category category;
	public Category getCategory() {
		return category;
	}

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
