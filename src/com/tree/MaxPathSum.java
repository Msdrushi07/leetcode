package com.tree;

public class MaxPathSum {
	
	static int max = Integer.MIN_VALUE;

	public static void main(String[] args) {
		
		Node root = new Node(-10);
		root.left = new Node(9);
		root.right = new Node(20);
		root.right.left = new Node(15);
		root.right.right = new Node(7);
		 maxPathSum(root);
		System.out.println(max);
	}
	
	public static int maxPathSum(Node node) {
		if(node == null) {
			return 0;
		}
		
		int left = maxPathSum(node.left);
		int right = maxPathSum(node.right);
		int sum = left+right+node.value;  // sum of path at current node
		max = Math.max(max, sum);
		return Math.max(left, right)+node.value;  // path with max sum or max path sum	
	}
}
