package javasession;

public class Factorial {
	
	
	
	public static int factorial(int n){
		int i,fact=1;
		for(i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj=new Factorial();
		int fact=obj.factorial(6);
		System.out.println(fact);

	}

}
