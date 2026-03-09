package com.string;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "(){[]";
		Stack<Character> stack =  new Stack<>();
		for(int i=0;i<str.length();i++) {
			char bracket = str.charAt(i);
			if(bracket == '(' || bracket == '{' || bracket == '[' ){
				stack.push(bracket);
			}
			else {
				if(bracket == ')' && stack.pop() != '(' || 
				   bracket == '}' && stack.pop() != '{' ||
				   bracket == ']' && stack.pop() != '[') {
					System.out.println(false);
				}
			}
		}
		System.out.println(stack.empty());
	}

}
