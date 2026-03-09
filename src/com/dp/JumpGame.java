package com.dp;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,1,1,4};
		int maxJump = 0;
		for(int i=0;i<arr.length-1;i++) {
			if(i > maxJump ) {
				System.out.println(false);
				break;
			}
			maxJump = Math.max(maxJump,arr[i]+i);
		}
		
		if(maxJump >= arr.length-1) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}

	}

}
