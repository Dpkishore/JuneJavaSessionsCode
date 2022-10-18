package superkeyword;

public class Car extends Vechile {
	
	
	int minSpeed=100;

	public Car() {
		super();
		System.out.println("No param Constructor");
		

	}

	public Car(int i) {
		
		
		
		System.out.println("One param Constructor" +i);
		

	}
	
	public Car(int i,String p) {
		System.out.println("Two param Constructor" +(i+p));
		

	}
	
	public void getMileage() {
		System.out.println("car mileage is 15");
	}

}
