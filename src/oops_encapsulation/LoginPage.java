package oops_encapsulation;

public class LoginPage {
	private String userName;
	private String password;
	
	
	
	public LoginPage(String userName, String password) {
		
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void doLogin(){
		System.out.println("enter usernamr :" +userName);
		System.out.println("enter password :" +password);
		System.out.println("Click to Login button");
		
		System.out.println("Login sucessfully....");
		
		
	}
	
	

}
