package com.string;

import java.util.HashMap;
import java.util.Map;

public class LongestRepCharReplacement {

	public static void main(String[] args) {
		
		String str = "AABABBA";
		int k = 1;
		int start = 0;
		int max = 0;
		int mostFreqChar = 0;
		Map<Character,Integer> map = new HashMap<>();
		for(int end=0;end<str.length();end++) {
			char ch = str.charAt(end);
			map.put(ch,map.getOrDefault(ch,0) + 1);
			mostFreqChar = Math.max(mostFreqChar,map.get(ch));
			while((end-start+1)-mostFreqChar > k) {
				char charAtStart = str.charAt(start);
				map.put(charAtStart,map.get(charAtStart)-1);
				start++;
			}
			max = Math.max(max,end-start+1);
		}
		System.out.println(max);
	}

}
