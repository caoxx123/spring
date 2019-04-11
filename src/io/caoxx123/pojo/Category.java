package io.caoxx123.pojo;

public class Category {
	private int id;
	private String name;

//private String value;
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "category id is "+this.id+" name is"+name;
	}
}
