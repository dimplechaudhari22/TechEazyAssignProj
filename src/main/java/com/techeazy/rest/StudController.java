package com.techeazy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techeazy.model.Student;
import com.techeazy.service.StudService;

@RestController
public class StudController {

	@Autowired 
	private StudService studentService;
	
	@PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudent() {
        return studentService.getAllStudent();
    }
}
