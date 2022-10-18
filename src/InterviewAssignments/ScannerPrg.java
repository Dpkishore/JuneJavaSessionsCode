package InterviewAssignments;

import java.util.Scanner;

public class ScannerPrg {
	
	

	public static void main(String[] args) {
		int i;
		float f;
		String s;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String");
		s=sc.nextLine();
		
		System.out.println("You Enter a String"+s);
		
		
		System.out.println("Enter a Integer");
		i=sc.nextInt();
		System.out.println("YOu Enter a String"+i);
		
		System.out.println("Enter a Float");
		f=sc.nextFloat();
		System.out.println("You Enter a Float"+f);
	}

}
