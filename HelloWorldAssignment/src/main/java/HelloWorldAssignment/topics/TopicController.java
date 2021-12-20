package HelloWorldAssignment.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import HelloWorldAssignment.topics.topicservice.TopicService;

@RestController
public class TopicController 
{
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics()
	{
		return topicservice.getAllTopics();
		
	}
	
	@RequestMapping("/topics/{id}")
	public Topic getTopics(@PathVariable String id)
	{
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		topicservice.addTopics(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id)
	{
		topicservice.updateTopics(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicservice.deleteTopics( id);
	}
	
}
