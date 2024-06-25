package com.spring.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectRestController {
	
	@Autowired
	private StudentRepository studentrepo;
	
	@GetMapping("/getstudent")
	public List<Student> getStudent()
	{
		return List.of(new Student(1, "Vinoth",18),
				       new Student(2, "Ashok",20),
				       new Student(1, "Ram",17));
	}
	@GetMapping("/allstudent")
	public List<Student> getAllStudent()
	{
		return studentrepo.findAll();
	}
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student s)
	{
		studentrepo.save(s);
		return s;
	}

}
