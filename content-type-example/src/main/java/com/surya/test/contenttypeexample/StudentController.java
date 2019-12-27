package com.surya.test.contenttypeexample;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@RequestMapping(value="/student",method = RequestMethod.GET)
	public Student getStudent()
	{
		Student std = new Student();
		std.setId(1L);
		std.setName("Surya");
		std.setDepartment("ID Dept");
		return std;
	}

}
