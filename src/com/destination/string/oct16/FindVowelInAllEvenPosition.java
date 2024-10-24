package com.destination.string.oct16;

public class FindVowelInAllEvenPosition {
	public static boolean checkVowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			return true;
		}
		return false;
			
	}
public static void main(String[] args) {
		String s = "abcdegssklakeosnxioef";
		int i=0;
	    String ans = "";
		while(i<s.length()) {
			
			 if(i%2==0 && checkVowel(s.charAt(i))) {
				ans = ans+s.charAt(i);
			}
			
			i++;
		}
		
		System.out.println(ans);

	}

}
