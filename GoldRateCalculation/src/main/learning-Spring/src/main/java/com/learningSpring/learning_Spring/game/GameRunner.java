package com.learningSpring.learning_Spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class GameRunner {
GamingConsole game;
public GameRunner ( @Qualifier("SuperContraQualifier") GamingConsole game ) {
	this.game = game; 
}
public void run() {
	game.up();
	game.down();
	game.right();
	game.left();
}
}
	