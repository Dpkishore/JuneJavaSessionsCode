package oops_encapsulation;

public class RegTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Registration rg=new Registration("pavan","pavan@gmail.com");
		
		System.out.println(rg.getFirstname()+"   "+rg.getEmail());
		
		
		rg.setLastname("dasi");
		rg.setPassword("pavan123");
		rg.setPhoneNumber("9898667790");
		System.out.println(rg.getLastname()+"  " +rg.getPassword()+"   " +rg.getPhoneNumber());

		LoginPage lp=new LoginPage("admin","admin123");
		lp.doLogin();
		
		
	}

}
