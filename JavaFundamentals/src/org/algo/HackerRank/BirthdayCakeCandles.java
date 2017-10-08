package org.algo.HackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

	 static int birthdayCakeCandles(int n, int[] ar) {
	        Arrays.sort(ar);
		 	int max=ar[n-1];
	        int count=0;
	        
	        for(int i=n-1;i>=0;i--){
	        	System.out.println("ar[] : "+ar[i]+ " i: "+i);
	        	if(ar[i]==max) count++;
	        
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar = new int[n];
	        for(int ar_i = 0; ar_i < n; ar_i++){
	            ar[ar_i] = in.nextInt();
	        }
	        int result = birthdayCakeCandles(n, ar);
	        System.out.println(result);
	     }

}
