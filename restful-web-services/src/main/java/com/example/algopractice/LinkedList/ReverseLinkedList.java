package com.example.algopractice.LinkedList;

public class ReverseLinkedList {

	public static void main(String args[]) {
		Node head = null;
		LinkedList linkedList=new LinkedList();
		Node first = linkedList.addNode(5, head);
		Node second = linkedList.addNode(10, first);
		Node third = linkedList.addNode(11, second);
		linkedList.printLinkedList(third);
		Node node=linkedList.ReverseLinkedList(third);
		System.out.println("after reverse");
		linkedList.printLinkedList(node);

	}



}
