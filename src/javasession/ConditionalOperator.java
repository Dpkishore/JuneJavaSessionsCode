package javasession;

public class ConditionalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=20;
		int j=20;
		
		if(i>=j)
		{
			System.out.println("both are equal");
			
		}else
		{
			System.out.println("both are not equal");
		}
		if(false){
			System.out.println("selenum");
			
		}else
		{
			
		System.out.println("cypress");
		}
		boolean flag=true;
		if(flag)
		{
			System.out.println("Test the selenium");
		}else{
			System.out.println("Test the cypress");
		}
		String  browser="google";
		if(browser.equals("chrome")){
			System.out.println("launch the browser");
		}
		else if(browser.equals("firefox")){
			System.out.println("launch the browser");
		}
		else if(browser.equals("opera")){
			System.out.println("launch the browser");
		}
		else if(browser.equals("ie")){
			System.out.println("launch the browser");
		}
		else{
			System.out.println("please pass the right browser"+ browser);
		}

	}

}
