package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		Node root = new Node(3);
		root.left = new Node(9);
		root.right = new Node(20);
		root.right.left = new Node(15);
		root.right.right = new Node(7);
		List<List<Integer>> result = levelOrderTraversal(root);
		System.out.println(result);

	}
	
	public static List<List<Integer>> levelOrderTraversal(Node node){
		if(node == null) {
			return null;
		}
		List<List<Integer>>  result = new ArrayList<>();
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(!queue.isEmpty()) {
			int currentLevel = queue.size();
			List<Integer> list = new ArrayList<>();
			for(int i=0;i<currentLevel;i++) {
				Node currentNode = queue.poll();
				list.add(currentNode.value);
				if(currentNode.left != null) {
					queue.offer(currentNode.left);
				}
				if(currentNode.right != null) {
					queue.offer(currentNode.right);
				}
				
			}
			result.add(list);
		}
		return result;
	}

}
