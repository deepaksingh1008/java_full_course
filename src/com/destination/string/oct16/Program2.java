package com.destination.string.oct16;

public class Program2 {
 public static void main(String[] args) {
	String s="                    HHSSBSBSBBSBSKDJ   JSHSNSB   hdhdbzhjbb  JNSNS    jsdhsh  hsdhs  da  a  dhn w  dsd   dis       ";
	int count = 0;
	int i=0;
	while(i<s.length() && s.charAt(i) == ' ') {
		i++;
	}
	while(i<s.length()) {
		count++;
		 while((i<s.length()) && (s.charAt(i)!=' ')) {
			 i++;
		 }
		 while(i<s.length() &&s.charAt(i)==' ') {
			 i++;
		 }
		 
		 i++;
	}
	System.out.println("Total Count of Word :"+count);
}
}
