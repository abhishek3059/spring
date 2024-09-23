package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Provide necessary Annotation wherever necessary

@Data
@Getter
@Setter

@Entity
public class Team {

	@Id
	private String teamId;
	private String teamName;
	private int noOfPlayers;
	private String teamCoach;
	@OneToMany
	private List<Player> players;

	public Team() {
		super();
	}

	public Team(String teamId, String teamName, int noOfPlayers, String teamCoach, List<Player> players) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.noOfPlayers = noOfPlayers;
		this.teamCoach = teamCoach;
		this.players = players;
	}

	

	
	



}
