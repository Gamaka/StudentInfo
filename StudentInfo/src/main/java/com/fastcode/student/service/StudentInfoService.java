package com.fastcode.student.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;
import com.fastcode.student.model.Student;


@Service
public class StudentInfoService {
	
	protected String dbUrl = "http://localhost:5984/";
	protected Hashtable<String, Student> students = new Hashtable<String, Student>();
	
	public StudentInfoService() {
		Student p = new Student();
		p.setReference("2017March01");
		p.setLastName("Smith");
		p.setOtherNames("Taylor Marie");
		p.setContact("+9787623452");

		students.put("2017March01", p);
		
		p = new Student();
		p.setReference("2017March02");
		p.setLastName("Dharma");
		p.setOtherNames("Shahi Priya");
		p.setContact("+9147523951");

		students.put("2017March02", p);
	}

	public Student getStudent(String reference) {
		if(students.containsKey(reference)) {
			return students.get(reference);
		}
		else {
			return null;
		}
	}

	public Hashtable<String, Student> getAll() {
		return students;
	}
	
}
