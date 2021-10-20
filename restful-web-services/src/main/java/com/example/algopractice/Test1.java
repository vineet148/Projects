package com.example.algopractice;

import java.awt.List;
import java.util.ArrayList;

public class Test1 {

	static String[] names= {"bAcon","nation","dog","dEcidEd"};
	
	public static void main(String args[])
	{
		String str="vineety";
		ArrayList<String> outarr=new ArrayList<String>();
		String ch=Character.toString(str.toUpperCase().charAt(0));
		int counter=102;
		String nwid=ch+counter;
		System.out.println(counter);
		counter++;
		
		
		
		for(int i=0;i< names.length;i++)
		{
			String str1=names[i];
			int flag=1;
			for(int j=1;j< str1.length();j++ )
			{
				if(isVowel(str1.charAt(j)) && isVowel(str1.charAt(j-1)))
				{
					System.out.println(str1.charAt(j) +""+ str1.charAt(j-1));
					flag=0;
					break;
					
				}else if(!isVowel(str1.charAt(j)) && !isVowel(str1.charAt(j-1)))
				{
					System.out.println(str1.charAt(j) +" "+ str1.charAt(j-1));
					flag=0;
					break;
					
				}else
				{
					System.out.println(str1.charAt(j) +""+ str1.charAt(j-1));
					flag=1;
					continue;
				}
				
			}
			if(flag==1)
			{
				outarr.add(str1);
			}
			
		}

		for(String s:outarr)
		{
			System.out.println(s);
		}
	}

	  static Boolean isVowel(char ch) {
		// TODO Auto-generated method stub

	    if (ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'U'|| ch == 'O'|| ch == 'a' || ch == 'e' || ch == 'i' ||
	            ch == 'o' || ch =='u'
	            )
	    {
	        return true;
	    }
	    else
	    {
	    return false;
	    }	
	    
	
	}

	}