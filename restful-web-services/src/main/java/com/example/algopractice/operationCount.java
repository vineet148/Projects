package com.example.algopractice;

public class operationCount
{
  static String originalString="abcabc";
  
  private static int operationCount(String word, int input1,int input2){
        
      /*write your code here and return appropriate value*/
     String str1="";
     String str2="";
     String original=word;
     int count=0;
      while(!str2.equals(original))
       {
         count++;
         str1=rotateString(word,input1);   
         System.out.println(str1);
         str2= rotateString(str1,input2);
         word=str2;
         System.out.println(str2);
        }

    return count;
     
  }
 
  private static String rotateString(String str,int n)
  {

   String substr1= str.substring(str.length()-n);
   String remainingString=str.substring(0,str.length()-n);
   String finalString=substr1+remainingString;
    return finalString; 
  }
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
     originalString=args[0];
    System.out.println(operationCount(args[0],Integer.parseInt(args[1]),Integer.parseInt(args[2])));
  }
}
