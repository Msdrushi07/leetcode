package com.dp;

import java.util.Arrays;

public class HouseRobber2 {

	public static void main(String[] args) {
		int arr[] = {2,3,2};
		int arr1[] = Arrays.copyOfRange(arr, 0,arr.length-1);
		int arr2[] = Arrays.copyOfRange(arr, 1,arr.length);
	    int a = houseRobber(arr1,0);
	   int b =  houseRobber(arr2,0);
	   System.out.println(Math.max(a, b));
	    

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