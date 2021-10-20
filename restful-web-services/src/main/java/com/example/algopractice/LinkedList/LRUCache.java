package com.example.algopractice.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class DlistNode {

	int key;
	int value;
	DlistNode next;
	DlistNode prev;

	public DlistNode() {

	}

	public DlistNode(int key, int value, DlistNode next, DlistNode prev) {
		super();
		this.key = key;
		this.value = value;
		this.next = next;
		this.prev = prev;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public DlistNode getNext() {
		return next;
	}

	public void setNext(DlistNode next) {
		this.next = next;
	}

	public DlistNode getPrev() {
		return prev;
	}

	public void setPrev(DlistNode prev) {
		this.prev = prev;
	}

}

public class LRUCache {

	static int max = 3;

	public static void main(String args[]) {

		DlistNode head = new DlistNode();
		DlistNode tail = new DlistNode();
		head.setNext(tail);
		tail.setPrev(head);
		HashMap<Integer, DlistNode> nodeMap = new HashMap<>();

		DlistNode h1 = putValue(1, 1, nodeMap, head, tail);
		DlistNode h2 = putValue(2, 2, nodeMap, head, tail);
		DlistNode h3 = putValue(3, 3, nodeMap, head, tail);
		System.out.println("before duplicate ");
		printList(h3);
		DlistNode h4 = putValue(2, 4, nodeMap, head, tail);
		DlistNode h5 = putValue(2, 5, nodeMap, head, tail);

		getValue(2, nodeMap, head, tail);
		System.out.println("after duplicate");
		printList(h5);

	}

	private static void getValue(int key, HashMap<Integer, DlistNode> nodeMap, DlistNode head, DlistNode tail) {
		// TODO Auto-generated method stub

		if (nodeMap.containsKey(key)) {
			DlistNode node = nodeMap.get(key);
			System.out.println("Key is " + node.getKey() + "value is " + node.getValue());
			removetheNode(node, head, tail);
			nodeMap.remove(key);
			addtoList(key, node.getValue(), head, tail);

		} else {
			System.out.println("not available");
		}

	}

	private static DlistNode putValue(int key, int value, HashMap<Integer, DlistNode> nodeMap, DlistNode head,
			DlistNode tail) {
		// TODO Auto-generated method stub

		if (!nodeMap.containsKey(key) && nodeMap.size() < max) {
			DlistNode node = addtoList(key, value, head, tail);
			nodeMap.put(key, node);
		} else if (nodeMap.containsKey(key) && nodeMap.size() == max) {
			modifyTheList(key, value, nodeMap, head, tail);
			nodeMap.remove(key);
			DlistNode node = addtoList(key, value, head, tail);
			nodeMap.put(key, node);
		} else if (!nodeMap.containsKey(key) && nodeMap.size() == max) {

			nodeMap.remove(tail.getPrev().getKey());
			DlistNode h1 = removeFromEndInList(head, tail);
			DlistNode node = addtoList(key, value, head, tail);
			nodeMap.put(key, node);

		}

		return head;
	}

	private static DlistNode removeFromEndInList(DlistNode head, DlistNode tail) {
		// TODO Auto-generated method stub

		DlistNode node = tail.getPrev();

		node.getPrev().setNext(node.getNext());
		tail.setPrev(node.getPrev());

		return head;
	}

	private static void printList(DlistNode head) {
		// TODO Auto-generated method stub

		DlistNode temp = head;
		while (temp.getNext() != null) {
			System.out.println(temp.getKey() + "" + temp.getValue());
			temp = temp.getNext();
		}

	}

	private static void modifyTheList(int key, int value, HashMap<Integer, DlistNode> nodeMap, DlistNode head,
			DlistNode tail) {
		// TODO Auto-generated method stub

		DlistNode node2 = nodeMap.get(key);
		DlistNode h1 = removetheNode(node2, head, tail);
	}

	private static DlistNode removetheNode(DlistNode node, DlistNode head, DlistNode tail) {
		// TODO Auto-generated method stub

		DlistNode temp = node.getPrev();
		temp.setNext(node.getNext());
		node.getNext().setPrev(temp);
		return head;

	}

	private static DlistNode addtoList(int key, int value, DlistNode head, DlistNode tail) {
		// TODO Auto-generated method stub

		List<DlistNode> list = new ArrayList<DlistNode>();
		DlistNode node = new DlistNode(key, value, null, null);
		DlistNode temp = head.getNext();
		node.setNext(head.getNext());
		node.setPrev(head);
		temp.setPrev(node);
		head.setNext(node);

		return node;
	}

}
