package com.service;

import java.util.List;
import java.util.Map;

import com.entities.Team;
import com.exception.InvalidTeamException;

public interface ITeamService {

	public Team addTeam(Team team);
	public Team updateTeamCoach(String teamId,String teamCoach) throws InvalidTeamException;
	public List<Team> viewTeamByNoOfPlayers(int noOfPlayers);
	public Map<String, Integer> getPlayerCountTeamWise();
}
