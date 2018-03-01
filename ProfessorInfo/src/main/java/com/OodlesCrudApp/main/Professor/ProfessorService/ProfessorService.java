package com.OodlesCrudApp.main.Professor.ProfessorService;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OodlesCrudApp.main.Professor.Professor;
import com.OodlesCrudApp.main.Professor.ProfessorRepository.ProfessorRepository;

//import com.OodlesCrudApp.main.SubjectRepository;
//import com.OodlesCrudApp.main.Subjects;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository professorRepository;

	public List<Professor> getAllSubjects() {

		List<Professor> subjects = new ArrayList<>();
		professorRepository.findAll().forEach(subjects::add);
		return subjects;
	}

	public Professor getSubject(String id) {
		
		return professorRepository.findOne(id);

	}

	public void addSubject(Professor professor) {
		professorRepository.save(professor);

	}

	public void updateSubject(Professor professor,String id) {

		professorRepository.save(professor);
		
	}

	public void deleteSubject(String id) {
		professorRepository.delete(id);
		
	}


}
