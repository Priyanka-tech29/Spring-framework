//import com.in28miutes.example.springframework;
package com.in28miutes.example.springframework.game;

import org.springframework.stereotype.Component;

@Component
public interface GameConsole {
	void start();
	void up();
	void down();
	void left();
	void right();

}
