package InterviewAssignments;

import java.util.Scanner;

public class Ifelsecond {

	public static void main(String[] args) {
		/*boolean learning=true;
		
		if(learning){
			System.out.println("java programer");
		}else{
			System.out.println("What is the righht browser");
		}*/
		
		int Obtainedmarks,passingmarks;
		char grade;
		passingmarks=40;
		System.out.println("Enter your Marks");
		Scanner sc=new Scanner(System.in);
		Obtainedmarks=sc.nextInt();
		
		if(Obtainedmarks>=passingmarks){
		//	System.out.println("Pass the exam");
			if(Obtainedmarks>90){
				grade ='A';
			}else if(Obtainedmarks>75){
				grade='B';
			}else if(Obtainedmarks>60){
				grade='c';
			}else{
				grade='D';
				
			}
			System.out.println("you passed the exam grade is -----"+grade);
			
		}else{
			grade='F';
			System.out.println("Sorry fail the exam  :::"+grade);
		}
		

	}

}
