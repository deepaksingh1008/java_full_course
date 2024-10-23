package com.destination.string.oct16;

public class Program4 {
	public static String reverseString(String t) {
		String ans = "";
		for(int i=t.length()-1;i>=0;i--) {
			ans = ans+t.charAt(i);
		}
		return ans; 
	}
  public static void main(String[] args) {
	String s = "Deepak Singh Thakur";
	String ans = "";
	int j=0;
	while(j<s.length()) {
		String t="";
		while((j<s.length()) && (s.charAt(j)!= ' ')) {
			t=t+s.charAt(j);
			j++;
		}
	String s1 =reverseString(t);
		ans = ans + s1 + " ";
		
		j++;
	}
	System.out.println(ans);
			
}
}
