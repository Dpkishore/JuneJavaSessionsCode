package javasession;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListAssignment1 {

	public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add("red");
	ar.add("blue");
	ar.add("green");
	ar.add("purple");
	ar.add("brown");
	System.out.println(ar.size());
	
	
	
	//2.Write a java program insert element first to last position
	
	//ArrayList ar=new ArrayList();
	ar.add(0, "black");
	
	ar.add(ar.size(), "Pink");
	
	System.out.println(ar.get(4));
	System.out.println(ar.get(1));
	
	ar.set(2,"Magneta");
	ar.set(4, "Rose");
	
	
	
	System.out.println(ar.size());
	
	
	
	ar.remove(1);
	
	boolean ans=ar.contains("brown");
	if(ar.contains("yellow")){
		System.out.println("Brown is there");
	}else{
		System.out.println("Brown is not there");
	}
	
	//System.out.println("--------------");
	
Collections.reverse(ar);
System.out.println("--------------");
ar.trimToSize();
System.out.println(ar);
	
	for(int count=0;count<ar.size();count++){
		System.out.println(ar.get(count));
		
		
				
	}
	
	System.out.println("-------------- last");
	
	 java.util.List list = ar.subList(0, 5) ;
	System.out.println(list);
	
	String Players[]={"Dhoni","virat","pant","pandya","bhuvi","bumra"};
	ArrayList <String> pr = new ArrayList<String>(Arrays.asList(Players));
	for(int i=0;i<5;i++){
		System.out.println(pr.get(i));
	}
	int a=4;
	int b=8;
	int c=a+b;
	a=b;
	b=c-a;
	System.out.println(c);
	}
	

}
