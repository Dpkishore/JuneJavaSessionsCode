package javasession;

public class EmployeeType {
	String name;
	int age;
	double salary;

	public void Test() {
		System.out.println("test Method");
	}

	public EmployeeType() {
		System.out.println("Default const..........");

	}
	public EmployeeType(int a) {
		System.out.println(" One parameter.........." +a);

	}
	public EmployeeType(int a,String b) {
		System.out.println(" Two parameter.........." +a+b);

	}
	
	

	public static void main(String[] args) {
		
		
		EmployeeType obj=new EmployeeType(10,"tset");
		obj.Test();

	}

}
