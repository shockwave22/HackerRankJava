/**
 * 
 */
package org.algo.HackerRank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author monish
 *
 */
public class CompareTriplets {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int Alice = ((a0>b0)?1:0)+((a1>b1)?1:0)+((a1>b1)?1:0);
        int bob = ((a0<b0)?1:0)+((a1<b1)?1:0)+((a2<b2)?1:0);
        
        System.out.println(Alice+" "+bob);


	}

}
