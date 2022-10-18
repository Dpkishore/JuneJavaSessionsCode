package inheritence_assignment;

import java.util.Scanner;

public class Swapthreenumbers {

	public static void main(String[] args) {
	int x,y,temp;
	
	System.out.println("Enter X and Y");
	Scanner sc=new Scanner(System.in);
	x=sc.nextInt();
	y=sc.nextInt();
	System.out.println("Before Swaping\n"+x+"\ny="+y);
	
	temp=x;
	x=y;
	y=temp;
	System.out.println("After Swaping\n"+x+"\ny="+y);
	}

}
