package com.entities;

/*


The BCCI has decided to implement an online team management application for the new season of IPL. They need to automate the application.


You need to implement the Player and Team module of the online team management application. The client wishes to have restful web services to add a new team, modify the team like team coach and view the team details based on the requirement.


Also, the client wishes to have restful web services for the manipulation of the Player like, add a new Player, modify the total runs scored by player, delete a player and view the player details based on the requirement.

Help them to automate the above process by developing Rest Service using Maven.

2.0 Technical Specifications


 The provided TeamController and PlayerController which are RestController, should be created with the below services:


Services:

 TeamController : 






RequestMethod
 
RequestUrl
 
Description
 

Post
 
/addTeam
 
This service should add the Team details by using the addTeam method of the TeamServiceImpl which in turn should use the addTeam method of the TeamDAOImpl
 

Put
 
/updateTeamCoach/{teamId}/{teamCoach}
 
This service should update the teamCoach of the given teamId to the given teamCoach by using the updateTeamCoach method of the TeamServiceImpl which in turn should use the updateTeamCoach method of the TeamDAOImpl
 

Get
 
/viewTeamByNoOfPlayers/{noOfPlayers}
 
This service should retrieve the existing Team details based on noOfPlayers of the team, i.e., it should retrieve the teams with noOfPlayers equal to the given noOfPlayers by using the viewTeamByNoOfPlayers method of the TeamServiceImpl which in turnshould use the viewTeamByNoOfPlayers method of the TeamDAOImpl.
 

Get
 
/getPlayerCountTeamWise
 
This service should retrieve the count of Players in each Team by using the getPlayerCountTeamWise method of the TeamServiceImpl which in turn should use the getPlayerCountTeamWise method of the TeamDAOImpl.

It will return a Map, where key is the teamId and value is the count of number of players.
 





PlayerController :






RequestMethod
 
RequestUrl
 
Description
 

Post
 
/addPlayer/{teamId}
 
This service takes Player object and teamId as input and it should add the Player details by using the addPlayer method of the PlayerServiceImpl which in turn should use the addPlayer method of the PlayerDAOImpl
 

Put
 
/updateTotalRunsScored/{playerId}/{runsScored}
 
This service should update the totalRunsScored of the given playerId by adding the totalRunsScored of that player with the given runsScored using the updateTotalRunsScored method of the PlayerServiceImpl which in turn should use the updateTotalRunsScoredmethod of the PlayerDAOImpl
 

Get
 
/viewPlayerByPlayerId/{playerId}
 
This service should retrieve the existing Player details with the given playerId by using the viewPlayerByPlayerId method of the PlayerServiceImpl which in turn should use the viewPlayerByPlayerId method of the PlayerDAOImpl. 
 

Get
 
/viewPlayerByTeamName/{teamName}
 
This service should retrieve the existing Player details with the given teamName by using the viewPlayerByTeamName method of the PlayerServiceImpl which in turn should use the viewPlayerByTeamName method of the PlayerDAOImpl. 
 

Get
 
/viewPlayerByTotalRunsScoredAndPlayerRole/{totalRunsScored}/{playerRole}
 
This service should retrieve the existing Player details whose totalRunsScored is greater that than the given value and who plays in the given playerRole by using the viewPlayerByTotalRunsScoredAndPlayerRole of the PlayerServiceImpl which in turn shoulduse the viewPlayerByTotalRunsScoredAndPlayerRole method of the PlayerDAOImpl.
 

Delete
 
/deletePlayer/{playerId}
 
This service should delete an existing Player details by using the deletePlayer method of the PlayerServiceImpl which in turn should use the deletePlayer method of the PlayerDAOImpl
 




Service Layer 

Refer to the ITeamService interface and TeamServiceImplclass are provided as part of the code skeleton. The TeamServiceImpl has to realize all the methods in the ITeamService interface


Also IplayerService interface and PlayerServiceImpl class are provided as part of the code skeleton. The PlayerServiceImpl has to realize all the methods in the IPlayerService interface.




DAO Layer 



Refer to the ITeamDAO interface and TeamDAOImpl class are provided as part of the code skeleton. The TeamDAOImpl has to realize all the methods in the ITeamDAO interface.

Also, the IPlayerDAO interface and PlayerDAOImpl class are provided as part of the code skeleton. The PlayerDAOImpl has to realize all the methods in the IPlayerDAO interface. 


In TeamDAOImpl and PlayerDAOImpl class all database related operations should be implemented using the TeamRepository and PlayerRepository interface respectively.




Methods in TeamDAOImpl









Methodin Service
 
Description
 
Exception
 

addTeam
 
This method should add the Team details to the database using TeamRepository and return the Team object.
 


 

updateTeamCoach
 
This method accepts teamId and teamCoach as parameters. It should check the availability of the Team based on the teamId and if the team exists, then update the teamCoach of that Team object with the given teamCoach in the database using TeamRepositoryand return that updated Team object.
 
If no Team exists with that teamId then throw InvalidTeamException
 

viewTeamByNoOfPlayers
 
This method accepts noOfPlayers as an argument. It should retrieve the list of Teams from the database whose noOfPlayers is equal to the given value.
 


 

getPlayerCountTeamWise
 
This method retrieves the number of Players in each team from the database and return a Map with key as teamId and value as count of number of players in that team.




 Note:Consider the number of players for each team based on the actualplayer entries in the database.
 


 







Methods in PlayerDAOImpl









Methodin Service
 
Description
 
Exception
 

addPlayer
 
This method accepts a Player object (that holds details of playerId, playerName, playerRole, totalRunsScored) and the teamId as parameters. This method should retrieve the Team object for the teamId passed as parameter.

Next set the Team object to the Player object. Add the Player details to the database using PlayerRepository and return the Player object.



 
If no team exists with the given teamId, then throw InvalidTeamException
 

updateTotalRunsScored
 
This method accepts playerId and runsScored as parameters. It should check the availability of the Player based on the playerId and if the player exists, then update the totalRunsScored of that Player object by adding the given runsScored to the totalRunsScoredof that Player in the database using PlayerRepository and return that updated Player object.
 
If no Player exists with that playerId then throw InvalidPlayerException
 

viewPlayerByTotalRunsScoredAndPlayerRole
 
This method accepts two arguments totalRunsScored and playerRole. It should retrieve the list of players whose totalRunsScored is greater than the given value and who plays in the given playerRole. 
 


 

viewPlayerByTeamName
 
This method accepts teamName as an argument. It should retrieve the list of Players with the given teamName.
 


 

viewPlayerByPlayerId
 
This method accepts playerId as an argument. It should retrieve the Player details for the given playerId.
 
If no player exists with that playerId, then throw an InvalidPlayerException 
 

deletePlayer
 
This method accepts playerId as an argument . It should delete the Player with the given playerId and return that Player object.
 
If no player exists with that playerId, then throw an InvalidPlayerException
 
Repository Layer


Refer to the TeamRepository and PlayerRepository interface provided as part of the code skeleton. Use appropriate Spring Data JPA methods for all the database related manipulation. 


Also include the necessary methods in TeamRepository to view the Teams based on noOfPlayers and getPlayerCountTeamWise. In PlayerRepository include the necessary methods to view players based on totalRunsScored and playerRole and to view players by teamName.





Model

Refer to the Model class provided as part of the code skeleton, use appropriate annotation for the persistence mapping in the model class.




 Model Class - Team

Refer to the Team and Player class provided as part of the code skeleton, use appropriate annotation to generate getter/setter and an all-argument constructor.

Team class





Attribute
 
Data Type
 

teamId
 
String
 

teamName
 
String
 

noOfPlayers
 
int
 

teamCoach
 
String
 

players
 
List<Player>
 




Player class





Attribute
 
Data Type
 

playerId
 
String
 

playerName
 
String
 

playerRole
 
String
 

totalRunsScored
 
int
 

teamObj
 
Team
 




Note:

• UseLombok to generate getters and setters for the attributes


• Alsogenerate all-argument constructor using lombok


• Donot change the datatype or the attribute name provided as part ofthe code skeleton
 




Business Validation




    Inbuilt Validation






Rule 
 
Messagewhen validation fails 
 

teamId should not be empty
 
Provide value for team Id
 

teamName should not be empty
 
Providevalue for team name
 

teamCoach should not be empty
 
Providevalue for team coach
 

noOfPlayers should between 13 and 17
 
Numberof players shouldbe between 13 and 17
 









Rule
 
Messagewhen validation fails
 

playerId should not be empty
 
Provide value for player Id
 

playerName should not be empty
 
Providevalue for player name
 

playerRole should not be empty
 
Providevalue for player role
 

totalRunsScored should be 0 or more
 
Totalruns scored should be 0 or greater
 

Perform the above Validations using annotations that are available in jakarta.validation.constraints package

Incorporate Exception and validations as ResponseEntity

To incorporate the messages related to Exception and validations (both custom and inbuilt validations) as ResponseEntity, you are provided with the following classes.

• ExceptionResponseclass that represents what attributes needs to be there in thecustomized response error message. Make use of this class to sendthe customized response error message.


• CustomizedResponseEntityExceptionHandlerclass to handle all the exceptions that has occurred in the application (both user-defined and pre-defined).






Method Name
 
Explanation
 

handleAllExceptions
 
This method should generally handle all the exceptions.

In ResponseEntity set the HTTPStatus as INTERNAL_SERVER_ERROR.
 

handleNotFoundException
 
This method should handle and provide customized error message using Exception Response class for user defined exception InvalidTeamException and InvalidPlayerException

In ResponseEntity set the HTTPStatus as NOT_FOUND.
 

handleMethodArgumentNotValid
 
This method should handle and provide customized error message using Exception Response class for both pre-defined and user defined validations. 

In ResponseEntity set the HTTPStatus as BAD_REQUEST.
 




 3.0 Expected Table Structure

The below table should get created automatically by the application




Team








Player






Note: team_id is the join column in the Player table




One Player object is related to one Team object and one Team object can be related to multiple Player objects.




4.0 Process Flow




 



 






•Client invokes the required service.


•TeamController invokes the method of the TeamServiceImpl and PlayerController invokes the method of the PlayerServiceImpl


•TeamServiceImpl invokes the method of the TeamDAOImpl and PlayerServiceImpl invokes the method of the PlayerDAOImpl


•TeamDAOImpl with the help of TeamRepository performs the service and returns the data to TeamServiceImpl


•PlayerDAOImpl with the help of PlayerRepository performs the service and returns the data to PlayerServiceImpl


•ITeamService has to be injected into the TeamController


•ITeamDAO has to be injected into the TeamServiceImpl


•TeamRepository has to be injected in to the TeamDAOImpl


•IPlayerService has to be injected into the PlayerController


•IPlayerDAO has to be injected into the PlayerServiceImpl


•PlayerRepository has to be injected into the PlayerDAOImpl


•The TeamRepository interface and PlayerRepository interface should use the appropriate Spring Data JPA methods for all the database related manipulation. 





 4.0 Overall Design Constraints

1. Donot change the property name given in the application.propertiesfiles, you can change the value and you can include additionalproperties if needed.


2. Inthe pom.xml you are provided with all the dependencies needed fordeveloping the application.  


3. Useonly Spring data JPA to handle persistence. Do not generate valuefor the primary key attribute automatically.


4. Usethe service type and the service names as expected in thespecification


5.Adhere to the design specifications mentioned in the case study.


6.Do not change or delete the class/method names or return types which are provided to you as a part of the code skeleton.


7. Pleasemake sure that your code does not have any compilation errors whilesubmitting your case study solution.



*/


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Player {

	@Id
	private String playerId;
	private String playerName;
	private String playerRole;
	private int totalRunsScored;
	@ManyToOne
	@JoinColumn(name="team_id")
	private Team teamObj;

	public Player() {
		super();
	}

	public Player(String playerId, String playerName, String playerRole, int totalRunsScored, Team teamObj) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerRole = playerRole;
		this.totalRunsScored = totalRunsScored;
		this.teamObj = teamObj;
	}

	

	
	

	
	

}
