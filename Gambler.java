package com.bridglab.gamblersimulation;

public class Gambler {

	public static void main(String[] args) {
		int everyDay = 100;
		final int betPerGame = 1;
		int wins = 0;
		if(Math.random()<0.5) {
			wins+=1;
			everyDay=everyDay+betPerGame;
			System.out.println(everyDay);
		}
		else {
			wins-=1;
			everyDay=everyDay-betPerGame;
			System.out.println(everyDay);
		}

	}

}
