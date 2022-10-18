package javasession;

public class Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Browser br=new Browser();
		boolean flag=br.lunchBrowser("Opera");
		System.out.println(flag);
		
		if(flag){
			System.out.println("www.amazon.com");
		}

	}

	private boolean lunchBrowser(String brName) {
		// TODO Auto-generated method stub
		System.out.println("lunch Browser   " +brName);
		
		switch (brName) {
		case "Chrome":
			System.out.println("Chrome is launched");
			return true;
			
		case "Firefox":
			System.out.println("Firefox is launched");
			return true;
			
		case "Opera":
			System.out.println("Opera is launched");
			return true;

		default:
			
			System.out.println("plz pass the right browser...." + brName);
			return false;
			
		}
		
	}

	

}
