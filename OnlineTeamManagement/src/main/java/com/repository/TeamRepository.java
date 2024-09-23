package com.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entities.Team;

//Provide necessary annotation
@Repository
public interface TeamRepository extends JpaRepository<Team, String> {

	// Provide necessary method to view the players based on the number of players
	// and to get the player count teamwise
	
	List<Team> findByNoOfPlayers(int noOfPlayers);
	
	
}