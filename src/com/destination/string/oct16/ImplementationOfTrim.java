package com.destination.string.oct16;
public class ImplementationOfTrim {
	public static String Trim(String s) {
		if(s.length()==0) {
			System.out.println("String is empty");
			return "";
		}
			
		int i=0;
		while(i<s.length() && s.charAt(i)==' ')
		        	i++;
	    int j=s.length()-1;
		while( j>=0 && s.charAt(j) == ' ')
			  j--;		
		if(j<i) {
			System.out.println("String Conatin only White space");
			return "";
		}
		return s.substring(i,j+1);
	}
	public static String RemoveAllWhiteSpace(String s) {
		if(s.length()==0) {
			System.out.println("String is empty");
			return "";
		}
		int i=0;
		while(i<s.length() && s.charAt(i)==' ')
			i++;
		int j = s.length()-1;
		while( j>=0 && s.charAt(j) == ' ')
			 j--;
		if(j<i) 
		{
			System.out.println("String cotain only white space");
			return "";
		}
		String s1 = s.substring(i,j+1);
		int n = s1.length();
		String ans = "";
		int k=0;
		while(k<n) {
			ans = ans+s1.charAt(k);
			if(s1.charAt(k)== ' ')
			{
				while(k<n && s1.charAt(k)== ' ') {
					k++;
				}
			}
			else {
				k++;
			}	
		}
		return ans;
	}
  public static void main(String[] args) {
	String s = "      deepak               singh                   Thakur     ";
	
	System.out.println(s);
	String s1 = Trim(s);
	System.out.println(s1);
	String s2 = RemoveAllWhiteSpace(s);
	System.out.println(s2);
	
	
}
}
