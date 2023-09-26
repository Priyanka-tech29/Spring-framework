package com.in28miutes.example.springframework;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28miutes.example.springframework.enterprise.web.MyWebController;
import com.in28miutes.example.springframework.game.GameRunner;


@SpringBootApplication
public class SpringFrameworkApplication {

	public static void main(String[] args) {
		
		//take spring application and assign it to a local variable name as context who manage all our beans
		ConfigurableApplicationContext context = SpringApplication.run(SpringFrameworkApplication.class, args);
		
		/* which game you want to run you have to uncomment particular game
		
		1.PocMan game = new PocMan();
		2.SuperContra game  = new SuperContra();
		3.MarioGame game = new MarioGame();
		
	    ---we can uncomment which game we want to run and import related package--
		GameConsole game = new MarioGame();
	    GameRunner runner = new GameRunner(game);
	    runner.run();
	    
		---- we already create these two classes using @Component and @Autowired---------*/
		//GameConsole game = new MarioGame();
	   // GameRunner runner = new GameRunner(game);
		
		/*----
		1)to get specific bean from spring framework you can do that by calling method contex.getBean();
		2)any instance of any component that spring create is called bean
		3)what bean do we want, we want instance of game runner class
		4)assign statement to a local variable runner 
		------
		----note---
		   GameRunner class has dependency on GameCosole class so we have instance of GameConsole is MarioGame now Take MarioGame and
		   @Autowired it into GameRunner class
		   */
		
		 GameRunner runner=context.getBean(GameRunner.class);
		 runner.run();
		 
		 //--here we need instance of Controller class
		 MyWebController controller =  context.getBean(MyWebController.class);
		 System.out.println(controller.returnValueFromBussinessService());
	}

}
