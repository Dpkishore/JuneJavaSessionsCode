package oops_abstract;

public class PageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginPage lp=new LoginPage(10);
		lp.displayLogo();
		lp.doLogin("pavankishor@gmail.com",   " naveen123");
		lp.title();
		
		Page p=new LoginPage();
		p.displayLogo();
		p.title();
		p.url();
		p.timeOut();

	}

}
