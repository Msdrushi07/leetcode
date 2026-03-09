package com.dp;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,5,1};
		System.out.println(houseRobber(arr,0));

	}
	
	public static int houseRobber(int arr[],int index) {
		if(index > arr.length-1) {
			return 0;
		}
		int a = houseRobber(arr,index+1);
		int b = arr[index] + houseRobber(arr,index+2);
		return Math.max(a, b);
	}

}
