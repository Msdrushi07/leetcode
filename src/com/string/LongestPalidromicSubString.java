package com.string;

public class LongestPalidromicSubString {

	public static void main(String[] args) {
		
		String str = "cbbd";
		int maxLength = 0;
		int start = 0;
		int end = 0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
		   int length1 = expandFromCenter(str,i,i);
			int length2 =expandFromCenter(str,i,i+1);
			maxLength = Math.max(length1, length2);
			if(maxLength > end-start) {
				start = i-(maxLength-1)/2;
				end = i+maxLength/2;
			}
		}
		System.out.println(str.substring(start, end+1));

	}
	
	private static int expandFromCenter(String str, int start, int end) {
	
		while(start>=0 && end < str.length() && str.charAt(start) == str.charAt(end)) {
			start--;
			end++;
		}
		return end-start-1;
		
	}

}
