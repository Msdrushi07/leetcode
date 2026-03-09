package com.array;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
	
	public static void main(String[] args) {
		int arr[] = {2,7,11,15};
		int target = 9;
		
		// brute force approach
		List<Integer> result = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == target) {
					result.add(i);
					result.add(j);
					break;
				}
			}
		}
		
		System.out.println(result);
		
		//using two pointers
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			int sum = arr[start]+arr[end];
			if(sum == target) {
				System.out.println("indices are :"+start+" "+end);
				break;
			}
			else if(sum < target) {
				start++;
			}
			else {
				end--;
			}
		}
	}

}
