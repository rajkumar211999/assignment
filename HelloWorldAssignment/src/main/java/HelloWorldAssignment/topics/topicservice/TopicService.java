package HelloWorldAssignment.topics.topicservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import HelloWorldAssignment.topics.Topic;

@Service
public class TopicService 
{
	private List<Topic>  topics = new ArrayList<> (Arrays.asList(
			new Topic("Java","Raj"),
			new Topic("SpringCore","hari"),
			new Topic("SpringBoot","ram")));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
    
	public Topic getTopic(String id)
	{
		return topics.stream().filter( t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopics(Topic topic) {
		
		topics.add(topic);
		
	}

	public void updateTopics(Topic topic,String id) {
		for(int i=0;i< topics.size(); i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
				return;
			}
			
		}
		
	}

	public void deleteTopics(String id) {
		
		topics.removeIf( t -> t.getId().equals(id));
	}
	
	
}
