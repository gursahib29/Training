package com.OodlesCrudApp.main.Topic.TopicController;


import java.util.HashSet;
import java.util.List;

import org.hibernate.mapping.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.OodlesCrudApp.main.Subject.Subject;
import com.OodlesCrudApp.main.Topic.Topic;
import com.OodlesCrudApp.main.Topic.TopicService.TopicService;

//import com.OodlesCrudApp.Subjects.Subjects;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicService;

	@RequestMapping("/professors/{professorId}/subjects/{subjectId}/topics")
	public List<Topic> getAllTopics(@PathVariable String professorId, @PathVariable String subjectId) {    
		
		//String to topic in generics
		return topicService.getAllTopics(subjectId);
		//return null;
	}
	
	@RequestMapping("/professors/{professorId}/subjects/{subjectId}/topics/{topicId}")
	public Topic getTopic(@PathVariable String topicId) {
		return topicService.getTopic(topicId);
	}
	@RequestMapping(method=RequestMethod.POST,value="/professor/{professorId}/subject/{subjectId}/topic")
	public void addTopic(@RequestBody Topic topic,@PathVariable String subjectId) {
		
		HashSet h=new HashSet();
		h.add(new Subject(subjectId,""));
		topic.setSubject(h);
		 topicService.addTopic(topic);
		
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/professor/{professorId}/subject/{subjectId}/Topic/{id}")
	public void updateTopic( @RequestBody Topic topic,@PathVariable String professorId,@PathVariable String subjectId,@PathVariable String id)
	{
		
		
		//topic.setSubject(new Set(new Subject(subjectId,"")));
		HashSet h=new HashSet();
		h.add(new Subject(subjectId,""));
		topic.setSubject(h);
		topicService.updateTopic(topic);
		
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topicDelete/{id}")
	public void deleteTopic(@PathVariable String id) {
		 topicService.deleteTopic(id);
		
		
	}

}