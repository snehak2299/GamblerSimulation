package com.bridglab.gamblersimulation;
import java.util.Random;

public class Gambler {

	public static void main(String[] args) {
		int everyDay = 100;
		final int betPerGame = 1;
		int wins = 0;
		int lost = 0;
		int totalStake = everyDay;
		int []days = new int[30];
		int noOfDays =0;
		Random var = new Random();
		
		while(noOfDays<30) {
			int day = var.nextInt(15);
			for(int i=0;i<day;i++) {
				if(Math.random()<0.5) {
					wins+=1;
					everyDay+=betPerGame;
				}
				else {
					lost-=1;
					everyDay-=betPerGame;
				}
				
			}
			   days[noOfDays]=everyDay;
			 noOfDays++;
			
		}
		for(int i = 0 ; i < days.length ; i++ ) {
			if ( days[i] < totalStake ) {
				System.out.println("The amount lost on "+(i+1) + " is: " + (days[i] ));
			}
			else if ( days[i] > totalStake ) {
				System.out.println("The amount won on " + (i+1) + " is: " + ( days[i] - totalStake ));
			}
			else {
				System.out.println("The amount was not lost or won on day " + (i+1));
			}
		}
		System.out.println("total amount won in month:"+wins);
		System.out.println("total amount loss in month:"+lost);
		
		
	}

}
