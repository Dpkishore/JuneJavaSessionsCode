package InterviewAssignments;

public class HelloworldWithoutSemicolon {

	public static void main(String[] args) {
		
		
		int num1=150;
		int num2=150;
		if(num1==num2){
			//System.out.println("Both are equal");
		}else{
			//System.out.println("Both are not equal");
			
		}
		
		long longNumWithoutL=1000*20*30*34;
		//System.out.println(longNumWithoutL);
		long longNumWithL=1000*20*30*340L;
		//System.out.println(longNumWithL);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f));
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
		
		System.out.println(2.3%0);
		System.out.println(0.0%0.0);
		
	}

}
