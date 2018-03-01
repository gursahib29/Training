package com.OodlesCrudApp.main.Subject;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

//import com.OodlesCrudApp.main.Subject;
//import com.OodlesCrudApp.main.Subjects;
import com.OodlesCrudApp.main.Professor.Professor;
import com.OodlesCrudApp.main.Topic.Topic;

@Entity

public class Subject {
	@Id
	private String id;
	private String name;
	
	@ManyToOne
	private Professor professor;
	
	
	
	public Subject(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	public Subject()
	{
		super();
		
	}
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
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	

}