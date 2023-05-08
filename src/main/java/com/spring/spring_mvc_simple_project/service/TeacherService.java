package com.spring.spring_mvc_simple_project.service;

import java.util.List;

import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.spring_mvc_simple_project.dao.TeacherDao;
import com.spring.spring_mvc_simple_project.dto.Teacher;

@Component
public class TeacherService {
	
	@Autowired
	TeacherDao  teacherDao;
	
	public Teacher saveTeacher(Teacher teacher)
	{
		return teacherDao.saveTeacher(teacher);
	}
	
	public List<Teacher> displayAll()
	{
		return teacherDao.displayAll();
	}
	
	public Teacher getById(int teacherId)
	{
		return teacherDao.getById(teacherId);
	}
	public void deleteTeacherById(int teacherId)
	{
		teacherDao.deleteTeacherById(teacherId);
	}
	public void updateTeacher(Teacher teacher)
	{
		teacherDao.updateTeacher(teacher);
	}
}
