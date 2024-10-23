package com.destination.string.oct16;



public class Program3 {
  public static void main(String[] args) {
   String password = "37hsdbhbsbbs$D";
   boolean small=false;
   boolean captial=false;
   boolean number=false;
   boolean symbol = false;
   for(int i=0;i<password.length();i++) {
	   if((password.charAt(i)>=65 && password.charAt(i)<=90)) {
		   small = true;
	   }
	   if((password.charAt(i)>=97 && password.charAt(i)<=122)) {
		   captial = true;
	   }
	   if(password.charAt(i)>=48 && password.charAt(i)<=57) {
	    	 number = true;
	      }
	   if(password.charAt(i)=='@' || password.charAt(i)=='#' || password.charAt(i)=='$' || password.charAt(i)=='%' || password.charAt(i)=='&') {
		   symbol = true;
	      }
   }
   if(small && number && captial && symbol && password.length()>=10) {
	   System.out.println("Password is correct");
	   return;
   }
   System.out.println("Password is incoorect");
  }
  }

