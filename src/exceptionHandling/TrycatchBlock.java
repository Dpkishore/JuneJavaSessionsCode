package exceptionHandling;

public class TrycatchBlock {
	String name;

	public static void main(String[] args) {
	System.out.println("A");
	
	int a=9;
	int b=0;
	try{
		
		TrycatchBlock obj=new TrycatchBlock();
		obj=null;
		obj.name="pavan";
		
		int i=a/b;
		System.out.println("Hello");
		
	}
	catch(ArithmeticException e){
		System.out.println("AE Exception");
	//	e.printStackTrace();
		
		
	}catch(NullPointerException n){
		//System.out.println("Null pointer Exception");
		//n.printStackTrace();
		
	}
	
	try {
		int p = 9/0;
	}
	catch(ArithmeticException e ) {
		String n = "test";
		if(n.equals("test")) {
			System.out.println("Testing printed");
			
		}
	}

	}

}
