package javasession;

public class Customer1 {
	
	String name;
	int age;
	static String compName="Amazon"; 
	
	public void sendMail(){
		System.out.println("please send Mail");
		
	}
	public static int getInfo(){
		System.out.println("getInfo");
		int a=100;
		int b=200;
		return 10;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer1 obj=new Customer1();
		obj.name="BMW";
		obj.age=26;
		System.out.println(obj.name+"   "+ obj.age+"   " + Customer1.compName);
		System.out.println(compName);
		
	int a=	Customer1.getInfo();
	System.out.println(a);
	getInfo();
	obj.getInfo();
	
	obj.sendMail();

	}

}
