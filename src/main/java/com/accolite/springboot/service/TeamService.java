package com.accolite.springboot.service;

import java.util.List;

import com.accolite.springboot.model.Team;

public interface TeamService {
	Team saveTeam(Team team);
	
	List<Team> getAllTeams();
}
