package com.dp;

public class UniquePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = uniquePath(3-1,2-1);
		System.out.println(res);
		int m=3,n=2;
		System.out.println(uniquePath1(m-1,n-1,0,0));
		
		uniquePathDisplay(3-1,2-1,"");

	}
	
	public static int uniquePath(int row,int column) {
		if(row == 0 || column == 0) {
			return 1;
		}
	
		return uniquePath(row-1,column) + uniquePath(row,column-1);
	
	}
	
	public static int uniquePath1(int row,int column,int i, int j) {
		if(i == row || j == column) {
			return 1;
		}
		return uniquePath1(row,column,i+1,j) + uniquePath1(row,column,i,j+1);
	}
	
	public static void uniquePathDisplay(int row,int column,String output) {
		if(row == 0 && column == 0) {
			System.out.println(output);
			return;
		}
		int a=0,b=0;
		if(row > 0) {
			uniquePathDisplay(row-1,column,output+"D");
		}
		if(column > 0) {
			uniquePathDisplay(row,column-1,output+"R");
		}
		
		
	}

}
