package javasession;

public class MethodChainnigConcept {

	public int getTotalbill(int userCount, int code) {
		int tax = 100;
		int bill = 1000;
		int total = tax + bill;
		return total;

	}

	public void m1(int i) {
		m2(i);

	}

	public void m2(int k) {
		m3(k);

	}
	
	public void m3(int p) {
		System.out.println("bye" +p);

	}


	public static void main(String[] args) {

		MethodChainnigConcept obj = new MethodChainnigConcept();
		obj.m3(10);

		int TotalPayment = obj.getTotalbill(10, 20);
		System.out.println(TotalPayment);

	}

}
