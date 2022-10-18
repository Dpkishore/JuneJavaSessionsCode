package InterviewAssignments;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		float temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temparature in Fehreinheit");
		
		temp=sc.nextInt();
		temp=((temp-32)*5)/9;
		System.out.println("Fehreinheit to Celsius ="+temp);

	}

}
