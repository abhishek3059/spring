package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IPlayerDAO;
import com.entities.Player;
import com.exception.InvalidPlayerException;
import com.exception.InvalidTeamException;

//Provide necessary annotation
@Service
public class PlayerServiceImpl implements IPlayerService {

	// Provide necessary annotation
	@Autowired
	IPlayerDAO playerDAO;

	@Override
	public Player addPlayer(Player player, String teamId) throws InvalidTeamException {

		// Fill the code here

		return playerDAO.addPlayer(player, teamId);
	}
		
	@Override
	public Player updateTotalRunsScored(String playerId, int runsScored) throws InvalidPlayerException {
	    
	    // Fill the code here
		return playerDAO.updateTotalRunsScored(playerId, runsScored);		
	}
	

	@Override
	public Player viewPlayerByPlayerId(String playerId) throws InvalidPlayerException {

	    // Fill the code here

		return playerDAO.viewPlayerByPlayerId(playerId);
	}

	@Override
	public List<Player> viewPlayerByTeamName(String teamName) {

		// Fill the code here
		

		return playerDAO.viewPlayerByTeamName(teamName);
	}

	@Override
	public List<Player> viewPlayerByTotalRunsScoredAndPlayerRole(int totalRunsScored, String playerRole) {

		// Fill the code here

		return playerDAO.viewPlayerByTotalRunsScoredAndPlayerRole(totalRunsScored, playerRole);
	}

	@Override
	public Player deletePlayer(String playerId) throws InvalidPlayerException {

		// Fill the code here

		return playerDAO.deletePlayer(playerId);
	}
	
	
}
