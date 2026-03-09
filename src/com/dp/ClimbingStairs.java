package com.dp;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climb(2));
		System.out.println(climb1(2));
			
		
	}
	
	public static int climb(int n) {
		if(n == 0) {
			return 1;
		}
		int a=0,b=0;
		if(n>0) {
			a= climb(n-1);
		}
		if(n>1) {
			b= climb(n-2);
		}
		return a+b;
	}
	
	public static int climb1(int n) {
		if(n <= 2) {
			return n;
		}
		return climb1(n-1)+climb1(n-2);
	}

}
