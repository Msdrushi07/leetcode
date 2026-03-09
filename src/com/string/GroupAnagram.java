package com.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		Map<String,List<String>> map = new HashMap<>();
		for(int i=0;i<strs.length;i++) {
			String str = strs[i];
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<chars.length;j++) {
				sb.append(chars[j]);
			}
			String sorted = sb.toString();
			map.putIfAbsent(sorted,new ArrayList<>());
			map.get(sorted).add(str);
			
		}
		System.out.println(map.values());

	}

}
