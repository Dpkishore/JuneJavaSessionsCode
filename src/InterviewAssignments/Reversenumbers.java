package InterviewAssignments;

import java.util.Scanner;

public class Reversenumbers {

	public static void main(String[] args) {
		int n,reverse;
		
    System.out.println("Enter  Number to reverse");
    
    Scanner sc=new Scanner(System.in);
    
    n=sc.nextInt();
    
    while(n > 0){
    	//reverse = reverse * 10;
    	reverse =  n % 10;
    	System.out.println(reverse);
    	n=n / 10;
    	
    	  System.out.println("Reverse of the number is::"+n);
    }
  
    
	}

}
