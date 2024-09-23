package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Team;
import com.exception.InvalidTeamException;
import com.service.ITeamService;

//Provide necessary Annotation
@RestController
public class TeamController {

	// Provide necessary Annotation
	@Autowired
	ITeamService teamService;

	// Provide necessary Annotation and fill code
	@PostMapping("/addTeam")
	public Team addTeam(@RequestBody Team team) {

        // Fill the code here
		
		return teamService.addTeam(team);
	}
	
	@PutMapping("/updateTeamCoach/{teamId}/{teamCoach}")
	public Team updateTeamCoach(@PathVariable("teamId") String teamId,@PathVariable("teamCoach") String teamCoach) throws InvalidTeamException {

		// Fill the code here
		return teamService.updateTeamCoach(teamId, teamCoach);
		
		
	}
	
	@GetMapping("/viewTeamByNoOfPlayers/{noOfPlayers}")
	public List<Team> viewTeamByNoOfPlayers(@PathVariable("noOfPlayers") int noOfPlayers) {

		// Fill the code here
		
		
		return teamService.viewTeamByNoOfPlayers(noOfPlayers);
	}
	
	@GetMapping("/getPlayerCountTeamWise")
	public Map<String, Integer> getPlayerCountTeamWise() {
	       
	    // Fill the code here
	    return teamService.getPlayerCountTeamWise();
	}
}
