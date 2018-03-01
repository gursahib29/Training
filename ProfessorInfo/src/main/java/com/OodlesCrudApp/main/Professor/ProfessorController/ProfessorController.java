package com.OodlesCrudApp.main.Professor.ProfessorController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.OodlesCrudApp.main.Professor.Professor;
import com.OodlesCrudApp.main.Professor.ProfessorService.ProfessorService;

@RestController
public class ProfessorController {
	@Autowired
	private ProfessorService professorService;

	@RequestMapping("/professors")
	public List<Professor> getAllSubject() {
	
		return professorService.getAllSubjects();
	}
	
	@RequestMapping("/subjects/{id}")
	public Professor getSubject(@PathVariable String id) {
		return professorService.getSubject(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/professor")
	public void addSubject(@RequestBody Professor professor) {
		 professorService.addSubject(professor);
		
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/professor/{id}")
	public void updateSubject(@RequestBody Professor professor,@PathVariable String id) {
		 professorService.updateSubject(professor,id);
		
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/professor/{id}")
	public void deleteSubject(@PathVariable String id) {
		professorService.deleteSubject(id);
		
		
	}

}