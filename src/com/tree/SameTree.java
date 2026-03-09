package com.tree;

public class SameTree {

	public static void main(String[] args) {
		
		Node p = new Node(1);
		p.left = new Node(2);
		p.right = new Node(3);
		Node q = new Node(1);
		q.left = new Node(2);
		q.right = new Node(3);
		boolean res = sameTree(p,q);
		System.out.println(res);
	}
	
	public static boolean sameTree(Node p,Node q) {
		if(p == null && q == null) {
			return true;
		}
		if( p == null || q == null) {
			return false;
		}
		
		if(p.value != q.value) {
			return false;
		}
		boolean left = sameTree(p.left,q.left);
		boolean right = sameTree(p.right,q.right);	
		
		
		
		return left && right;
	}
}
