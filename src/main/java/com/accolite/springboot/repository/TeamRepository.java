package com.accolite.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accolite.springboot.model.Team;

public interface TeamRepository extends JpaRepository<Team, Long>{

}
