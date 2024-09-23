package com.dao;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.entities.Team;
import com.exception.InvalidTeamException;
import com.repository.TeamRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
public class TeamDAOImpl implements ITeamDAO {

	// Provide necessary Annotation
	@Autowired
	TeamRepository teamRepository;

	public Team addTeam(Team team) {

		// Fill the code here
		return teamRepository.save(team);
	}

	public Team updateTeamCoach(String teamId, String teamCoach) throws InvalidTeamException {

		// Fill the code here
		Optional<Team> t= teamRepository.findById(teamId);
		if(t.isPresent())
		{
			Team t1=t.get();
			t1.setTeamCoach(teamCoach);
			return teamRepository.save(t1);
		}
		else
		{
			throw new InvalidTeamException();
		}
	}

	public List<Team> viewTeamByNoOfPlayers(int noOfPlayers) {

		// Fill the code here
		return teamRepository.findByNoOfPlayers(noOfPlayers);
	}
	
	
	public Map<String, Integer> getPlayerCountTeamWise() {
	    	
	    // Fill the code here
		return null;
	}

}
