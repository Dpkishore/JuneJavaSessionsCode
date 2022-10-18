package exceptionHandling;

public class FinallyBlock {
	
	
	public static int getMarks(String stName){
		System.out.println("StudentNmae" +stName);
		
		
		if(stName.equals("Tom")){
			try{
				int i=9/0;
				System.exit(0);
				System.out.println("Hello:::");
				
			}
			catch(Exception e){
				System.out.println("AE coming");
				e.printStackTrace();
				return 50;
				
			}
			finally{
				System.out.println("iam in finally block");
				return 10;
				
			}
			
			
		}
		
		else if(stName.equals("peter")){
			return 98;
		}
		
		else if(stName.equals("Rockesh")){
			return 91;
		}
		
		else {
			System.out.println("st name is not found...");
			return -1;
		}
		
		
	}

	public static void main(String[] args) {
		
		
		//getMarks("Rockesh");
		int m=getMarks("Tom");
		System.out.println(m);
		

	}

}
