package com.learningSpring.learning_Spring.game;

import org.springframework.stereotype.Component;

@Component

public class Pacman implements GamingConsole {

	@Override
	public void up() {
	   System.out.println("Pacmanup");
		
	}

	@Override
	public void down() {
		System.out.println("Pacmandown");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Pacmanleft");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("pacmanright");
	}
 
}
