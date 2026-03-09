package com.array;

public class maxSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		int currentMax = arr[0];
		int overallMax = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			currentMax = Math.max(arr[i],arr[i]+currentMax);
			overallMax = Math.max(overallMax,currentMax);
		}
		
		System.out.println(overallMax);

	}

}
