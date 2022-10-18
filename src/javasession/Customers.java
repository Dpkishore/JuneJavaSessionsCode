package javasession;

public class Customers {
	
	String name;
	int age;
	String city;
	String phone;
	

	public Customers(String name) {
		
		this.name = name;
	}


	public Customers(String name, int age) {
		
		this.name = name;
		this.age = age;
	}


	public Customers(String name, int age, String city, String phone) {
		
		this.name = name;
		this.age = age;
		this.city = city;
		this.phone = phone;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customers c1=new Customers("Tom");
		System.out.println(c1.name);
		
		Customers c2=new Customers("ankur" ,45);
		System.out.println(c2.name+"    " + c2.age);
		
		Customers c3=new Customers("ankur" ,45,"hyd","9987766554");
		System.out.println(c3.name+"    " + c3.age +" "+c3.city+ " "+c3.phone);


	}

}
