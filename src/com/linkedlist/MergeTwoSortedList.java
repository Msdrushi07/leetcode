package com.linkedlist;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(1);
		node1.next = new Node(2);
		node1.next.next = new Node(4);
		node1.next.next.next = new Node(9);
		Node node2 = new Node(3);
		node2.next = new Node(7);
		node2.next.next = new Node(8);
		node2.next.next.next = new Node(12);
		Node head = mergeTwoSortedList(node1,node2);
		while(head != null) {
			System.out.println(head.value);
			head = head.next;
		}

	}
	
	public static Node mergeTwoSortedList(Node head1,Node head2) {
		Node temp1 = head1;
		Node temp2 = head2;
		Node dummy = new Node(-1);
		Node current = dummy;
		while(temp1 != null && temp2 != null) {
			if(temp1.value < temp2.value) {
				current.next = temp1;
				temp1 = temp1.next;
			}
			else {
				current.next = temp2;
				temp2 = temp2.next;
			}
			current = current.next;
			
		}
		while(temp1 != null) {
			current.next = temp1;
			temp1 = temp1.next;
			current = temp1;
			
		}
		
		while(temp2 != null) {
			current.next = temp2;
			temp2 = temp2.next;
			current = temp2;
			
		}
		return dummy.next;
		
	}

}
