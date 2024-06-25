package com.system.design.low.level.luddo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class LuddoBoard {
	
	Queue<Player> players = new LinkedList<>(); 
	int maxposition=100;
	HashMap<Integer,Jump> jumpposition = new HashMap<>();
	
	public void initializeGame(int noofplayers)
	{
		for(int i=0;i<noofplayers;i++)
			players.add(new Player(i+1,1));
		
		jumpposition.put(7, new Jump(7,26,"Stairs"));
		jumpposition.put(13, new Jump(13,55,"Stairs"));
		jumpposition.put(21, new Jump(21,78,"Stairs"));
		jumpposition.put(36, new Jump(36,64,"Stairs"));
		jumpposition.put(46, new Jump(46,6,"Snake"));
		jumpposition.put(47, new Jump(47,68,"Stairs"));
		jumpposition.put(50, new Jump(50,92,"Stairs"));
		jumpposition.put(52, new Jump(52,27,"Snake"));
		jumpposition.put(60, new Jump(60,19,"Snake"));
		jumpposition.put(61, new Jump(61,96,"Stairs"));
		jumpposition.put(99, new Jump(99,9,"Snake"));
		jumpposition.put(67, new Jump(67,86,"Stairs"));
	}
	
	public void playGame()
	{
		Player p = players.poll();
		int diceval=rotateDice();
		
		int val=diceval;
		val = p.currentPosition+val;
		if(val > 100)
		{
			players.add(p);
			System.out.println("Invalid input : " +val+". Please play Again !!");
			return;
		}
		if(jumpposition.containsKey(val))
		{	
			System.out.println("Player" +p.id+" Type : "+jumpposition.get(val).type+" : Jumping from "+val+ " to "+jumpposition.get(val).destination);
			val=jumpposition.get(val).destination;
		}
		p.currentPosition=val;
		System.out.println("Player" +p.id+" : Current Position : "+p.currentPosition+" : diceval : "+diceval);
		if(!(isGameComplete(val)))
			players.add(p);
		else
			System.out.println("Player" +p.id+" Won the Game !!");
		
	}
	
	public int rotateDice()
	{
		return (int)(Math.random()*12)+1;
	}
	public boolean isGameComplete(int position)
	{
		return position == 100?true:false;
	}

}
