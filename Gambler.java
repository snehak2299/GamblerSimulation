package com.bridglab.gamblersimulation;

public class Gambler {

	public static void main(String[] args) {
		int everyDay = 100;
		final int betPerGame = 1;
		int wins = 0;
		int totalStake = everyDay;
		double resignAmount = 0.5;
		while(everyDay>(int)(totalStake*resignAmount) && everyDay<=(int)(totalStake+(totalStake*resignAmount))) {
			if(Math.random()<0.5) {
				wins+=1;
				everyDay+=betPerGame;
			}
			else {
				wins-=1;
				everyDay-=betPerGame;
			}
		}
		if(everyDay==(int)(totalStake*resignAmount)) {
			System.out.println("gambler stop playing due to lossing");
		}
		else {
			System.out.println("gambler stop playing due to winning");
		}

	}

}
