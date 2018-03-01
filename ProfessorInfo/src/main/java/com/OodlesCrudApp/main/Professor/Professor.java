package com.OodlesCrudApp.main.Professor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Professor {
	
	
@Id	
String id;
String name;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Professor(String id, String name) {
	super();
	this.id = id;
	this.name = name;
}

public Professor() {

}



}
