package com.example.algopractice.LinkedList;

public class CheckPallindromeLinkedList {

	public static void main(String args[]) {

		Node head = null;
		LinkedList linkedList = new LinkedList();
		Node third = linkedList.addNode(9, head);
		Node fourth = linkedList.addNode(8, third);
		Node fifth = linkedList.addNode(7, fourth);
		Node sixth = linkedList.addNode(8, fifth);
		Node seventh = linkedList.addNode(9, sixth);
		System.out.println(linkedList.checkForPallindrom(seventh));
	}

}
