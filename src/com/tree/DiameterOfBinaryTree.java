package com.tree;

public class DiameterOfBinaryTree {
	static int max = 0;
public static void main(String[] args) {
	// TODO Auto-generated method stub
			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			int res = dia(root);
			System.out.println(max);
}

public static int dia(Node node) {
	if(node == null) {
		return 0;
	}
	int left = dia(node.left);
	int right = dia(node.right);
	int dia = left+right; // left height + right height
	max = Math.max(max, dia);
	return Math.max(left,right)+1;
}

}
