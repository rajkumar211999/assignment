package springmvcproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
	System.out.println("kuch khas nahi");
	model.addAttribute("name", "RKTechnology");
	model.addAttribute("id",123455);
	return "index";
	}
	
	@RequestMapping("/about")
	public String about(Model model) {
	return "about";
	}

}
