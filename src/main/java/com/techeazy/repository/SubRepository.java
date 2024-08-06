package com.techeazy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techeazy.model.Subject;

public interface SubRepository extends JpaRepository<Subject,Long> {

}
