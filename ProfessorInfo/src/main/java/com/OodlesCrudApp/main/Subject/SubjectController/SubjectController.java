package com.OodlesCrudApp.main.Subject.SubjectController;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.OodlesCrudApp.main.Professor.Professor;
import com.OodlesCrudApp.main.Subject.Subject;
import com.OodlesCrudApp.main.Subject.SubjectService.SubjectService;

//import com.OodlesCrudApp.Subjects.Subjects;

@RestController
public class SubjectController {
	@Autowired
	private SubjectService subjectService;

	@RequestMapping("/professors/{professorId}/subject")
	public List<Subject> getAllTopics(@PathVariable String professorId) {
		return subjectService.getAllSubjects(professorId);
	}
	
	@RequestMapping("/professors/{professorId}/subject/{id}")             ///check required
	public Subject getTopic(@PathVariable String id) {
		return subjectService.getSubject(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/professor/{professorId}/subject")
	public void addTopic(@RequestBody Subject subject,@PathVariable String professorId) {
		subject.setProfessor(new Professor(professorId,""));               //
		 subjectService.addSubject(subject);
		
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/professor/{ProfessorId}/subject/{id}")
	public void updateTopic(@RequestBody Subject subject,@PathVariable String professorId,@PathVariable String id) {
		
		subject.setProfessor(new Professor(professorId,""));               //
		 subjectService.addSubject(subject);
		
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteSubject(@PathVariable String id) {
		 subjectService.deleteSubject(id);
		
		
	}

}