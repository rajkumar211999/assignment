package com.SpringMVCAssignment2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestCalc {
	@RequestMapping("/calculate")
	public ModelAndView calcSI(HttpServletRequest req,HttpServletResponse res)
	{
		double p=Double.parseDouble(req.getParameter("inp1"));
		double t=Double.parseDouble(req.getParameter("inp2"));
		double r=Double.parseDouble(req.getParameter("inp3"));
		
		double si=p*(1+(0.1*r*t));
		
		ModelAndView mv=new ModelAndView();
		mv.setViewName("calcSI.jsp");
		mv.addObject("resultSI",si);
		
		return mv;
	}
}