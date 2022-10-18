package javasession;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1=99;
		int n2=90;
		int n3=10;
		if(n1>=n2 &&  n1>=n3){
			System.out.println(n1 +"is the largest number :");
		}
		else if(n2>=n3 && n2>=n1){
			System.out.println(n2 +"is the largest number  :");
		}else{
			System.out.println(n3 +"is the largest number");
		}
 
	}

}
