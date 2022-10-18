package InterviewAssignments;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Input Integer");

		while ((n = sc.nextInt()) != 0) {
			System.out.println("You entered" + n);
			System.out.println("Input Integer");
		}
		System.out.println("Out of the loop");
	}

}
