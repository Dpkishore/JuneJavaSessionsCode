package oops_abstract;

public abstract class Page {
	
	public Page(){
		System.out.println("page ..default...const....");
	}
	public void page(int i){
		System.out.println("Login page"+i);
		
	}
	
	
	public abstract void title();
	
	public abstract void url();
	
	public void timeOut(){
		System.out.println("Time out 20 sec-----");
	}
	public void displayLogo(){
		System.out.println("page display Logo");
	}

}
