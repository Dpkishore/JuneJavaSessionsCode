package javasession;

public class Assignment3 {
	double PI = 3.14;
	static int n = 37;

	public double circumference(double r) {
		double cir = 2 * PI * r;
		return cir;
	}

	public boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment3 obj = new Assignment3();
		// double d=obj.circumference(10);
		// System.out.println(d);

		boolean b = obj.isPrime(10);
		System.out.println(b);

		if (obj.isPrime(n)) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}

	}

}
