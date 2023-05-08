package com.spring.spring_mvc_simple_project.dto;

//import java.sql.Time;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
// Spring MVC works on top of spring core so all the steps will be followed.
@Entity
public class Teacher 
{
	@Id
	private int teacherId;
	private String teacherName;
	private String teacherSubject;
//	@Transient
//	By this annotation column will not be created but operations can be performed
	private LocalDateTime localDateTime;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherSubject() {
		return teacherSubject;
	}
	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
//	public Time getTime() {
//		return time;
//	}
//	public void setTime(Time time) {
//		this.time = time;
	}
//	private Time time;
	

