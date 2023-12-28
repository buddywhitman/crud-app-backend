package com.sfs.school.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sfs.school.domain.Student;
import com.sfs.school.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student getStudentById(long id) {
		return studentRepository.getReferenceById(id);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student, Long id) {
		Student st = studentRepository.getReferenceById(id);
		if( id == st.getId() ) {
		   st.setRoll(student.getRoll());	
		   st.setName(student.getName());
		   st.setAddress(student.getAddress());
		}
		return studentRepository.save(st);
	}

	
}
