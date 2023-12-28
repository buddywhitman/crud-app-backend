package com.sfs.school.service;

import java.util.List;

import com.sfs.school.domain.Student;

public interface StudentService {
	public Student getStudentById(long id);
	public List<Student> getAllStudent();
	public Student saveStudent(Student student);
	public Student updateStudent(Student student, Long id);
}
