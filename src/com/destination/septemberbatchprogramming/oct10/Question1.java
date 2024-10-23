package com.destination.septemberbatchprogramming.oct10;

import java.util.Scanner;

class ProductionHouse{
    long arr[][][];
    long revenue[];
    long total_revenue;
    long total_investment;
    long previousProfit;
    int  language;
    int  category;
    int  movies;
    Scanner sc = new Scanner(System.in);
    
    void createProductionHouse(int lan,int cat,int mov) {
    	System.out.println("Enter the total investment");
        total_investment = sc.nextLong();
        System.out.println("Enter the Previous proft");
        previousProfit = sc.nextLong();
        language = lan;
        category = cat;
        movies = mov;
        arr = new long [language][category][movies];
        revenue = new long [category];
        System.out.println("Initialization is completed");
        System.out.println("==========================");
    }
    void addingData() {
    	
    	for(int i=0;i<arr.length;i++) {
    		long temp=0;
    		System.out.println(" language "+(i+1));
    		for(int j=0;j<arr[i].length;j++) {
    			System.out.println("Inside category "+(j+1));
    			for(int k=0;k<arr[i][j].length;k++) {
    			   System.out.println("Enter the revenue of movie "+(k+1));
    			   arr[i][j][k]=sc.nextLong();
    			   temp=temp+arr[i][j][k];
    			   total_revenue+=arr[i][j][k];
    			}
    		}
    		revenue[i]=temp;
    	}
    }
    void display() {
        long profit;
        long loss;
        if(total_revenue>total_investment) {
        	profit = total_revenue - total_investment;
        	System.out.println("Total Profit in this year"+(profit));
        }
        else if(total_investment>total_revenue) {
        	loss = total_investment - total_revenue;
        	System.out.println("Total Loss in this year"+(loss));
        	
        }
        
        
    }
}

public class Question1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n,m,k;
		System.out.println("Enter the total number of language  ");
		n = scanner.nextInt();
		System.out.println("Enter the total number of Category");
		m=scanner.nextInt();
		System.out.println("Enter the total number of movie in each category");
		k = scanner.nextInt();
		ProductionHouse obj1 = new ProductionHouse();
		obj1.createProductionHouse(n, m, k);
		obj1.addingData();
		obj1.display();
		
	}

}
