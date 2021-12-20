package com.SpringMVCAssignment3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@RequestMapping("/loginShow")
	public String showLogin()
	{
		return "login";
	}
	
	@RequestMapping(path="/checkingEntry",method=RequestMethod.POST)
	public String receiveInfo(@ModelAttribute User user)
	{
		if(user.getEmailId().length()<8 || user.getUserName().length()<4 || user.getPassword().length()<5)
		{
			return "error";
		}
		else
		{
			return "success";
		}
	}
}
