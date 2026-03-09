package com.array;

import java.util.ArrayList;
import java.util.List;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4};
		// brute force 
		List<Integer> result = new ArrayList<>();  
		for(int i=0;i<arr.length;i++) {
			int product = 1;
			for(int j=0;j<arr.length;j++) {
				if( i != j) {
					product = product * arr[j];
				}
			}
			result.add(product);
		}
			System.out.println(result);
			
	// product of left and product of right
			int result1[] = new int[arr.length];
			result1[0] = arr[0];
			for(int i=1;i<arr.length;i++) {
				result1[i] = arr[i-1] * result1[i-1];
			}
			int right = 1;
			for(int i=arr.length-1;i>=0;i--) {
				result1[i] = right * result1[i];
				right = right * arr[i];
			}
			for(int i=0;i<result1.length;i++) {
				System.out.print(result1[i]+" ");
			}
	}

}
