package com.snakeLadderSimulation;

public class snakeLadderSimulation {
	
	public static final int winPosition=100;
	
	public static void main (String []args) {

		int initialPosition=0;
		int numberOfDice=0;
		int playerAPosition=0;
		int playerBPosition=0;
		System.out.println("Welcome to SnakeLadder Simulation");

	while( playerAPosition < winPosition && playerBPosition < winPosition){
		int dice=(int)(Math.random()*6)+1;
		System.out.println("Number got on dice=" +dice);
		int checkOption=(int)(Math.random()*3)+1;
		System.out.println("checking option=" +checkOption);
		
		switch(checkOption) {
		case 1: //ladder
				playerAPosition=playerAPosition+dice;
				System.out.println("position of the player A=" +playerAPosition);
				break;
		case 2: //snake
				playerAPosition-=dice;
				System.out.println("position of the player A=" +playerAPosition);
				break;
		case 3: //NoPlay
				System.out.println("No Play");
				break;
				
		}
	} 

}
}