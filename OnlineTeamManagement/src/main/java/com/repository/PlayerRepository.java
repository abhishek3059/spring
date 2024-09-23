package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.entities.Player;

//Provide necessary annotation
@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

	// Provide necessary method to view the players with totalRunsScored greater
	// than the given value and with the given playerRole
	// and to view the players with the given teamName
	
	List<Player> findByTeamObjTeamName(String teamName);
	
	List<Player> findByTotalRunsScoredAndPlayerRole(int totalRunsScored,String playerRole);
	

}