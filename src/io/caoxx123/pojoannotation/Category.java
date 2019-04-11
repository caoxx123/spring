package io.caoxx123.pojoannotation;

import org.springframework.stereotype.Component;

@Component("category")//该注解表明这是一个bean
public class Category {
private int id;
private String name="categoryannotation";
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
		return "this Catergory name is "+this.name;
	}
}
