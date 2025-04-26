package in.sp.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.main.entities.Course;
import in.sp.main.services.CourseService;


@Controller
public class BuyController {
	
	
@Autowired
CourseService service;
	
	@GetMapping("/buyCourse")
	public String buyCoursePage(@RequestParam("courseName") String courseName, Model model)
	{
		Course course = service.getCourseDetails(courseName);
		
		
		
		model.addAttribute("course", course);
		model.addAttribute("newCourseObj", new Course());
		
		return "payment";
	}
}