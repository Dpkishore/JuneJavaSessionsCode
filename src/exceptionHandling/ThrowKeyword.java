package exceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {

		String data = "pavan";

		if (data == "pavan") {

			try {
				System.out.println("HII pavan");
				
				//throw new Exception("NO DATA FOUND EXCEPTION");

			} catch (Exception e) {
				System.out.println("no data found error;;;;");
				//e.printStackTrace();
			}
		}

		System.out.println("bye:::");
	}

}
