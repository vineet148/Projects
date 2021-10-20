package com.example.algopractice.Recursion;

import java.util.ArrayList;

public class PrintPermutation {

	public static void main(String args[]) {
		String str = "abc";
		ArrayList<String> r = new ArrayList<>();
		String ans = "";
		permutation(str, ans);

	}

	private static void permutation(String str, String asf) {
		// TODO Auto-generated method stub

		if(str.length()==0)
		{
			System.out.println(asf);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String left = str.substring(0, i);
			String right = str.substring(i+1);
			String inputString = left + right;
			permutation(inputString, asf + ch);

		}
	}
}
