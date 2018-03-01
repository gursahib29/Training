package com.OodlesCrudApp.main.Topic.TopicRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.OodlesCrudApp.main.Topic.Topic;

public interface TopicRepository extends CrudRepository<Topic,String>{
	
	public List<Topic> findBysubjectId(String subjectId);

}
