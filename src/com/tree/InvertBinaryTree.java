package com.tree;

public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Node inveretBinaryTree(Node node) {
		if(node == null) {
			return null;
		}
		
		Node left = inveretBinaryTree(node.left);
		Node right = inveretBinaryTree(node.right);
		node.left = right;
		node.right = left;
		return node;
		
	}

}
