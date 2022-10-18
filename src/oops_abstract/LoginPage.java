package oops_abstract;

public class LoginPage extends Page {
	
	
	public LoginPage(){
		System.out.println("Login Page");
	}
	
	public  LoginPage(int i) {
		
		System.out.println("LP - const...."+i);
	}

	@Override
	public void title() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void url() {
		// TODO Auto-generated method stub
		
	}
	
	public void resetPassword(){
		System.out.println("User password---");
	}
	
	public void doLogin(String un,String pwd){
		System.out.println("username"+un+"pwd" +pwd);
		
	}

}
