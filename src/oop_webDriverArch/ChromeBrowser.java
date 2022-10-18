package oop_webDriverArch;

public class ChromeBrowser implements WebDriver {
	
	public ChromeBrowser(){
		System.out.println("Launch Browser-----");
	}

	@Override
	public void get(String url) {
		// TODO Auto-generated method stub
		System.out.println("Launch Browser" +url);
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return "amazon";
	}

	@Override
	public void click(String element) {
		// TODO Auto-generated method stub
		System.out.println("clickOn" +element);
		
		
	}

	@Override
	public void SendKeys(String element, String value) {
		// TODO Auto-generated method stub
		System.out.println("enter element " +value);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Close Browser" );
		
	}

}
