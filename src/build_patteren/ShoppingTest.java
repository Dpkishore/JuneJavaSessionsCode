package build_patteren;

public class ShoppingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ecomm e=new Ecomm();
		e.doLogin("pavan@123gmail.com","naveeen123")
		     .search("macbook")
		           .addTocart("macbook pro")
		             .makePayment("1232 1233 322" +1234)
		                 .generateOrder()
		                   .logout();

	}

}
