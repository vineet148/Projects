package com.example.algopractice.Recursion;

import java.util.ArrayList;

public class GetStairPath {

	public static void main(String args[]) {
		int n = 4;
		System.out.println(getStairPaths(n));
		ArrayList<String> res=printStairPaths(n);
		for(String s:res)
		{
			System.out.println(s);
		}
	}

	private static ArrayList<String> printStairPaths(int n) {
		// TODO Auto-generated method stub

		if (n == 0) {
			ArrayList<String> res = new ArrayList<>();
			res.add("");
			return res;
		} else if (n < 0) {
			ArrayList<String> res = new ArrayList<>();
			return res;
		}

		ArrayList<String> res1 = printStairPaths(n - 1);
		ArrayList<String> res2 = printStairPaths(n - 2);
		ArrayList<String> res3 = printStairPaths(n - 3);
		ArrayList<String> res = new ArrayList<>();
		
		for(String s1: res1)
		{
			res.add(1+s1);
		}
		for(String s2: res2)
		{
			res.add(2+s2);
		}
		for(String s3: res3)
		{
			res
			.add(3+s3);
		}
		

		return res;
	}

	private static int getStairPaths(int n) {
		// TODO Auto-generated method stub

		if (n == 0) {
			return 1;
		} else if (n < 0) {
			return 0;
		}

		int x1 = getStairPaths(n - 1);
		int x2 = getStairPaths(n - 2);
		int x3 = getStairPaths(n - 3);

		return x1 + x2 + x3;

	}
}
