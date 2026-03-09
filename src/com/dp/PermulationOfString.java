package com.dp;

public class PermulationOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permulation("abc",0,"");

	}
	
	public static void permulation(String str,int index,String output) {
		
		if(index == str.length()) {
			System.out.println(output);
			return;
		}
		char ch = str.charAt(index);
		for(int i=0;i<=index;i++) {
			String ch1 = output.substring(0,i);
			String ch2 = output.substring(i,output.length());
			permulation(str,index+1,ch1+ch+ch2);
		}
		
	}

}
