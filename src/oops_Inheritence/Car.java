package oops_Inheritence;

public class Car extends Vechile {
	
	
	int speed = 100;
	static final int wheels = 4;
	
	
	public void start() {
		System.out.println("car start........");

	}

	public void stop() {
		System.out.println("car Stop........");

	}

	public void refuel() {
		
		System.out.println("car refuel........");

	}
	
	public static void billing(){
		System.out.println("BMW------billing");
	}

}
