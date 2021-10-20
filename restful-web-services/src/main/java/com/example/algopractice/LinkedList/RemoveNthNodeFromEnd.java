package com.example.algopractice.LinkedList;

public class RemoveNthNodeFromEnd {

	public static void main(String args[])
	{
		
		Node head = null;
		LinkedList linkedList=new LinkedList();
		Node first = linkedList.addNode(5, head);
		Node second = linkedList.addNode(10, first);
		Node third = linkedList.addNode(11, second);
		Node fourth = linkedList.addNode(12,third);
		Node fifth = linkedList.addNode(13, fourth);
		Node sixth = linkedList.addNode(14, fifth);
		Node seventh= linkedList.addNode(15, sixth);

		System.out.println("before removal");
		linkedList.printLinkedList(seventh);
		System.out.println("calling remove function");
		Node node1=linkedList.removeNthnodeFromEndofList(seventh,7);
		Node node2=linkedList.removeNthNodeFromEndOptimized(seventh,7);

		System.out.println("after removal ");
		linkedList.printLinkedList(node1);
		linkedList.printLinkedList(node2);
	}
	
}
