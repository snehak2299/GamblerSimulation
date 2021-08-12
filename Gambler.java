package com.bridglab.gamblersimulation;
import java.util.Random;

public class Gambler {

	public static void main(String[] args) {
		int everyDay = 100;
		final int betPerGame = 1;
		int wins = 0;
		int totalStake = everyDay;
		double resignAmount = 0.5;
		int noOfDays =0;
		Random var = new Random();
		
		while(noOfDays<20) {
			int day = var.nextInt(15);
			for(int i=0;i<day;i++) {
				if(Math.random()<0.5) {
					wins+=1;
					everyDay+=betPerGame;
				}
				else {
					wins-=1;
					everyDay-=betPerGame;
				}
				noOfDays++;
				
			}
		}
		if(everyDay>totalStake) {
			System.out.println("gambler loss after 20 days amount:"+(everyDay-totalStake)+"$");
		}
		else if(everyDay<totalStake) {
			System.out.println("gambler won after 20 days amount:"+(totalStake-everyDay)+"$");
		}
		else {
			System.out.println("same as exact amount");
		}

	}

}
