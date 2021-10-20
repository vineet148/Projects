package com.example.algopractice.stack;

import java.io.*;
import java.util.*;

public class DeleteMiddleStack {

	// Java code to delete middle of a stack
	// without using additional data structure.

	// Deletes middle of stack of size
	// n. Curr is current item number

	static void deleteMid(Stack<Character> st, int k) {

		if (st.empty()) {
			return;
		}
		if (k == 1) {
			st.pop();
			return;
		}

		char temp = st.peek();
		st.pop();
		deleteMid(st, k - 1);
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
		deleteMid(st, middle);

		// Printing stack after deletion
		// of middle.
		while (!st.empty()) {
			char p = st.pop();
			System.out.print(p + " ");
		}

		String str = "a1b2c234d";
		// printSubset(str);
	//	permutationofspace(str);
		//permutationofCaseChange(str);
		letterCasePermutation(str);
	}

	private static void letterCasePermutation(String str) {
		// TODO Auto-generated method stub
		
		
		solveLetterCasePermutation(str,"");
	}

	private static void solveLetterCasePermutation(String inp, String opt) {
		// TODO Auto-generated method stub
		
		if(inp.length()==0)
		{
			System.out.println(opt);
			return;
		}
		
		String opt1=opt;
		String opt2=opt;
		String inp1=inp;
		String inp2=inp;
		
		int x=inp.charAt(0);
		if(x<65 || x > 123)
		{
			opt1=opt+inp.charAt(0);
			inp1=inp.substring(1);
			solveLetterCasePermutation(inp1, opt1);
		}
		else
		{
			opt1=opt+convertCase(inp.charAt(0));
			inp1=inp.substring(1);
			opt2=opt+inp.charAt(0);
		
			solveLetterCasePermutation(inp1, opt1);
			solveLetterCasePermutation(inp1, opt2);			
		}
		
	}

	private static void permutationofCaseChange(String str) {
		// TODO Auto-generated method stub
		
		solvepermutationForCaseChange(str,"");
		
	}

	private static void solvepermutationForCaseChange(String inp, String opt) {
		// TODO Auto-generated method stub
		
		String inp1=inp;
		String inp2=inp;
		String opt1=opt;
		String opt2=opt;
		
		if(inp.length()==0)
		{
			System.out.println(opt);
			return;
		}
		
		opt1=opt+convertCase(inp.charAt(0));
		opt2=opt+inp.charAt(0);
		inp1=inp.substring(1);
		
		solvepermutationForCaseChange(inp1, opt1);
		solvepermutationForCaseChange(inp1, opt2);

		
	}

	private static char convertCase(char c) {
		// TODO Auto-generated method stub

		int x=c;
		char y = 0;
		if(x>=97 && x< 123)
		{
		 y=Character.toUpperCase(c);
		}
		else if(x >=65 && x< 91)
		{
			y=Character.toLowerCase(c);
		}
		

		
		return y;
	}

	private static void permutationofspace(String str) {
		// TODO Auto-generated method stub

		solvepermutaionofSpace(str, "");

	}

	private static void solvepermutaionofSpace(String inp, String opt) {
		// TODO Auto-generated method stub

		String opt1 = opt;
		String opt2 = opt;
		String inp1 = inp;
		String inp2 = inp;

		if (inp.length() == 0) {
		
			System.out.println(opt);
			return;

		}

		if (opt.length() == 0) {
			opt1 = opt + inp.charAt(0);
			inp1 = inp.substring(1);
			solvepermutaionofSpace(inp1, opt1);
		}
		else {
		opt1 = opt + "-" + inp.charAt(0);
		inp1 = inp.substring(1);

		opt2 = opt + inp.charAt(0);
		inp2 = inp.substring(1);
		solvepermutaionofSpace(inp1, opt1);
		solvepermutaionofSpace(inp2, opt2);
		}
	}

	
	
	
	
	private static void printSubset(String str) {
		// TODO Auto-generated method stub

		solve(str, "");

	}

	private static void solve(String inp, String opt) {
		// TODO Auto-generated method stub

		if (inp.length() == 0) {
			System.out.print(opt + " ");
			return;
		}

		String opt1 = opt;
		String opt2 = opt;

		String inp1 = inp.substring(1);
		opt1 = opt1 + inp.charAt(0);

		solve(inp1, opt1);
		solve(inp1, opt2);

	}

}
