package org.algo.HackerRank;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			boolean isPrime=true;
			int temp;
			
			System.out.println("Enter the number");
			int number = scn.nextInt();
			for(int i=2;i<=number/2;i++){
				temp=number%i;
				
				if(temp==0){
					isPrime=false;
					break;
				}
			}
			
			if(isPrime)
				System.out.println(number +" is prime");
			else
				System.out.println(number +" is not prime");
	}

}
