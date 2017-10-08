package org.algo.HackerRank;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int n=scn.nextInt();
	    String s="#";
	    int count=1;
        for(int i=1;i<=n;i++){
        	for(int j=1;j<=(n-i);j++){
        		System.out.print(" ");
        	}
            System.out.println(s);
            s=s.concat("#");
        }

	}

}
