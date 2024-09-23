package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Player;
import com.exception.InvalidPlayerException;
import com.exception.InvalidTeamException;
import com.service.IPlayerService;

//Provide necessary Annotation
@RestController
public class PlayerController {

	// Provide necessary Annotation
	@Autowired 
	IPlayerService playerService;

	// Provide necessary Annotation and fill code
	@PostMapping("/addPlayer/{teamId}")
	public Player addPlayer(@RequestBody Player player,@PathVariable("teamId") String teamId) throws InvalidTeamException {
		
		// Fill the code here
		return playerService.addPlayer(player, teamId);
	}
	
	@PutMapping("/updateTotalRunsScored/{playerId}/{runsScored}")
	public Player updateTotalRunsScored(@PathVariable("playerId") String playerId,@PathVariable("runsScored") int runsScored) throws InvalidPlayerException {
	        
	    // Fill the code here
	    
	    return playerService.updateTotalRunsScored(playerId, runsScored);
	}
		
	@GetMapping("/viewPlayerByPlayerId/{playerId}")
	public Player viewPlayerByPlayerId(@PathVariable("playerId") String playerId) throws InvalidPlayerException {

        // Fill the code here
		
		return playerService.viewPlayerByPlayerId(playerId);
	}
	
	@GetMapping("/viewPlayerByTeamName/{teamName}")
	public List<Player> viewPlayerByTeamName(@PathVariable("teamName") String teamName) {

		// Fill the code here
		
		return playerService.viewPlayerByTeamName(teamName);
	}
	
	@GetMapping("/viewPlayerByTotalRunsScoredAndPlayerRole/{totalRunsScored}/{playerRole}")
	public List<Player> viewPlayerByTotalRunsScoredAndPlayerRole(@PathVariable("totalRunsScored") int totalRunsScored,@PathVariable("playerRole") String playerRole) {

		
		return playerService.viewPlayerByTotalRunsScoredAndPlayerRole(totalRunsScored, playerRole);
	}

	@DeleteMapping("/deletePlayer/{playerId}")
	public Player deletePlayer(@PathVariable("playerId") String playerId) throws InvalidPlayerException {

		// Fill the code here
		
		return playerService.deletePlayer(playerId);
	}
}
