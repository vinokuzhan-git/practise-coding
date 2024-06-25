package com.system.design.low.level.luddo;

public class LuddoMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LuddoBoard l = new LuddoBoard();
		l.initializeGame(6);
		while(l.players.size() > 1)
			l.playGame();
		
		System.out.println("Game Completed !!");
		
	}

}
