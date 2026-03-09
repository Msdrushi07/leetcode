package com.tree;

import java.util.Arrays;

public class ConstructBinaryTreeFromPreAndPost {
	public static void main(String[] args) {
		int[] pre = {3,9,20,15,7};
		int[] in = {9,3,15,20,7};
		Node res = constructBinaryTreeFromPreAndPost(pre,in);
		System.out.println(res.value);
		System.out.println(res.left.value);
		System.out.println(res.right.value);
		System.out.println(res.right.left.value);
		System.out.println(res.right.right.value);
	}
	
	public static Node constructBinaryTreeFromPreAndPost(int[] pre,int[] in) {
		if(pre.length == 0) {
			return null;
		}
		int rootvalue = pre[0];
		Node node = new Node(rootvalue);
		int index = 0;
		for(int i=0;i<in.length;i++) {
			if(rootvalue == in[i]) {
				index = i;
			}
		}
		node.left = constructBinaryTreeFromPreAndPost(Arrays.copyOfRange(pre,1, index+1),Arrays.copyOfRange(in,0,index));
		node.right = constructBinaryTreeFromPreAndPost(Arrays.copyOfRange(pre,index+1,pre.length),Arrays.copyOfRange(in,index+1,in.length));
		return node;
	}

}
