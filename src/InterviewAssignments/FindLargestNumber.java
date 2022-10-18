package InterviewAssignments;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter three Numbers");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>y && x>z){
			System.out.println("First num is largest");
		}else if(y>x && y>z){
			System.out.println("Second num is largest");
		}else if(z>x && z>y ){
			System.out.println("Third num is largest");
		}else{
			System.out.println("please entyer correct num ......");
		}

	}

}
