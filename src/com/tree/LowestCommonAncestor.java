package com.tree;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		
		Node root = new Node(6);
		root.left = new Node(2);
		root.right = new Node(8);
		root.left.left = new Node(0);
		root.right.right = new Node(9);
		Node res = lowestCommonAncestor(root,0,9);
		System.out.println(res.value);

	}
	
	public static Node lowestCommonAncestor(Node node,int p,int q) {
		if(node == null) {
			return null;
		}
		if(node.value == p || node.value == q) {
			return node;
		}
		Node left = lowestCommonAncestor(node.left,p,q);
		Node right = lowestCommonAncestor(node.right,p,q);
		if(left != null && right != null) {
			return node;
		}
		return right == null ? left:right;
	}

}
