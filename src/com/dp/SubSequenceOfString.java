package com.dp;

public class SubSequenceOfString {

	public static void main(String[] args) {
	
		subSeq("abc",0,"");

	}
	
	public static void subSeq(String str,int index,String output) {
		if(index == str.length()) {
			System.out.println(output);
			return;
		}
		subSeq(str,index+1,output+str.charAt(index));
		subSeq(str,index+1,output);
	}

}
