package com.techeazy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techeazy.model.Subject;
import com.techeazy.repository.SubRepository;

@Service
public class SubService {

	@Autowired 
	private SubRepository subjectRepo;
	
	public List<Subject> getAllSubject(){
		return subjectRepo.findAll();
	}
}
