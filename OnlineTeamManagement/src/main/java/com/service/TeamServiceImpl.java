package com.service;

import java.util.List;
import com.dao.ITeamDAO;
import com.entities.Team;
import com.exception.InvalidTeamException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Provide necessary annotation
@Service
public class TeamServiceImpl implements ITeamService {

	// Provide necessary annotation
	@Autowired
	ITeamDAO teamDAO;

	@Override
	public Team addTeam(Team team) {

		// Fill the code here

		return teamDAO.addTeam(team);
	}

	@Override
	public Team updateTeamCoach(String teamId, String teamCoach) throws InvalidTeamException {

		// Fill the code here

		return teamDAO.updateTeamCoach(teamId, teamCoach);
	}

	@Override
	public List<Team> viewTeamByNoOfPlayers(int noOfPlayers) {

		// Fill the code here

		return teamDAO.viewTeamByNoOfPlayers(noOfPlayers);
	}
	
	@Override
	public Map<String, Integer> getPlayerCountTeamWise() {

		// Fill the code here

		return teamDAO.getPlayerCountTeamWise();	
	}
}
