package com.in28miutes.example.springframework.game;

//@Component
public class SuperContra implements GameConsole{
	
	
	public void start() {
		System.out.println("SuperContra game is running====");
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
