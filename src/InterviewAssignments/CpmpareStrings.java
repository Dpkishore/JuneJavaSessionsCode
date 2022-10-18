package InterviewAssignments;

import java.util.Scanner;

public class CpmpareStrings {

	public static void main(String[] args) {
		String s1, s2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a First String");

		s1 = sc.nextLine();

		System.out.println("Enter a Second String");

		s2 = sc.nextLine();
		
		if(s1.compareTo(s2)>0){
			System.out.println("First String greterthan Second");
			
		}else if(s1.compareTo(s2)<0){
			System.out.println("First String Smaller than Second");
		}else{
			System.out.println("Both are equal");
		}
	}

}
