package com.techeazy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techeazy.model.Student;

public interface StudRepository extends JpaRepository<Student, Long> {

}
