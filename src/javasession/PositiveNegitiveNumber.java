package javasession;

import java.util.Scanner;

public class PositiveNegitiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		num=sc.nextInt();
		
		if(num>0){
			System.out.println("Positive Number");
			
		}
		else if(num<0){
			System.out.println("Negitive Number");
		}
		else{
			System.out.println("number is Zero");
		}

	}

}
