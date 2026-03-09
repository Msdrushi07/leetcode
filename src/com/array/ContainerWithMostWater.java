package com.array;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,8,6,2,5,4,8,3,7};
		int max = 0;
		int start = 0;
		int end = arr.length-1;
		while(start < end) {
			int distance = end-start;
			int min = Math.min(arr[start],arr[end]);
			int water = distance * min;
			max = Math.max(max, water);
			if(arr[start]<arr[end]) {
				start++;
			}else {
				end--;
			}
		}
		System.out.println(max);

	}

}
