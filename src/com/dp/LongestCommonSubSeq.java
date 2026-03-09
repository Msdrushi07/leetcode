package com.dp;

public class LongestCommonSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = lonComSubSeq("acd",0,"ced",0);
		System.out.println(res);
		

	}
	
	public static int lonComSubSeq(String str1,int index1,String str2,int index2) {
		if(index1 == str1.length() || index2 == str2.length()) {
			return 0;
		}
		int a = Integer.MIN_VALUE;
		int b= Integer.MIN_VALUE;
		
		if(str1.charAt(index1) == str2.charAt(index2) ) {
			a = 1+lonComSubSeq(str1,index1+1,str2,index2+1);
		}
		b= Math.max(lonComSubSeq(str1,index1,str2,index2+1),lonComSubSeq(str1,index1+1,str2,index2));
		return Math.max(a, b);
	}

}
