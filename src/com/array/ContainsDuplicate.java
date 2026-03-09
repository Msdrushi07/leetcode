package com.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int arr[] = {1,2,3,1};
		
		// using hashset
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(!set.add(arr[i])) {
				System.out.println(true);
				break;
			}
		}
		System.out.println(false);
		
		// if array is sorted then use two pointers
		int arr1[] = {1,1,2,3,3,4,5,5};
		int result[] = new int[arr1.length];
		result[0] = arr1[0];
		int index = 1;
		for(int i=1;i<arr1.length;i++) {
			if(arr1[i] != arr1[i-1]) {
				result[index++] = arr1[i];
			}
		}
		for(int i=0;i<index;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
