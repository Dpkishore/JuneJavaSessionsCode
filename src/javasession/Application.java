package javasession;

import java.util.ArrayList;

public class Application {

	public double getNumber(double x, double y) {
		double d = x + y;
		return d;

	}
	public String getNumber(String x, double y) {
		String d = x + y;
		return d;

	}
	public ArrayList<String>getDeviceList(String empName){
		
		System.out.println("getting  DeviceList :" +empName);

	ArrayList<String> DeviceList = new ArrayList<>();
	
	if(empName.equalsIgnoreCase("Swathi")){
		DeviceList.add("iphone3");
		DeviceList.add("Macbook pro");
		DeviceList.add("Airtel Sim");
		
	}
	else if (empName.equalsIgnoreCase("aarthi")) {
		DeviceList.add("iPhone 12");
		DeviceList.add("Macbook air");
	}
	else if (empName.equalsIgnoreCase("Prakesh")) {
		DeviceList.add("Vivo");
		DeviceList.add("Appo Mac");
	}
	else{
		System.out.println("No devices are found :" +empName);
	}
	return DeviceList;
	}
	
	
	
	
	
	

	public static void main(String[] args) {

		Application obj = new Application();
		double b = obj.getNumber(20, 60);
	//	System.out.println(b);
		ArrayList<String>l1=obj.getDeviceList("AARTHI");
		System.out.println(l1);
   
	}

}
