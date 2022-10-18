package InterviewAssignments;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		int x;
		System.out.println("enter num even or odd");
		Scanner sc =new Scanner(System.in);
		x=sc.nextInt();
		if(x%2==0){
			System.out.println("even number");
		}else{
			System.out.println("Odd number");
		}

	}

}
