package com.tree;

public class KthSmallestElement {
	
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(3);
		root.left = new Node(1);
		root.right = new Node(4);
		root.left.right = new Node(2);
		Node res = KthSmallestElement(root,2);
		System.out.println(res.value);

	}

	private static Node KthSmallestElement(Node node, int k) {
		
		if(node == null) {
			return null;
		}
		
		Node left = KthSmallestElement(node.left,k);
		if(left != null) {
			return left;
		}
		count++;
		if(count == k) {
			return node;
		}
		
		return KthSmallestElement(node.right,k);
		
	}
	
	

}
