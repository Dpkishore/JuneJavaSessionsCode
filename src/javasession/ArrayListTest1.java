package javasession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(100);
		ar.add(1);
		ar.add(20);
		ar.add(19);
		
		Collections.sort(ar);
		System.out.println(ar);
		System.out.println("min value :" +ar.get(1));
		System.out.println("Max value :" +ar.get(ar.size()-1));
		//Collections.sort(ar,Collections.reverseOrder());
		System.out.println(ar);
		ArrayList<Integer> ar1=new ArrayList<>();
		
		ar1.add(2);
		ar1.add(13);
		ar1.add(220);
		ar1.add(119);
		
		ar1.addAll(ar);
		//ar.addAll(ar1);
		System.out.println(ar1);
		ArrayList<String> Names=new ArrayList<>();
		Names.add("Tom");
		Names.add("peter");
		Names.add("Lisa");
		Names.add("Ravi");
		
		System.out.println(Names);
		//Collections.sort(Names);
		
		Collections.sort(Names,Collections.reverseOrder());
		System.out.println(Names);
		Collections.swap(Names, 1, 2);
		System.out.println(Names);
		
		int Arr[]={1,2,3,4,11};
		System.out.println(Arr);
		System.out.println(Arrays.toString(Arr));
		
		ArrayList<String> emp=new ArrayList<>();
		emp.add("Rohit");
		emp.add("Kalyan");
		emp.add("wipron");
		emp.add("Mohit");
		
	
		Collections.sort(emp,Collections.reverseOrder());
		System.out.println(emp);
		//emp.clear();
		System.out.println(emp);
		
		if(emp.contains("Naveen")){
			System.out.println("Peter is present");
		}
		
		

	}

}
