package com.example.algopractice.Recursion;

import java.util.ArrayList;

public class GetKeyPadCombination {

	String[] arr= {"","abc","def","ghi","jkl","opq","rst","uvx","wyz"};
	
	
	public static void main(String args[]) {
		String str1 = "mno";
		String str2 = "uvx";
		String str3 = "ghi";

	
		String inp="678";
		ArrayList<String> r = findKeyCombination(inp);

		for (String s : r) {
			System.out.println(s);
		}

	}

	private static ArrayList<String> findKeyCombination(String str1) {
		// TODO Auto-generated method stub

		char s=str1.charAt(0);
		String
		
		
		ArrayList<String> r = new ArrayList<>();
		if (str1.length() == 0 && str2.length() != 0 && str3.length() != 0) {
			r.add("" + str2 + str3);
			return r;

		} else if (str2.length() == 0 && str1.length() != 0 && str3.length() != 0) {
			r.add(str1 + "" + str3);
			return r;
		} else if (str3.length() == 0 && str1.length() != 0 && str2.length() != 0) {
			r.add(str1 + str2 + "");
			return r;
		} else if (str1.length() == 0 && str2.length() == 0 && str3.length() == 0) {
			r.add("");
			return r;
		}
		

		char ch1 = str1.charAt(0);
		char ch2 = str2.charAt(0);
		char ch3 = str3.charAt(0);

		String sub1 = str1.substring(1);
		String sub2 = str2.substring(1);
		String sub3 = str3.substring(1);
		ArrayList<String> mres = findKeyCombination(sub1, sub2, sub3);
		ArrayList<String> res = new ArrayList<>();
		for (String s : mres) {
			res.add("" + s);
			res.add(ch1 + s);
			res.add(ch2 + s);
			res.add(ch3 + s);

		}

		return res;

	}

}
