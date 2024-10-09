package com.destination.septemberbatchprogramming.sep27;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
    	int row = 11;
    	int col = 11;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Size of Pattern : ");
    	row = sc.nextInt();
    	col = row;
    	sc.nextLine();
    	System.out.print("Enter The Name : ");
    	String name = sc.nextLine(); 
    	String name1 = name.toUpperCase();
//        System.out.println(name1);
       new PrintName().printName(name1,row,col);
        
    }

    public void printName(String name,int row,int col) {
        for (int i = 0; i < row; i++) {
            for (char letter : name.toCharArray()) {
            	if(letter == ' ') {
            		System.out.print("               ");
            		continue;
            	}
                printLetter(letter, i,col,row);
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    private void printLetter(char letter, int i,int col,int row) {
        switch (letter) {
            case 'B': printB(i, col, row); break;
            case 'C': printC(i, col, row); break;
            case 'D': printD(i,col,row); break;
            case 'E': printE(i,col,row); break;
            case 'F': printF(i,col,row); break;
            case 'G': printG(i,col,row); break;
            case 'H': printH(i,col,row); break;
            case 'I': printI(i,col,row); break;
            case 'J': printJ(i,col,row); break;
            case 'P': printP(i,col,row); break;
            case 'A': printA(i,col,row); break;
            case 'K': printK(i,col,row); break;
            case 'L': printL(i,col,row); break;
            case 'M': printM(i,col,row); break;
            case 'N': printN(i,col,row); break;
            case 'O': printO(i,col,row); break;
            case 'Q': printQ(i,col,row); break;
            case 'R': printR(i,col,row); break;
            case 'S': printS(i,col,row); break;
            case 'T': printT(i,col,row); break;
            case 'U': printU(i,col,row); break;
            case 'V': printV(i,col,row); break;
            case 'W': printW(i,col,row); break;
            case 'X': printX(i,col,row); break;
            case 'Y': printY(i,col,row); break;
            case 'Z': printZ(i,col,row); break;
           
            default: System.out.print("     ");
        }
    }

    private void printD(int i,int col,int row) {
        for (int j = 0; j < col; j++) {
            if (j == 0 || (i == 0 || i == row-1) && j < col-1 || (j == col-1 && i != 0 && i != row-1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    private void printE(int i,int col,int row) {
        for (int j = 0; j < col; j++) {
            if (j == 0 || i == 0 || i == row/2 || i == row-1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    private void printP(int i,int col,int row) {
        for (int j = 0; j < col; j++) {
            if (j == 0 || (i == 0 || i == row/2) && j < col-1 || (j == col-1 && i>0 && i<row/2)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    private void printA(int i,int col,int row) {
        for (int j = 0; j < col; j++) {
            if ((j == 0 || j == col-1) && i != 0 || i == 0 && j != 0 && j != col-1 || i == row/2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    private void printK(int i,int col,int row) {
        for (int j = 0; j < col; j++) {
            if (j == 0 || (i<=row/2 && j == (col/2)-i+1) || j == i - row/2 && i > row/2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    private void printB(int i,int col,int row) {
		for(int j=0;j<col;j++) {
			if((i==0 || i==row-1) && (j!=0) || (i==row/2) ||((i>0 && i<row-1) && (j==0 ||j==col-1))) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
	}
    private void printC(int i,int col,int row) {
		for(int j=0;j<col;j++) {
			if(((i==0 || i==row-1) && (j!=0)) || ((i>0 && i<row-1) && j==0)) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
	}
    private void printF(int i,int col,int row) {
    	for(int j=0;j<col;j++) {
    		if((i==0 || i==row/2) || j==0) {
    			System.out.print("*");
    		}
    		else {
    			System.out.print(" ");
    		}
    	}
		
	}
    private void printG(int i,int col,int row) {
		 for(int j=0;j<col;j++) {
			 if((i==0 && j!=0) || (i==row-1 && j<col/2) || (j==0 && i>0) || (i>=row/2 && j==col/2) || (i==row/2 && j>col/2 && j<=col-1) || (i>row/2 && j==col-1)) {
				 System.out.print("*");
			 }
			 else {
				 System.out.print(" ");
			 }
		 }
	}
    private void printH(int i,int col,int row) {
		  for(int j=0;j<col;j++) {
			  if(j==0 || j==col-1 || i==row/2) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
	}
    private void printI(int i,int col,int row) {
		 for(int j=0;j<col;j++) {
			 if(i==0 || i==col-1 || j==col/2) {
				 System.out.print("*");
			 }
			 else {
				 System.out.print(" ");
			 }
		 }
	}
    private void printJ(int i,int col,int row) {
		for(int j=0;j<col;j++) {
			if((i==0 && j>2) || i==row-1 || (i>row/2 && j==0) || j==col-1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
	}
    private void printL(int i,int col,int row) {
		for(int j=0;j<col;j++) {
			if(j==0 || i==row-1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
	}
    private void printM(int i,int col,int row) {
		   for(int j=0;j<col;j++) {
			   if(j==0 || j==col-1 || (i!=0 && i<row/2 && (j==i || j==col-1-i)) || (i==row/2 && j==col/2)){
				   System.out.print("*");
			   }
			   else {
				   System.out.print(" ");
			   }
		   }
	}
    private void printN(int i,int col,int row) {
		for(int j=0;j<col;j++) {
			if(j==0 || j==col-1 || j==i) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
	}
    private void printO(int i,int col,int row) {
	for(int j=0;j<col;j++) {
		if(((i==0 || i==row-1) && (j!=0 && j!=col-1)) || ((i>0 && i<row-1) && (j==0 || j==col-1)) ) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
}
    private void printQ(int i,int col,int row) {
	for(int j=0;j<col;j++) {
		if((i==0 || i==row-2)  || ((i>0 && i<row-1) && (j==0 || j==col-1)) || (i>=row/2 && j==i) ) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
}
    private void printR(int i,int col,int row) {
	for(int j=0;j<col;j++) {
		if(j==0 || i==0 || (i<row/2 && j==col-1) || i==row/2 || (i>row/2 && j==(i-row/2)*2)) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
}
    private void printS(int i,int col,int row) {
	for(int j=0;j<col;j++) {
		if(i==0 || i==row/2 || i==row-1 || (i<row/2 && j==0) || (i>row/2 && j==col-1)) {
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
}
    private void printT(int i,int col,int row) {
		  for(int j=0;j<col;j++) {
			  if(j==col/2 || i==0 || (i<=(row/4) && (j==0 || j==col-1))) {
				  System.out.print("*");
			  }
			  else {
				  System.out.print(" ");
			  }
		  }
	}
    private void printU(int i,int col,int row) {
		for(int j=0;j<col;j++) {
			if(((j==0 || j==col-1) && i<row-1) || (i==row-1 && j!=0 && j!=col-1)) {
				System.out.print("*");
			}
			else {
			  System.out.print(" ");	
				
			}
		}
	}
    private void printV(int i,int col,int row) {
    	col=col*2;
    	for(int j=0;j<col;j++) {
			if(j==i || j==col-1-i) {
				System.out.print("*");
			}
			else {
			  System.out.print(" ");	
				
			}
		}
	
}
    private void printW(int i,int col,int row) {
    	for(int j=0;j<col;j++) {
			if(j==0 || j==col-1 || (i==row/2 && j==col/2) || (i>row/2 && (j==i || i+j==row-1))) {
				System.out.print("*");
			}
			else {
			  System.out.print(" ");	
				
			}
		}
	
}
    private void printX(int i,int col,int row) {
    	for(int j=0;j<col;j++) {
			if(j==i || j==col-1-i) {
				System.out.print("*");
			}
			else {
			  System.out.print(" ");	
				
			}
		}
	
}
    private void printY(int i,int col,int row) {
    	for(int j=0;j<col;j++) {
			if((i<row/2 && (i==j || j==col-i-1)) || (i>=row/2 && j==col/2)) {
				System.out.print("*");
			}
			else {
			  System.out.print(" ");	
				
			}
		}
	
}
    private void printZ(int i,int col,int row) {
    	for(int j=0;j<col;j++) {
			if(i==0 || j==col-1-i || i==row-1) {
				System.out.print("*");
			}
			else {
			  System.out.print(" ");	
				
			}
		}
	
}
}
