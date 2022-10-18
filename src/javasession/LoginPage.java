package javasession;

public class LoginPage {
	String usernmae;
	String password;
	
	public LoginPage(String username,String password){
		this.usernmae=username;
		this.password=password;
		
	}
	public void doLogin(String un,String pwd){
		
		System.out.println("enter username :" +un);
		System.out.println("enter password :" +pwd);
		System.out.println("Login button :");
		
		System.out.println("User login successfully .....:");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp=new LoginPage("admin","admin123");
		lp.doLogin(lp.usernmae, lp.password);

	}

}
