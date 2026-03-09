package com.dp;

public class LongestIncreasingSubSequense {

	public static void main(String[] args) {
		int arr[] = {10,9,2,5,3,7,101,18};
		int res = LongestInSubSeq(arr,0,-1);
		System.out.println(res);
	}
	
	public static int LongestInSubSeq(int arr[],int index,int prev) {
		if(index == arr.length) {
			return 0;
		}
		
		int a = LongestInSubSeq(arr,index+1,index);
		int b = Integer.MIN_VALUE;
		if(prev == -1 || arr[index] > arr[prev]) {
		 b = 1+LongestInSubSeq(arr,index+1,index);
		}
		return Math.max(a, b);
	}

}
