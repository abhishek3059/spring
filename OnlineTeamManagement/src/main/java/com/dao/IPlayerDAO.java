package com.dao;

import com.exception.InvalidPlayerException;
import com.exception.InvalidTeamException;


import java.util.List;

import com.entities.Player;

public interface IPlayerDAO {

	public Player addPlayer(Player player, String teamId) throws InvalidTeamException;
	public Player updateTotalRunsScored(String playerId, int runsScored) throws InvalidPlayerException;
	public Player viewPlayerByPlayerId(String playerId) throws InvalidPlayerException;
	public List<Player> viewPlayerByTeamName(String teamName);
	public List<Player> viewPlayerByTotalRunsScoredAndPlayerRole(int totalRunsScored,String playerRole);
	public Player deletePlayer(String playerId) throws InvalidPlayerException;

}
