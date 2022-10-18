package javasession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment2 {

	

	public static void main(String[] args) {
		
ArrayList<String> StudentName=new ArrayList<String>();
StudentName.add("pavan");
StudentName.add("satwik");
StudentName.add("kalyan");

for(int i=StudentName.size()-1;i>=0;i--){
	//System.out.println(StudentName.get(i));
	
	
	
}
     Collections.reverse(StudentName);
     System.out.println(StudentName);
     
     

	}

}
