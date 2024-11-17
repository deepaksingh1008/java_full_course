package com.destination.proejct1;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
 public static void main(String[] args) {
	ArrayList<Question> questions = new ArrayList<Question>();
	Question que1 = new Question();
	User user = new User();
	Scanner sc = new Scanner(System.in);
 	que1.question = "Who is Prime Minister Of India";
	que1.option1 = "Dr Manmohan Singh";
	que1.option2 = "Narendra Modi";
	que1.option3 = "Rahul Gandhi";
	que1.option4 = "Non of these";
	que1.answer = "Narendra Modi";
	
	
	
	Question que2 = new Question();
	que2.question = "Who won t20 world cup in 2024";
	que2.option1 = "India";
	que2.option2 = "Pakistan";
	que2.option3 = "Austrilia";
	que2.option4 = "England";
	que2.answer = "India";
	
	
	
	Question que3 = new Question();
	que3.question = "Which Country Won Highest number of medal in paris olympic 2024";
	que3.option1 = "USA";
	que3.option2 = "India";
	que3.option3 = "China";
	que3.option4 = "France";
	que3.answer = "USA";
	
	
	Question que4 = new Question();
	que4.question = "When Java Language Invented ?";
	que4.option1 = "1982";
	que4.option2 = "1990";
	que4.option3 = "1992";
	que4.option4 = "1995";
	que4.answer = "1992";
	
	
	
	Question que5 = new Question();
	que5.question = "Who is First President Of India";
	que5.option1 = "Dr Rajendra Parsad";
	que5.option2 = "Jawahar Lal Nehru";
	que5.option3 = "Mahatma Gandhi";
	que5.option4 = "Narendra Modi";
	que5.answer = "Dr Rajendra Parsad";
	
	

	
	
	questions.add(que1);
	questions.add(que2);
	questions.add(que3);
	questions.add(que4);
	questions.add(que5);
	
	

	
	System.out.println("******************Welcome To The KBC*********************");
	
	System.out.print("Enter Your Name : ");
	String name=sc.nextLine();
	user.setName(name);
	System.out.print("Enter Your Email Id : ");
	String email = sc.nextLine();
	user.setEmail(email);
	System.out.println("");
	System.out.println("");
	
	int i=0;
	boolean flag = true;
	int totalQuestion = questions.size();
	boolean useaudiencePole = false;
	String userAnswer = null;
	while(flag && i<totalQuestion) {
		String question = questions.get(i).question;
		String opt1 = questions.get(i).option1;
		String opt2 = questions.get(i).option2;
		String opt3 = questions.get(i).option3;
		String opt4 = questions.get(i).option4;
		String ans = questions.get(i).answer;
		int audiencePole = user.auidencePole;
	    int queNo = i+1;
		System.out.println("que"+queNo +": "+question);
		System.out.print("1 "+opt1 + "                     ");
		System.out.println("2 "+opt2);
		System.out.print("3 "+opt3 + "                     ");
		System.out.println("4 "+opt4);
		if(audiencePole>0) {
			System.out.println("You Have "+audiencePole+" Pole ");
			System.out.println("You want to Use audience Pole : ");
			System.out.print("1.Yes               ");
			System.out.println("2.No");
			int check = sc.nextInt();
			if(check==1) {
				useaudiencePole=true;
			}
			
		}
		if(useaudiencePole) {
			user.auidencePole = user.auidencePole-1;
			System.out.println("According To audience answer is "+ans);
		}
		
		System.out.print("Enter your Option Number : ");
		int optionNumber = sc.nextInt();
		if(optionNumber == 1) {
			userAnswer = opt1;
		}
		if(optionNumber == 2) {
			userAnswer = opt2;
		}
		if(optionNumber == 3) {
			userAnswer = opt3;
		}
		
		if(optionNumber == 4) {
			userAnswer = opt4;
		}
		
		if(!userAnswer.equals(ans)) {
			flag = false;
		}
		
		if(userAnswer.equals(ans)) {
			user.correct = user.correct+1;
			user.totalWinningAmount +=  user.amount*queNo;
		}
		
		System.out.println("");
		i++;		
		useaudiencePole=false;
	}
	
	System.out.println("********************************************************");
	System.out.println("User Name : " + user.getName());
	System.out.println("User Email : "+user.getEmail());
	System.out.println("Total Correct :"+user.correct);
	System.out.println("");
	System.out.println("");
	System.out.println("******************** Congratulation********************");
	System.out.println("");
	System.out.println("");
	System.out.println("***************************Your Winning Amount is " + user.totalWinningAmount+" ***************************");
	
	
	
}
}
