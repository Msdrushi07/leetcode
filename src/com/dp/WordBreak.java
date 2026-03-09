package com.dp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "leetcode";
		List<String> worddict = Arrays.asList("leet","code");
		Set<String> set = new HashSet<>(worddict);
		boolean dp[] = new boolean[str.length()+1];
		dp[0] = true;
		for(int i=1;i<=str.length();i++) {
			for(int j=0;j<i;j++) {
				if(dp[j] && set.contains(str.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		System.out.println(dp[dp.length-1]);
		System.out.println(dp[str.length()]);
		

	}

}
