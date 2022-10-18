package oops_encapsulation;

public class Registration {

	
	private String firstname;
	private String lastname;
	private String phoneNumber;
	private String Password;
	private String Email;
	
	
	
	
	public Registration(String firstname, String email) {
		
		this.firstname = firstname;
		Email = email;
	}
	
	
	

	public Registration(String firstname, String lastname, String password, String email) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		Password = password;
		Email = email;
	}



	public Registration(String firstname, String lastname, String phoneNumber, String password, String email) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.phoneNumber = phoneNumber;
		Password = password;
		Email = email;
	}




	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	
	
}
