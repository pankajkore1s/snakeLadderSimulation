package com.snakeLadderSimulation;

public class snakeLadderSimulation {

	public static final int winPosition=100;
	public static boolean isPlayer=true;
	public static void main (String []args) {

		int initialPosition=0;
		int numberOfDice=0;
		int playerAPosition=0;
		int playerBPosition=0;
		System.out.println("Welcome to SnakeLadder Simulation");

		while( playerAPosition < winPosition && playerBPosition < winPosition){
			numberOfDice++;
			int dice=(int)(Math.random()*6)+1;
			System.out.println("Number got on dice=" +dice);
			int checkOption=(int)(Math.random()*3)+1;
			System.out.println("checking option=" +checkOption);

			switch(checkOption) {
			case 1: //ladder
				if(isPlayer) {
					if ((playerAPosition+dice)<=winPosition)
						playerAPosition=playerAPosition+dice;
						isPlayer=false;
						System.out.println("position of the player A=" +playerAPosition);
						
				}
				else {
					isPlayer=true;
					if ((playerBPosition+dice) <=winPosition)
						playerBPosition=playerBPosition+dice;
					System.out.println("Position of the player B: " + playerBPosition);
				}
				break;
			case 2: //snake
				if (isPlayer) {
					isPlayer=false;
					playerAPosition-=dice;
					if ((playerAPosition-dice)<0)
					playerAPosition=0;	
					System.out.println("position of the player A=" +playerAPosition);
				}
				else {
					isPlayer=true;
					playerBPosition-=dice;
					if((playerBPosition-dice)<0)
						playerBPosition=0;
					System.out.println("position of the player B=" +playerBPosition);
				}
				break;
				
			case 3: //NoPlay
				if(isPlayer) {
					isPlayer=false;
					System.out.println("No Play for player A=" + playerAPosition);
				}
				else {
					isPlayer=true;
					System.out.println("No Play For Player B=" + playerBPosition);
				}
					break;

			}
		} 
		System.out.println("total number of times dice rolled=" +numberOfDice);
		if(playerAPosition==winPosition) {
			System.out.println("player A is Winner");
		}
		else {
			System.out.println("player B is Winner");
		}
	}
}