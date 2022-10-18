package exceptionHandling;

public class ThrowsKeyword {

	public static void addToCard() {
		System.out.println("Add to Card");
		dopayment();
	}

	public static void generateOrderId(int num) throws ArithmeticException {
		System.out.println("Generate order");
		int i=9/num;

	}
	
	
	public static void  dopayment(){
		System.out.println("do payment");
		try{
			generateOrderId(0);
			
		}
		catch(ArithmeticException e){
			System.out.println(" AE exception is  :::");
			
			//e.printStackTrace();
			
		}
	}

	public static void main(String[] args) {
	addToCard();
	System.out.println("bye");

	}

}
