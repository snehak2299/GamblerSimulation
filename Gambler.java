package com.bridglab.gamblersimulation;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Gambler {
	
	public static int month(int []arr) {
		int max = Arrays.stream(arr).max().getAsInt(),a = 0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==max) {
				a = i+1;
				break;
			}
		}
		return a ;
	}

	public static void main(String[] args) {
		int everyDay = 100;
		final int betPerGame = 1;
		int wins = 0;
		int lost = 0;
		int totalStake = everyDay;
		int []days = new int[30];
		int noOfDays =0;
		Random var = new Random();
		int min= days[0];
		int max=0;
		
		
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
				System.out.println("The amount lost on "+(i+1) + " is: " + ( totalStake+days[i] ));
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
		for(int i=0; i<days.length; i++ ) {
	         if(days[i]>=max) {
	            max = days[i];
	         }
	         System.out.println("lucky day"+ max);
		}
		if(wins>lost) {
			System.out.println("congragulation you won for this month! if you want to continue playing YES or NO");
			Scanner sc = new Scanner(System.in);
			String answer = sc.next();
			if(answer.equals("NO")) {
				System.out.println("stop playing");
			}
		}
		
	    
	
	}

}
