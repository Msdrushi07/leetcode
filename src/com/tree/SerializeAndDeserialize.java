package com.tree;

import java.util.ArrayList;
import java.util.List;

public class SerializeAndDeserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);
		List<String> result = new ArrayList<>();
	 serialize(root,result);
		System.out.println(result);
		Node res = deserialize(result);
		System.out.println(res.value);
		System.out.println(res.left.value);
		System.out.println(res.right.value);

	}
	
	public static void serialize(Node node,List<String> result) {
		if(node == null) {
			result.add("null");
			return;
		}
		result.add(String.valueOf(node.value));
		serialize(node.left,result);
		serialize(node.right,result);
		
	}
	
	public static Node deserialize(List<String> list) {
		String value = list.removeFirst();
		if(value.equals("null")) {
			return null;
		}
		Node node = new Node(Integer.parseInt(value));
		node.left =  deserialize(list);
		node.right = deserialize(list);
		return node;
	}

}
