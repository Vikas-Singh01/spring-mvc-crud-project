package com.spring.spring_mvc_simple_project.controller;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.spring_mvc_simple_project.dto.Teacher;
import com.spring.spring_mvc_simple_project.service.TeacherService;

@Controller
public class TeacherController {
	
		@Autowired
		TeacherService teacherService;
	
		@RequestMapping("/")
		public  String getHome()
		{
			return "home";
		}
		
		@RequestMapping("/insertTeacher")
		public ModelAndView getTeacherObject()
		{
			ModelAndView andView=new ModelAndView("save-teacher");
			andView.addObject("teacher", new Teacher());
			return andView;
		}
		
		@RequestMapping("/saveTeacher")
		public ModelAndView getTeacherObject(Teacher teacher)
		{
			ModelAndView andView=new ModelAndView("save-teacher");
			teacherService.saveTeacher(teacher);
			return andView;
		}
		
		
		@RequestMapping("/displayTeachers")
		public ModelAndView displayAll()
		{
			List<Teacher> teachers=teacherService.displayAll();
			ModelAndView modelAndView=new ModelAndView("display-teacher");
			modelAndView.addObject("teacherData", teachers);
			return modelAndView;
		}
		
		@RequestMapping("/deleteTeacher")
		public ModelAndView deleteTeacher(@RequestParam int teacherId)
		{
			teacherService.deleteTeacherById(teacherId);
			List<Teacher> teachers=teacherService.displayAll();
			ModelAndView modelAndView=new ModelAndView("display-teacher");
			modelAndView.addObject("teacherData", teachers);
			return modelAndView;
		}
		
		
		@RequestMapping("/updateTeacher")
		public ModelAndView openUpdateForm(int teacherId)
		{
			ModelAndView modelAndView=new ModelAndView("update-teacher");	
			modelAndView.addObject("updateteacher", (teacherService.getById(teacherId)));
			return modelAndView;
		}
		
		@RequestMapping("/updateTeacher1")
		public ModelAndView updateTeacher(Teacher teacher)
		{	
			teacherService.updateTeacher(teacher);
			List<Teacher> teachers=teacherService.displayAll();
			ModelAndView modelAndView=new ModelAndView("display-teacher");
			modelAndView.addObject("teacherData", teachers);
			return modelAndView;
		}
		
}
