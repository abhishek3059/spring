package com.learningSpring.learning_Spring.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GamingConsole {

	@Override
	public void up() {
	   System.out.println("up");
		
	}

	@Override
	public void down() {
		System.out.println("down");
		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("left");
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("right");
	}
 
}
