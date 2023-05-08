package com.spring.spring_mvc_simple_project.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.spring_mvc_simple_project.dto.Teacher;

@Component
public class TeacherDao 
{
	
	@Autowired
	EntityManagerFactory entityManagerFactory;
	

	
// insert teacher method
	public Teacher saveTeacher(Teacher teacher)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		teacher.setLocalDateTime(LocalDateTime.now());
		entityManager.persist(teacher);
		entityTransaction.commit();
		return null;
		
	}
	
//	display all method
	public List<Teacher> displayAll()
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String select="select t from Teacher t";
		Query query=entityManager.createQuery(select);
		return query.getResultList();
	}
	
//	get by id method
	public Teacher getById(int teacherId)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Teacher teacher=entityManager.find(Teacher.class, teacherId);
		if(teacher!=null)
		{
			return teacher;
		}
		
		else
		{
			return null;
		}
	}
	
//	delete teacher by id
	public void deleteTeacherById(int teacherId)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Teacher teacher=entityManager.find(Teacher.class, teacherId);
		if(teacher!=null)
		{
			
			entityTransaction.begin();
			entityManager.remove(teacher);
			entityTransaction.commit();
		}
		
	}
	
//	update teacher by id
	public void updateTeacher(Teacher teacher)
	{
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		teacher.setLocalDateTime(LocalDateTime.now());
		entityManager.merge(teacher);
		entityTransaction.commit();
	}
}
