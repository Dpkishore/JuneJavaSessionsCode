package javasession;

public class Ecomm {
	

	public void test() {
		System.out.println("Test Methos");
	}

	public int test(int x) {
		return 10 + x;

	}

	public void test(int x, int y) {

	}

	public void test(String x, String y) {

	}

	public void test(String x) {

	}

	// Amazon login methods----------------------
	public void login() {

	}

	public void login(String userName, String password) {

	}

	public void login(String userName, String password, int otp) {

	}

	public void login(String userName, String password, String role) {

	}

	public void search() {

	}

	public void search(String searchProductName) {

	}

	public void search(String searchProductName, String color) {

	}

	public void search(String searchProductName, String color, int price) {

	}

	public void doPayment(String upi) {

	}

	public void doPayment(String cc, int cvv, int otp) {

	}

	public void doPayment(String paypalId, int password) {

	}

	// uber booking cab

	public void booking(String stLocation, String edLocation) {

	}

	public void booking(String stLocation, String edLocation, String carType) {

	}
	
	public String booking(String stLocation, String edLocation, String carType,String coupunCode) {
		
	
     return "";
		
	}


	public static void main(String[] args) {
		Ecomm obj = new Ecomm();
		int c = obj.test(20);
		System.out.println(c);
		
	obj.booking("hyderad", "banglore", "BMw", "nhhdsgu");
	System.out.println(obj.booking("hyderad", "banglore", "BMw", "nhhdsgu"));
	

     
	}

	

}
