package com.string;

import java.util.Arrays;

public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="anagram";
		String t ="nagaram";
		char[] char1 = s.toCharArray();
		char[] char2 = t.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		boolean result = Arrays.equals(char1, char2);
		System.out.println(result);
	}

}
