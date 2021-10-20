package com.example.algopractice.stack;

import java.io.*;
import java.util.*;

public class ReverseStack {

	// Java code to delete middle of a stack
	// without using additional data structure.

	// Deletes middle of stack of size
	// n. Curr is current item number

	static void reverseStack(Stack<Character> st) {

		if(st.empty() )
		{
			return;
		}
		if (st.size()==1) {
			return;
		}
		char temp=st.peek();
		st.pop();
		reverseStack(st);
		insert(st,temp);
		

	}
	
	static void insert(Stack<Character> st, char e)
	{
		if(st.size()==0)
		{
			st.push(e);
			return;
		}
		
		char temp=st.peek();
		st.pop();
		insert(st,e);
		st.push(temp);
				
	}

	// Driver function to test above functions
	public static void main(String args[]) {
		Stack<Character> st = new Stack<Character>();

		// push elements into the stack
		st.push('1');
		st.push('2');
		st.push('3');
		st.push('4');
		st.push('5');
		st.push('6');
		st.push('7');
		
	
		int middle = st.size() / 2 + 1;
		reverseStack(st);

		// Printing stack after deletion
		// of middle.
		while (!st.empty()) {
			char p = st.pop();
			System.out.print(p + " ");
		}
	}
}
