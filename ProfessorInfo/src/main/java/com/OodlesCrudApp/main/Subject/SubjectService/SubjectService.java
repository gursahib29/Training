package com.OodlesCrudApp.main.Subject.SubjectService;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OodlesCrudApp.main.Subject.Subject;
import com.OodlesCrudApp.main.Subject.SubjectRepository.SubjectRepository;

//import com.OodlesCrudApp.main.SubjectRepository;
//import com.OodlesCrudApp.main.Subjects;

@Service
public class SubjectService {
	
	@Autowired
	private SubjectRepository subjectRepository;

	public List<Subject> getAllSubjects(String id) {

		List<Subject> subjects = new ArrayList<>();
		subjectRepository.findAll().forEach(subjects::add);
		return subjects;
	}

	public Subject getSubject(String id) {
		
		return subjectRepository.findOne(id);

	}

	public void addSubject(Subject topic) {
		subjectRepository.save(topic);

	}

	public void updateSubject(Subject subject,String id) {

		subjectRepository.save(subject);
		
	}

	public void deleteSubject(String id) {
		subjectRepository.delete(id);
		
	}


}
