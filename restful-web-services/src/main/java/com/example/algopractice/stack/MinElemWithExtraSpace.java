package com.example.algopractice.stack;

import java.util.Scanner;
import java.util.Stack;

public class MinElemWithExtraSpace {
	static int minElement = 0;

	public static void main(String args[]) {
		int arr[] = { 18, 19, 29, 15, 16 };

		int len = arr.length;
		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> ss = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
	/*	while (true) {
			System.out.println("enter 1 to pop the stack and 2 to find the min and 3 to push");
			int x = sc.nextInt();
			if (x == 1) {
				int s2 = popOps(s, ss);
				System.out.println("stack popped" + s2);
			} else if (x == 2) {
				MinElement(arr, len, s, ss);
			} else if (x == 3) {
				System.out.println("enter element to push");
				int e = sc.nextInt();
				PushStack(e, s, ss);
			} else
				break;
		}
*/
		while (true) {
			System.out.println("enter 1 to pop the stack and 2 to find the min and 3 to push");
			int x = sc.nextInt();
			if (x == 1) {
				int s2 = popOpsWithoutExtraSpace(s);
				System.out.println("stack popped" + s2);
			} else if (x == 2) {
				int x4=MinElementWithNoExtraspace(arr, len, s);
			    System.out.println(x4+"is minimum element");
			} else if (x == 3) {
				System.out.println("enter element to push");
				int e = sc.nextInt();
				PushStackNoExtraSpace(e, s);
			} else
				break;
		}

	}

	private static int popOps(Stack<Integer> s, Stack<Integer> ss) {
		// TODO Auto-generated method stub

		if (s.peek() == ss.peek()) {
			int s1 = s.pop();
			ss.pop();
			return s1;
		} else {
			return s.pop();
		}

	}

	private static int popOpsWithoutExtraSpace(Stack<Integer> s) {
		// TODO Auto-generated method stub
		int x2 = 0;
		if (s.peek() > minElement) {
			x2 = s.pop();
		} else if (s.peek() < minElement) {
			int x = 2 * minElement - s.peek();
			minElement = x;
			x2 = s.pop();
		}
		return x2;

	}

	private static void PushStackNoExtraSpace(int e, Stack<Integer> s) {
		// TODO Auto-generated method stub

		if (s.size() == 0)
		{
			s.push(e);
		   minElement=e;
		}
			else if (e > minElement) {
			s.push(e);
		} else {
			int x = 2 * e - minElement;
			s.push(x);
			minElement = e;
		}

	}

	private static void PushStack(int e, Stack<Integer> s, Stack<Integer> ss) {
		// TODO Auto-generated method stub

		if (s.size() == 0 && ss.size() == 0) {
			s.push(e);
			ss.push(e);
		} else if (e < ss.peek()) {
			s.push(e);
			ss.push(e);
		} else {
			s.push(e);
		}

	}

	private static void MinElement(int[] arr, int len, Stack<Integer> s, Stack<Integer> ss) {
		// TODO Auto-generated method stub

		if (ss.size() > 0) {
			System.out.println("Min element is" + ss.peek());
		} else {
			System.out.println("stack is empty");
		}

	}

	private static int MinElementWithNoExtraspace(int[] arr, int len, Stack<Integer> s) {

		return minElement;

	}
}
