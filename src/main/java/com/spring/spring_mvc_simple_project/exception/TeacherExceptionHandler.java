package com.spring.spring_mvc_simple_project.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.spring.spring_mvc_simple_project.dto.ResponseStructure;

@ControllerAdvice
public class TeacherExceptionHandler 
{
	@Autowired
	ResponseStructure<String> responseStructure;
	
	public ResponseEntity<ResponseStructure<String>> noIdFound(IdNotFoundException idNotFoundException)
	{
		responseStructure.setStatusCode(HttpStatus.NOT_FOUND.value());
		responseStructure.setMessage("Id is not found");
		responseStructure.setData(idNotFoundException.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.NOT_FOUND.OK);
	}
} 
