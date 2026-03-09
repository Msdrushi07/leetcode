package com.array;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,6,7,0,1,2};
		int target = 0;
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			int mid = start + (end-start)/2;
			for(int i=start;i<=mid;i++) {
				if(arr[i] == target) {
					System.out.println("element found at index :"+i);
					break;
				}
			}
		start = mid+1;
		}

	}

}
