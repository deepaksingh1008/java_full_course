package com.destination.string.oct16;

class Program1 {
    
public static void main(String [] args){
      String s = "838380hshaabsb$#@%^&";
      String s1="";
      String s2="";
      String s3="";
    
for(int i=0;i<s.length();i++){
      if((s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)) {
    	  s1=s1+s.charAt(i);
      }
      else if(s.charAt(i)>=48 && s.charAt(i)<=57) {
    	  s2=s2+s.charAt(i);
      }
      else{
    	  s3=s3+s.charAt(i);
      }
      
}

System.out.println("Alphabet : "+s1);
System.out.println("Number : "+s2);
System.out.println("Special Character: "+s3);
}
}


