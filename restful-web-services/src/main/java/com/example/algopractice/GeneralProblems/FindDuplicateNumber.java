package com.example.algopractice.GeneralProblems;

import java.util.Arrays;

import com.example.algopractice.LinkedList.LinkedList;
import com.example.algopractice.LinkedList.Node;

public class FindDuplicateNumber {
	static LinkedList linkedList = new LinkedList();

	public static void main(String args[]) {
		int arr[] = { 2, 3, 1,2,4 };
		Node head=createLinkedList(arr, arr.length);
		int num=linkedList.detectDuplicate(head);
		System.out.println("duplicate number"+num);
	}

	private static Node createLinkedList(int[] arr, int length) {
		// TODO Auto-generated method stub

		Node current = new Node(0, null);
		Node start = current;

		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {

				Node node = new Node(arr[i], null);
				current.setNext(node);
				current = node;
			} else {
// here linked list is not getting created in cyclic order of duplicate
				
				Node node = new Node(arr[arr[i]], null);
				current.setNext(node);
				current = node;
			}
		}
		start = start.getNext();

		return start;
	}

}
