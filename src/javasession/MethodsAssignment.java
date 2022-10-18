package javasession;

public class MethodsAssignment {
	
	
	
	public int sum(int x, int y){
		int z=x+y;
		return z;
	}

	public int user(int x, int y){
		int z=x*y;
		return z;
	}

	public static void main(String[] args) {
		MethodsAssignment obj=new MethodsAssignment();
		int sum1=obj.sum(90, 89);
		//System.out.println(sum1);
		int product2=obj.user(34, 54);
		System.out.println(product2);
		

	}

}
