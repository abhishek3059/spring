package com.dao;

import java.util.List;

import com.entities.Team;
import com.exception.InvalidTeamException;
import java.util.Map;

public interface ITeamDAO {

	public Team addTeam(Team team);
	public Team updateTeamCoach(String teamId,String teamCoach) throws InvalidTeamException;
	public List<Team> viewTeamByNoOfPlayers(int noOfPlayers);
	public Map<String, Integer> getPlayerCountTeamWise();


}