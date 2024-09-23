package com.learningSpring.learning_Spring.working;
import com.learningSpring.learning_Spring.game.*;

public class AppGamingBasicJava {
	public static void main() {
		
		var game = new GameMario();//1. object creation 
		var	GameRunner = new GameRunner(game);
		//2. object creation + wiring of dependancy of GameRunner
		
		
		
	}

}
