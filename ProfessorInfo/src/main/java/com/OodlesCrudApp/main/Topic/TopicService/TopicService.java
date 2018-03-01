package com.OodlesCrudApp.main.Topic.TopicService;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OodlesCrudApp.main.Topic.Topic;
import com.OodlesCrudApp.main.Topic.TopicRepository.TopicRepository;

@Service
public class TopicService  {

	@Autowired
	private TopicRepository topicRepository;
	

	public List<Topic> getAllTopics(String subjectId) {   

		List<Topic> topic = new ArrayList<>();
		
		 topicRepository.findBysubjectId(subjectId).forEach(topic::add);
		 
		 
		return topic;
	}

	public Topic getTopic(String id) {
		
		return topicRepository.findOne(id);

	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);

	}

	public void updateTopic(Topic topic) {

		topicRepository.save(topic);
		
	}

	public void deleteTopic(String id) {
		topicRepository.delete(id);
		
	}

}