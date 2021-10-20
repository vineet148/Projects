package com.example.algopractice;

import java.io.*;
import java.util.*;

public class Main1
{
 
  public static int levelCount(String S){
    
    /*write your code here and return appropriate value*/
       int current_max = 0; 
        int max = 0; 
        int n = S.length(); 

        for (int i = 0; i < n; i++) { 
            if (S.charAt(i) == '{') { 
                current_max++; 

                // update max if required 
                if (current_max > max) { 
                    max = current_max; 
                } 
            } else if (S.charAt(i) == '}') { 
                if (current_max > 0) { 
                    current_max--; 
                } else { 
                    return -1; 
                } 
            } 
        } 

        if (current_max != 0) { 
            return -1; 
        } 

        return max+1; 
  }
  
  
  public static void main(String[] args)
  {
	  String str1="{\"0\":{\"name\":\"[John]\"}\",\"1\":{\"name\":\"[micheal]\"}}";
    System.out.println(levelCount(str1));
  }
}


