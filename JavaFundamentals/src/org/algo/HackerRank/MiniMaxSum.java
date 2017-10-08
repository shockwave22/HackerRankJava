package org.algo.HackerRank;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int min=0,max=0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        int j=0;
        int sum=0;
        for(int i=0;i<5;i++){
        	for(j=i+1;j<=5;j++){
        		sum+=arr[j];
        		
        	}
        	min=Math.min(sum, min);
        	max=Math.max(sum, max);
        }
        System.out.println(min);
        System.out.println(max);

	}

}
