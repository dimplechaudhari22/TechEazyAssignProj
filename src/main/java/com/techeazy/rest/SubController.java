package com.techeazy.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techeazy.model.Subject;
import com.techeazy.service.SubService;

@RestController
public class SubController {

	@Autowired
	private SubService subjectService;
	
	@GetMapping
    public List<Subject> getAllSubject() {
        return subjectService.getAllSubject();
    }
}
