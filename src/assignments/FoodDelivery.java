package assignments;

import java.util.ArrayList;

public class FoodDelivery {
	
	
	
	public boolean delivery(int ph,String pwd){
		return true;
		
	}
	public boolean delivery(int ph,int otp){
		
		
		return true;
		
	}
	
	public boolean delivery(String  un,String pwd){
		return true;
		
	}
	public boolean delivery(String  un,String pwd,int otp){
		return true;
		
	}
	
	public int getResturantName(){
		System.out.println("get Resturant Name :::::" );
		return 100;
		
	}
	
	public ArrayList<String> getResturantName(String Restname){
		
		
		ArrayList<String> ResturantName=new ArrayList<String>();
		
		if(Restname.equals("greenBawarchi")){
			System.out.println("get Resturant Name :::::" );
			ResturantName.add("BIRYANI");
			ResturantName.add("STARTERS");
		
			
		}
		return ResturantName;
		
		
	}

		public ArrayList<String> getResturantName1(){
			
			
			ArrayList<String> ResturantName=new ArrayList<String>();
			
			
				ResturantName.add("Mandi");
				ResturantName.add("VegBiryani");
				ResturantName.add("100");
				
				
				
				
			
				
			
			return ResturantName;
		
	}
		
public ArrayList<String> getResturantName2(){
			
			
			ArrayList<String> ResturantName=new ArrayList<String>();
			
			
				ResturantName.add("DV MAnner");
				ResturantName.add("Meals");
				ResturantName.add("200");
				ResturantName.add("*****");
				
			
				
			
			return ResturantName;
		
	}
	
	
	
	
	 public static void main(String[] args) {
		 
		 
		 FoodDelivery fd =new FoodDelivery();
		 
		 fd.getResturantName();
		ArrayList<String>l1= fd.getResturantName("greenBawarchi");
		System.out.println(l1);
		ArrayList<String>l2=fd.getResturantName1();
		System.out.println(l2);
		
		ArrayList<String>l3=fd.getResturantName2();
		System.out.println(l3);
		
		
		 
		 
	 }
	 
	 
	 
	 }




