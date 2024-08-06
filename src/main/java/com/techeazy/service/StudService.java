package com.techeazy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techeazy.model.Student;
import com.techeazy.repository.StudRepository;

@Service
public class StudService {

	@Autowired
	private StudRepository studentRepo;
	
	public Student createStudent(Student stud) {
		
		return studentRepo.save(stud);
	}
	
	public List<Student> getAllStudent(){
		return studentRepo.findAll();
	}
}
