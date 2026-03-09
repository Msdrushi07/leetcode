package com.array;

public class FindMinInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,5,1,2};
		int start = 0;
		int end = arr.length-1;
		int min = Integer.MAX_VALUE;
		while(start < end) {
			int mid = start + (end -start)/2;
			if(arr[start] < arr[mid]) {
				min = Math.min(min,arr[start]);
				start = mid+1;
			}
			else {
				min = Math.min(min, arr[mid]);
				end = mid - 1;
			}
		}
		
		System.out.println(min);

	}

}
