package com.linkedlist;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		Node head = reverseLinkedList(node);
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.value);
			temp = temp.next;
		}

	}
	
	public static Node reverseLinkedList(Node head) {
		Node prev= null;
		Node front = null;
		Node current = head;
		while(current != null) {
			front = current.next;
			current.next = prev;
			prev=current;
			current = front;
		}
		return prev;
		
	}

}
