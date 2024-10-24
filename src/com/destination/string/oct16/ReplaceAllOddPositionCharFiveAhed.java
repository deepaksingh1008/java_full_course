package com.destination.string.oct16;

public class ReplaceAllOddPositionCharFiveAhed {
  public static void main(String[] args) {
	
	  String s = "abcdef";
	  char arr[] = new char [26];
	  char ch = 'a';
	  for(int i=0;i<arr.length;i++) {
		   arr[i]=ch;
		    ch++;
	  }
	  String ans="";
	  for(int i=0;i<s.length();i++) {
		   if(i%2 != 0) {
			   ans = ans + arr[(s.charAt(i)- 'a' + 5)%26];
		   }
		   else {
			   ans = ans+s.charAt(i);
		   }
	  }
	  System.out.println(ans);
	  
	  
}
	
}
