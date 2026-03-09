package com.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LongestSubStringWithoutRepChar {

	public static void main(String[] args) {
	String str = "abcabcbb";
	int start = 0;
	int maxLength = 0;
	Set<Character> set = new HashSet<>();
	for(int end=0;end<str.length();end++) {
		char ch = str.charAt(end);
		if(set.contains(ch)) {
			while(set.contains(ch)) {
				set.remove(ch);
				start++;
			}
			
			
		}
		set.add(ch);
		maxLength = Math.max(maxLength,end-start+1);
	}
	System.out.println(maxLength);
	}

}
