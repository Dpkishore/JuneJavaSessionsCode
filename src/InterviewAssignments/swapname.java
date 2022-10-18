package InterviewAssignments;

import java.math.BigInteger;
import java.util.Scanner;

public class swapname {

	public static void main(String[] args) {
		
	//	int x,y;
		
		//System.out.println("Enter x and y");
	//	Scanner sc=new Scanner(System.in);
		
	//	x=sc.nextInt();
	//	y=sc.nextInt();
	//	System.out.println("Before Swaping\n="+x+"\ny="+y);
		
	 //  x=x+y;
	//   y=x-y;
	 //  x=x-y;
	   
	//   System.out.println("After Swaping\n="+x+"\ny="+y);
	   
	   //.Add two numbers---
	   
	 /*  int a,b,c;
	   System.out.println("Sum of the numbers calculate....");
	   
	   Scanner sc=new Scanner(System.in);
	   a=sc.nextInt();
	   b=sc.nextInt();
	   c=a+b;
	   
	   System.out.println("Sum of the two Numbers"+c);*/
		
		
		String num1,num2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		num1=sc.nextLine();
		
		System.out.println("Enter Second Number");
		
		num2=sc.nextLine();
		
		BigInteger first=new BigInteger(num1);
		BigInteger second=new BigInteger(num2);
		BigInteger sum;
		sum=first.add(second);
		System.out.println("Addition of the numbers"+sum);

	}

}
