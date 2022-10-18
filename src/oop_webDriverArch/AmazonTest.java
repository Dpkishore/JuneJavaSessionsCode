package oop_webDriverArch;

public class AmazonTest {
static	WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String browser = "ie";

		switch (browser) {
		case "chrome":
			driver=new ChromeBrowser();

			break;
			
		
			case "Firefox":
				driver=new FirefoxBrowser();

				break;
			case "Safari":
				driver=new SafariBrowsr();

				break;

		default:
			
			System.out.println("plz pass the right browser:::" + browser);
			break;
		}
		driver.get("https://www.amazon.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.SendKeys("Emailid", "dasipavankishor@gmail.com");
		driver.SendKeys("Password", "pavan@123");
		driver.close();

	}

}
