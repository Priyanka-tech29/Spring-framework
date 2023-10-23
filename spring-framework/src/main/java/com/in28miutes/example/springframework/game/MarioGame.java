package com.in28miutes.example.springframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//when you have multiple component then @Component then to run the application we can make primary one of them @Primary
//we can not make two component as a primary
@Component
@Primary
public class MarioGame implements GameConsole  {
	
	public void start() {
		System.out.println("Mario  game is running====");
	}
	public void up() {
		System.out.println("up");
	}
	public void down() {
		System.out.println("down");
	}
	public void right() {
		System.out.println("right");
	}
	public void left() {
		System.out.println("left");
	}

}
