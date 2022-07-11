package com.accolite.springboot.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.accolite.springboot.model.Team;
import com.accolite.springboot.repository.TeamRepository;
import com.accolite.springboot.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService{

	private TeamRepository teamRepository;
	
	public TeamServiceImpl(TeamRepository teamRepository) {
		super();
		this.teamRepository = teamRepository;
	}

	@Override
	public Team saveTeam(Team team) {
		return teamRepository.save(team);
	}

	@Override
	public List<Team> getAllTeams() {
		return teamRepository.findAll();
	}

}
