package com.example.algopractice.LinkedList;

public class MergeSortedLinkedList {

	public static void main(String args[])
	{
		Node head = null;
		LinkedList linkedList=new LinkedList();
		Node first = linkedList.addNode(11, head);
		Node second = linkedList.addNode(10, first);
		Node third = linkedList.addNode(9, second);
		Node fourth = linkedList.addNode(8,third);
		Node fifth = linkedList.addNode(7, fourth);
		Node sixth = linkedList.addNode(6, fifth);
		Node seventh= linkedList.addNode(5, sixth);

		Node first2 = linkedList.addNode(4, head);
		Node second2 = linkedList.addNode(3, first2);
		Node third3= linkedList.addNode(2, second2);
		Node fourth4 = linkedList.addNode(1,third3);

		Node result=linkedList.mergerSortedLinkedList(seventh,fourth4);
		linkedList.printLinkedList(result);
		
		Node result2=linkedList.mergerSortedLinkedListOptimized(seventh, fourth4);
		linkedList.printLinkedList(result2);
		
	}
	
}
