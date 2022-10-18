package InterviewAssignments;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
	/*	int n,c,fact=1;
		System.out.println("Enter  A factorial value is..");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	//	c=sc.nextInt();
		
		if(n<0){
			System.out.println(" n should be non-negetive number");
		}else{
		
		for(c=1;c<=n;c++){
		fact=fact*c;
		System.out.println("factorial value is....."+fact);
			
		}
			
		}*/
		
		int n,c;
		BigInteger bi=new BigInteger("1");
		
		BigInteger fact=new BigInteger("1");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an Integer");
		n=sc.nextInt();
		
		for(c=1;c<=n;c++){
			
			fact=fact.multiply(bi);
			System.out.println(bi);
			bi=bi.add(BigInteger.ONE);
		}
  System.out.println(n+  "  !=  " + fact);
	}

}
