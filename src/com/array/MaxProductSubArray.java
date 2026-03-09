package com.array;

public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,-2,4};
		int currentMaxProduct = 0;
		int overallProduct = 0;
		for(int i=0;i<arr.length;i++) {
			int product = 1;
			for(int j=i;j<arr.length;j++) {
				product = product * arr[j];
				currentMaxProduct = Math.max(currentMaxProduct,product);
				overallProduct = Math.max(currentMaxProduct, overallProduct);
			}

		}
		System.out.println(overallProduct);

	}

}
