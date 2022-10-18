package oops_Inheritence;

public class BMW  extends Car{
	
	int speed=10;
	static int wheels=4;
	public void Start(){
		System.out.println("BMW is Starting....");
	}
	
	public void Engine(){
		System.out.println("BMW is engine....");
	}

	
	public void autoParking(){
		System.out.println("BMW is AutoParking....");
	}
	public static void billing(){
		System.out.println("BMW------billing");
	}

}
