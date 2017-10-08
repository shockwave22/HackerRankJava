package org.algo.HackerRank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MergeArrays {
	
	static int[] mergeArrays(int[] a, int[] b){
		int aLen = a.length;
		int bLen= b.length;
		//int c[] = (int[])ArrayUtils.
		//System.arraycopy(a, 0, c, 0, aLen);
		//System.arraycopy(b, 0, c, 0, bLen);
		DecimalFormat df = new DecimalFormat("#.00"); 
		return null;
	}
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int n=scn.nextInt();
		
		int[][] arr=new int[n][n];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=scn.nextInt();
			}
		}
		int lsum=0;
		int rSum=0;
		
		for(int i=0;i<arr.length;i++){
			lsum+=arr[i][i];
			
			
		}
		for(int j=1;j<=n;j++){
			rSum+=arr[j-1][n-j];
		
		}
		System.out.println("");
		System.out.println("lsum= "+lsum+" Rsum= "+rSum);
		
		System.out.println(Math.abs(lsum-rSum));
		
	}

}
