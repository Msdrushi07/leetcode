package com.dp;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]  = {2,3,5};
		int res = combinationSum(arr,0,8);
		System.out.println(res);
		
		List<Integer> ds  = new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		combinationSum1(arr,0,8,ds,ans);
		System.out.println(ans);
	}
	
	public static int combinationSum(int arr[],int index,int target) {
		if(index == arr.length) {
			if(target == 0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		int a = combinationSum(arr,index+1,target);
		int b = 0;
		if(arr[index] <= target) {
			b = combinationSum(arr,index,target-arr[index]);
		}
		return a+b;
	}
	
	public static void combinationSum1(int arr[],int index,int target,List<Integer> ds,List<List<Integer>> ans) {
		if(target == 0) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		for(int i=index;i<arr.length;i++) {
			if(arr[i] <= target) {
				ds.add(arr[i]);
				combinationSum1(arr,i,target-arr[i],ds,ans);
				ds.remove(ds.size()-1);
			}
		}
	}
	
	
	}


