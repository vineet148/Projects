package com.example.algopractice.LinkedList;


public class LinkedList {

	public Node addNode(int data, Node head) {
		Node newNode = new Node(data, head);
		return newNode;
	}

	public void printLinkedList(Node node) {
		// TODO Auto-generated method stub

		while (node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
		System.out.println("\n");

	}

	Node ReverseLinkedList(Node node) {
		// TODO Auto-generated method stub

		Node prev = null;
		Node current = null;

		while (node != null) {
			current = node;
			node = node.getNext();
			current.setNext(prev);
			prev = current;

		}
		return current;

	}

	public Node removeNthNodeFromEndOptimized(Node head, int n) {
		Node start = new Node();
		start.setNext(head);

		Node fast = start;
		Node slow = start;

		for (int i = 1; i <= n; i++) {
			fast = fast.getNext();
		}

		while (fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext();
		}

		slow.setNext(slow.getNext().getNext());
		return start.getNext();

	}

	public Node removeNthnodeFromEndofList(Node node, int n) {
		// TODO Auto-generated method stub
		int len = 0;
		Node current = node;
		while (current != null) {
			len++;
			current = current.getNext();
		}

		System.out.println("lenght of linkedlist " + len);
		int deleteFromBeginning = len - n + 1;
		System.out.println("we have to delete " + deleteFromBeginning + "th element from beginnig");
		int count = 1;
		Node prev = null;
		Node current2 = node;

		if (deleteFromBeginning == 1) {
			node = node.getNext();
		} else {
			while (count < deleteFromBeginning) {

				prev = current2;
				current2 = current2.getNext();
				count++;
				if (count == deleteFromBeginning) {
					prev.setNext(current2.getNext());
					break;
				}

			}
		}
		return node;
	}

	public Node mergerSortedLinkedList(Node head1, Node head2) {
		// TODO Auto-generated method stub

		Node dummy = new Node();
		Node dd = dummy;
		while (head1 != null && head2 != null) {
			if (head1.getData() < head2.getData()) {
				Node newNode = new Node(head1.getData(), null);
				dd.setNext(newNode);
				dd = dd.getNext();
				head1 = head1.getNext();
			} else if (head1.getData() > head2.getData()) {
				Node newNode = new Node(head2.getData(), null);
				dd.setNext(newNode);
				dd = dd.getNext();
				head2 = head2.getNext();
			}
		}

		if (head1 != null && head2 == null) {
			while (head1 != null) {
				Node newNode = new Node(head1.getData(), null);
				dd.setNext(newNode);
				dd = dd.getNext();

				head1 = head1.getNext();
			}
		} else if (head1 == null && head2 != null) {
			while (head2 != null) {
				Node newNode = new Node(head2.getData(), null);
				dd.setNext(newNode);
				dd = dd.getNext();

				head2 = head2.getNext();
			}
		}

		return dummy.getNext();

	}

	public Node mergerSortedLinkedListOptimized(Node head1, Node head2) {
		// TODO Auto-generated method stub

		Node l1 = null;
		Node l2 = null;
		Node temp = null;
		if (head1.getData() < head2.getData()) {
			l1 = head1;
			l2 = head2;
		} else {
			l1 = head2;
			l2 = head1;
		}
		Node res = l1;

		while (l1 != null && l2 != null) {
			temp = null;
			while (l1 != null && l1.getData() < l2.getData()) {
				temp = l1;
				l1 = l1.getNext();
			}
			temp.setNext(l2);
			temp = l1;
			l1 = l2;
			l2 = temp;
		}
		
		return res;
	}

	public Node addTwoNumbersLinkedList(Node head1, Node head2) {
		// TODO Auto-generated method stub

		Node res = new Node();
		Node current = res;
		Node l1 = head1;
		Node l2 = head2;
		int sum = 0;
		int carry = 0;

		while (l1 != null || l2 != null || carry == 1) {

			if (l1 != null) {
				sum += l1.getData();
				l1 = l1.getNext();
			}

			if (l2 != null) {
				sum += l2.getData();
				l2 = l2.getNext();
			}
			sum += carry;
			carry = sum / 10;
			Node newNode = new Node((sum % 10), null);
			current.setNext(newNode);
			current = newNode;

		}

		return res;

	}

	public boolean checkForPallindrom(Node head) {
		// TODO Auto-generated method stub

		Node mid = findMiddleofLinkedList(head);
		System.out.println("mid is" + mid.getData());
		Node right = ReverseLinkedList(mid.getNext());
		System.out.println("right" + right.getData());
		while (head.getData() != mid.getData() && right != null) {
			if (head.getData() != right.getData()) {
				return false;
			} else {

				head = head.getNext();
				right = right.getNext();
				continue;
			}

		}
		return true;

	}

	private Node findMiddleofLinkedList(Node head) {
		// TODO Auto-generated method stub

		Node slow = head;
		Node fast = head;
		Node dummy = head;
		int len = 0;
		while (dummy != null) {
			dummy = dummy.getNext();
			len++;

		}

		if (len % 2 == 0) {
			while (fast.getNext().getNext() != null) {
				slow = slow.getNext();
				fast = fast.getNext().getNext();
			}

		} else {

			while (fast.getNext() != null) {
				slow = slow.getNext();
				fast = fast.getNext().getNext();
			}

		}

		return slow;

	}

	public int detectDuplicate(Node head) {
		// TODO Auto-generated method stub
		
		Node slow=head;
		Node fast=head;
		printLinkedList(head);
		
		while(fast.getNext()!=null && slow.getNext() !=null)
		{
			slow=slow.getNext();
            fast=fast.getNext().getNext();
			System.out.println(slow.getData()+" "+fast.getData());
			if(slow==fast)
			{
			
				System.out.println("cycle detected");
				 return detectStartofCycle(head,slow);
				
			}
		}
		return -1;
		
	}

	private int  detectStartofCycle(Node head, Node slow) {
		// TODO Auto-generated method stub
		
		while(head!=null && slow!=null)
		{
			
			if(head.getData() == slow.getData())
			{
				return slow.getData();
			}
			head=head.getNext();
			slow=slow.getNext();
		}
		return -1;
		
		
	}

}
