package com.tree;

public class MaxDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(3);
		root.left = new Node(9);
		root.right = new Node(20);
		root.right.left = new Node(15);
		root.right.right = new Node(7);
		int res = depthOfBinaryTree(root);
		System.out.println(res);

	}
	
	public static int depthOfBinaryTree(Node node) {
		if(node == null) {
			return 0;
		}
		
		int left = depthOfBinaryTree(node.left);
		int right = depthOfBinaryTree(node.right);
		
		return Math.max(left, right)+1;
	}

}
