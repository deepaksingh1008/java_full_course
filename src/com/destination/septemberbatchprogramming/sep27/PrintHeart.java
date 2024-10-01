package com.destination.septemberbatchprogramming.sep27;

public class PrintHeart {
  public static void main(String[] args) {
//	   int r = 11;
//	   int c = 12;
//	   int count=1;
//	   int count2=1;
//	   for(int i=0;i<r-1;i++) {
//		   for(int j=0;j<c;j++) {
//			   if((i==(r/2)-1) && (j==0 || j==c-1 || j==c/2)) {
//				     System.out.print("*");
//			   }
//			   else if((i<(r/2)-1) && (i!=0) && (j==0 || j==c-1 || j==)){
//				   System.out.print("*");
//			   }
//			   else if((i>(r/2)-1) && (i!=r-1) && (j==c-1-count || j==count)) {
//				   System.out.print("*");
//			   }
//			   else {
//				   System.out.print(" ");
//			   }
//		   }
//		   if(i>(r/2)-1) {
//			   count++;
//		   }
//		   if(i<(r/2)-1){
//			   count2++;
//		   }
//		   System.out.println("");
//   }
	  
	  for(int i=0;i<=5;i++) {
		  for(int j=0;j<=6;j++) {
			  if((i==0 && j%3!=0) || (i==1 && j%3==0) || (i-j==2) || (i+j==8)) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
		  System.out.println("");
	  }
}
}
