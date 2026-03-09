package com.array;

public class BuyAnsSellStock {

	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		int maxProfit = 0;
		
		// brute force
		for(int  i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
			maxProfit = Math.max(maxProfit,prices[j]-prices[i]);	
			}		
		}
		System.out.println(maxProfit);
		
		// using min cost buy and max sell
		int min  = prices[0];
		for(int i=1;i<prices.length;i++) {
			min = Math.min(min,prices[i]);
			maxProfit = Math.max(maxProfit,prices[i]-min);
		}
		System.out.println("max profit is "+maxProfit);
		

	}

}
