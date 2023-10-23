package com.in28miutes.example.springframework.game;

import org.springframework.stereotype.Component;

@Component
public class PocMan implements GameConsole{
	
	
	public void start() {
		System.out.println("PocMan game is running====");
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
