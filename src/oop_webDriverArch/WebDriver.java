package oop_webDriverArch;

public interface WebDriver {
	
	
	
	
	public void get(String url);
	
	public String getTitle();
	
	public void click(String element);
	
	public void SendKeys(String element, String value);
	
	
	public void close();

}
