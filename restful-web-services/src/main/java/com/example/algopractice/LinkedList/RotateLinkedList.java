package com.example.algopractice.LinkedList;

public class RotateLinkedList {

	public static void main(String args[]) {
		int count = 23;
		Node head = null;
		LinkedList linkedList = new LinkedList();
		Node third = linkedList.addNode(9, head);
		Node fourth = linkedList.addNode(8, third);
		Node fifth = linkedList.addNode(7, fourth);
		Node sixth = linkedList.addNode(8, fifth);
		Node seventh = linkedList.addNode(9, sixth);
		head = seventh;
		int i = 0;
		linkedList.printLinkedList(head);
		Node h = rotate(head, count);
		linkedList.printLinkedList(h);

	}

	private static Node rotate(Node head, int count) {
		// TODO Auto-generated method stub

		Node temp = head;
		Node prev = head;
		int len = 0;
		while (temp.getNext() != null) {
			temp = temp.getNext();
			len++;
		}
		if(count > len)
		{
			count=count%len;
		}
		
		temp.setNext(head);

		int k = len - count;
		int j = 0;
		while (j < k) {
			prev = prev.getNext();
			j++;
		}
         head=prev.getNext();
		prev.setNext(null);

		return head;
	}
}
