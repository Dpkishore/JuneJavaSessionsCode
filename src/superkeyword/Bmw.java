package superkeyword;

public class Bmw extends Car {
	
	public Bmw(){
		System.out.println("BMW Default Constant");
	}
	
	public void getMilage(){
		super.getMileage();
		System.out.println("Mileage is 18:::");
	}
	
	public void displaySpeed() {
		System.out.println("BMW speed: " + minSpeed);//200
		
		System.out.println("Car speed: " + super.minSpeed);//100
	}

}
