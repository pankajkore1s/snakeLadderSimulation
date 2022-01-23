package com.snakeLadderSimulation;

public class snakeLadderSimulation {
	
	public static boolean isPlayer=true;
	public static final int winPosition=100;
	
	public static void main (String []args) {

		int initialPosition=0;
		int numberOfDice=0;
		int playerAPosition=0;
		int playerBPosition=0;
		System.out.println("Welcome to SnakeLadder Simulation");

		int dice=(int)(Math.random()*6)+1;
		numberOfDice++;
		System.out.println("Number got on dice=" +dice);
	} 

}
