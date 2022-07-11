package com.accolite.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accolite.springboot.model.Team;
import com.accolite.springboot.service.TeamService;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

	private TeamService teamService;

	public TeamController(TeamService teamService) {
		super();
		this.teamService = teamService;
	}
	
	@PostMapping
	public ResponseEntity<Team> saveTeam(@RequestBody Team team) {
		return new ResponseEntity<Team>(teamService.saveTeam(team), HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Team> getAllTeams() {
		return teamService.getAllTeams();
	}
	
}
