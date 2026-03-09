package com.dp;

public class CoinChange {

	public static void main(String[] args) {
	
		int arr[] = {1,2,5};
		System.out.println(coinChange(arr,0,11));

	}
	
	public static int coinChange(int arr[],int index,int amount) {
		if(index == arr.length) {
			if(amount == 0) {
				return 0;
			}
			else {
				return (int) 1e9;
			}
		}
		int b=  (int) 1e9;  // we have initialised with ae9 to avoid integer overflow if we do 1+Integer.maxvalue = -2147483648
		int a = coinChange(arr,index+1,amount);
		if(arr[index] <= amount) {
		 b = 1+coinChange(arr,index,amount-arr[index]);
		}
		return Math.min(a, b);
	}

}
