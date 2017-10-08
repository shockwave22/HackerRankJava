/**
 * 
 */
package org.algo.HackerRank;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author monish
 *
 */
public class PlusMinus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	        int n=scn.nextInt();
	        int[] a=new int[n];
	        DecimalFormat df = new DecimalFormat("#0.000000"); 
	        double pos=0,neg=0,mid=0;
	        //Read the array of integers
	        for(int i=0;i<n;i++){
	            a[i]=scn.nextInt();
	            if(a[i]<0)
	                neg++;
	            else if(a[i]>0)
	                pos++;
	            else
	                mid++;
	        }
	        
	        System.out.println(df.format(pos/n));

	}

}
