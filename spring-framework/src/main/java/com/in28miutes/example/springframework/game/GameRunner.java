package com.in28miutes.example.springframework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

	@Autowired
	private GameConsole game;

	public GameRunner(GameConsole game) {

		this.game = game;
	}

	public void run() {

		game.start();
		game.up();
		game.down();
		game.left();
		game.right();

	}

}
