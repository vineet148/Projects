package com.example.algopractice.Recursion;

import java.util.ArrayList;

public class getSubSeq {

	
	public static void main(String args[])
	{
		String str="abc";
		ArrayList< String > res1=getSubSeq(str);
		
		for(String s:res1)
		{
			System.out.println(s);
		}
		
	}

	private static ArrayList<String> getSubSeq(String str) {
		// TODO Auto-generated method stub
		
		if(str.length()==0)
		{
			ArrayList<String> a=new ArrayList<>();
			a.add("");
			return a;
		}
		
		char ch=str.charAt(0);
		String sub=str.substring(1);
		ArrayList<String> mres=getSubSeq(sub);
		ArrayList<String > res=new ArrayList<>();
		for(String s: mres)
		{
			res.add(""+s);
			res.add(ch+s);
			
		}
		return res;
	
		
		
		
	}
}
