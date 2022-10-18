package javasession;

public class Employee {
	
	
	public void test(){
		System.out.println("Test Method");
		
	}
	public String getName(){
		System.out.println("Get name Method");
		String n="Tom";
		return n;
		
	}
	
	public int add(){
		System.out.println("Add numbers");
		
		int a=100;
		int b=200;
		int c =a+b;
		return c;
	}
	public int sum(int x,int y){
		System.out.println("Sum of the numbers");
		int total=x+y;
		return total;
		
	}
	public int getMarks(String stringName){
		System.out.println("Student Marks" +stringName);
		
		int Marks=0;
		
		if(stringName.equals("Tom")){
			//return 90;
			Marks=90;
		}
		else if(stringName.equals("Naveen")){
			//return 93;
			Marks=93;
		}
		
		else if(stringName.equals("pavan ")){
			//return 98;
			Marks=98;
		}
		
		
	
		else{
			System.out.println("Student Name not found" +stringName);
			//return -1;
			Marks=-1;
		}
		return Marks;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		
		e.test();
		//System.out.println(e);
		
		String name=e.getName();
		//System.out.println(name);
		
		int b=e.add();
		System.out.println(b);
		int m=e.getMarks("Tom");
		System.out.println(m);
		
	}

}
