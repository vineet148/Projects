package com.example.algopractice.LinkedList;

public class AddTwoNumbersLinkedList {

	public static void main(String args[]) {
		Node head = null;
		LinkedList linkedList = new LinkedList();
		Node third = linkedList.addNode(9, head);
		Node fourth = linkedList.addNode(8, third);
		Node fifth = linkedList.addNode(7, fourth);
		Node sixth = linkedList.addNode(6, fifth);
		Node seventh = linkedList.addNode(5, sixth);

		Node first2 = linkedList.addNode(4, head);
		Node second2 = linkedList.addNode(3, first2);
		Node third3 = linkedList.addNode(2, second2);
		Node fourth4 = linkedList.addNode(1, third3);

		linkedList.printLinkedList(fourth4);
		linkedList.printLinkedList(seventh);
		Node res = linkedList.addTwoNumbersLinkedList(seventh, fourth4);
		linkedList.printLinkedList(res);

	}

}
