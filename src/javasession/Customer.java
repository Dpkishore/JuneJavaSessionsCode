package javasession;

public class Customer {
	
	String name;
	int age;
	String Address;

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
     Customer c1=new Customer();
     c1.name="pavan";
     c1.age=27;
     c1.Address="Hyd";
     
     Customer c2=new Customer();
     c2.name="Rupesh";
     c2.age=28;
     c2.Address="Delhi";
     Customer c3=new Customer();
     c3.name="Yogi";
     c3.age=29;
     c3.Address="Chenni";
     
     Customer c4=new Customer();
     c4.name="Krish";
     c4.age=30;
     c4.Address="Banglore";
     
     
     System.out.println(c1.name+"  "+c1.age+"  " +c1.Address);
     System.out.println(c2.name+"  "+c2.age+"  " +c2.Address);
     
     System.out.println(c3.name+"  "+c3.age+"  " +c3.Address);
     System.out.println(c4.name+"  "+c4.age+"  " +c4.Address);
     System.out.println("------------------");
     
     c1=c2;
     
     System.out.println(c1.name+"  "+c1.age+"  " +c1.Address);
     System.out.println(c2.name+"  "+c2.age+"  " +c2.Address);
     
     System.out.println(c3.name+"  "+c3.age+"  " +c3.Address);
     System.out.println(c4.name+"  "+c4.age+"  " +c4.Address);
     
     System.out.println("------------------");
     
     c2=c3;
     
     System.out.println(c1.name+"  "+c1.age+"  " +c1.Address);
     System.out.println(c2.name+"  "+c2.age+"  " +c2.Address);
     
     System.out.println(c3.name+"  "+c3.age+"  " +c3.Address);
     System.out.println(c4.name+"  "+c4.age+"  " +c4.Address);
     
     System.out.println("------------------");
     
     
     c3=c4;
     
     System.out.println(c1.name+"  "+c1.age+"  " +c1.Address);
     System.out.println(c2.name+"  "+c2.age+"  " +c2.Address);
     
     System.out.println(c3.name+"  "+c3.age+"  " +c3.Address);
     System.out.println(c4.name+"  "+c4.age+"  " +c4.Address);
     
     System.out.println("------------------");
     
     c4=c1;
     
     System.out.println(c1.name+"  "+c1.age+"  " +c1.Address);
     System.out.println(c2.name+"  "+c2.age+"  " +c2.Address);
     
     System.out.println(c3.name+"  "+c3.age+"  " +c3.Address);
     System.out.println(c4.name+"  "+c4.age+"  " +c4.Address);
     
     System.out.println("------------------");
     
     c4=c2;
     
     System.out.println(c1.name+"  "+c1.age+"  " +c1.Address);
     System.out.println(c2.name+"  "+c2.age+"  " +c2.Address);
     
     System.out.println(c3.name+"  "+c3.age+"  " +c3.Address);
     System.out.println(c4.name+"  "+c4.age+"  " +c4.Address);
     
     System.out.println("--------------c4----");
     
     c3=c1;
     System.out.println(c1.name+"  "+c1.age+"  " +c1.Address);
     System.out.println(c2.name+"  "+c2.age+"  " +c2.Address);
     
     System.out.println(c3.name+"  "+c3.age+"  " +c3.Address);
     System.out.println(c4.name+"  "+c4.age+"  " +c4.Address);
     
     System.out.println("--------------c3----");
     
     
	}

}
