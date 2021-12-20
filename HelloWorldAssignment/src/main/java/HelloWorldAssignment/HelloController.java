package HelloWorldAssignment;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
	@RequestMapping("/hello")
	public String sayhi()
	{
		return "HELLO WORLD!!!";
	}
	

}
