package com.example.demo;



import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
	Logger log=Logger.getAnonymousLogger();
	
	@RequestMapping("/")
	//model and view for tranfering data to a jsp(physical page)
	public ModelAndView index(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}
	
	@RequestMapping("/add")
	//model and view for tranfering data to a jsp(physical page)
	public ModelAndView displayadd(HttpServletRequest request,HttpServletResponse response) {
		int result = Integer.parseInt(request.getParameter("no1"))+Integer.parseInt(request.getParameter("no2"));
		log.info("display add method");
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("res", result);
		return mv;
	}


	@ResponseBody
	@RequestMapping("/sub")
	public String displaysub(HttpServletRequest request,HttpServletResponse response) {
		int result = Integer.parseInt(request.getParameter("no1"))-Integer.parseInt(request.getParameter("no2"));
		return "sub of the numbers is " + result ;
	}
}
