package javasession;

public class Car {
	
	String name;
	int price;
	String color;
	boolean isAutomatic;

	public static void main(String[] args) {
		Car c1=new Car();
		c1.name="FERERA";
		c1.price=34;
		c1.color="Red";
		c1.isAutomatic=true;
		
		System.out.println(c1.name+"  "+c1.price+"  " +c1.color+"  "+c1.isAutomatic);
		Car c2=new Car();
		c2.name="BMW";
		c2.color="Black";
		System.out.println(c2.price);
		new Car().name="Honda";
		new Car().price=30;
		new Car().color="black";
		new Car().isAutomatic=false;
		System.out.println(new Car().price=45);
		
		
		Car t1=new Car();
		t1=null;
		//t1.name="Pavan";
		//System.out.println(t1.name);
		System.gc();
		

	}

}
