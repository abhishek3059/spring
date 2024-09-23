package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.Player;
import com.entities.Team;
import com.exception.InvalidPlayerException;
import com.exception.InvalidTeamException;
import com.repository.PlayerRepository;
import com.repository.TeamRepository;

@Component
public class PlayerDAOImpl implements IPlayerDAO {

	// Provide necessary Annotation
	@Autowired
	PlayerRepository playerRepository;

	// Provide necessary Annotation
	@Autowired
	TeamRepository teamRepository;

	@Override
	public Player addPlayer(Player player, String teamId) throws InvalidTeamException {

		// Fill the code here
		Optional<Team> t = teamRepository.findById(teamId);
		if (t.isPresent()) {
			player.setTeamObj(t.get());
			return playerRepository.save(player);
		} else {
			throw new InvalidTeamException();
		}

	}

	@Override
	public Player updateTotalRunsScored(String playerId, int runsScored) throws InvalidPlayerException {

		// Fill the code here
		Optional<Player> p = playerRepository.findById(playerId);
		if (p.isPresent()) {
			Player p1 = p.get();
			p1.setTotalRunsScored(p1.getTotalRunsScored() + runsScored);
			return playerRepository.save(p1);
		} else {
			throw new InvalidPlayerException();
		}
	}

	@Override
	public Player viewPlayerByPlayerId(String playerId) throws InvalidPlayerException {

		// Fill the code here
		Optional<Player> p = playerRepository.findById(playerId);
		if (p.isPresent()) {
			return p.get();
		} else {
			throw new InvalidPlayerException();
		}

	}

	@Override
	public List<Player> viewPlayerByTeamName(String teamName) {

		// Fill the code here

		return playerRepository.findByTeamObjTeamName(teamName);

	}

	@Override
	public List<Player> viewPlayerByTotalRunsScoredAndPlayerRole(int totalRunsScored, String playerRole) {

		// Fill the code here
		return playerRepository.findByTotalRunsScoredAndPlayerRole(totalRunsScored, playerRole);
	}

	@Override

	public Player deletePlayer(String playerId) throws InvalidPlayerException {

		// Fill the code here
		Optional<Player> p = playerRepository.findById(playerId);
		if (p.isPresent()) {
			Player p1 = p.get();
			playerRepository.delete(p1);
			return p1;
		} else {
			throw new InvalidPlayerException();
		}

	}

}
