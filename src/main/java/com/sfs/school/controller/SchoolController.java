package com.sfs.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sfs.school.domain.Student;
import com.sfs.school.service.StudentService;

@RestController
public class SchoolController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable("id") long id) {
		return studentService.getStudentById(id);
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@PutMapping("/student/{id}")
	public Student updateStudent(@RequestBody Student student, @PathVariable("id") Long id) {
		return studentService.updateStudent(student, id);
	}
}
