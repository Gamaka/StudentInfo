package com.fastcode.student.controller;

import java.util.Hashtable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fastcode.student.model.Student;
import com.fastcode.student.service.StudentInfoService;;

@RestController
@RequestMapping("/student")
public class StudentInfoController {

		@Autowired
		StudentInfoService sis;
		
		@RequestMapping("/all")
		public Hashtable<String, Student> getAll() {
			return sis.getAll();
		}
		
		@RequestMapping("{reference}")
		public Student getStudent(@PathVariable("reference") String reference) {
			return sis.getStudent(reference);
		}
	
}
