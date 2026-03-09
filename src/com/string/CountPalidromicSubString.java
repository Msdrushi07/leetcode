package com.string;

public class CountPalidromicSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abc";
		int maxCount = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			maxCount = maxCount+expandFromCenter(str,i,i);
			maxCount = maxCount+expandFromCenter(str,i,i+1);
			
		}
		System.out.println(maxCount);

	}

	private static int expandFromCenter(String str, int start, int end) {
		int count = 0;
		while(start>=0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
			count++;
			start--;
			end++;
		}
		return count;
		
	}

}
