package com.OodlesCrudApp.main.Topic;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



import com.OodlesCrudApp.main.Subject.Subject;

@Entity
public class Topic {
	@Id
	String id;
	String name;
	
	@ManyToMany
	private Set<Subject> subject=new HashSet<Subject>();
	
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
	public Topic(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Topic() {
		
	}
	
	public void setSubject(Set<Subject> subject) {
		this.subject = subject;
	}
	public Set getSubject() {
		return subject;
	}
	
}
