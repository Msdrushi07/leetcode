package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-1,0,1,2,-1,-4};
		Arrays.sort(arr);
		List<List<Integer>> result = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			int start = i+1;
			int end = arr.length-1;
			while(start < end) {
				int sum = arr[start]+arr[end]+arr[i]; 
				if(sum == 0) {
					List<Integer> nums = new ArrayList<>();
					nums.add(arr[start]);
					nums.add(arr[end]);
					nums.add(arr[i]);
					result.add(nums);
					start++;
					end--;
				}
				else if(sum < 0) {
					start++;
				}
				else {
					end--;
				}
			}
		}
		System.out.println(result);

	}

}
