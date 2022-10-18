package javasession;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marksList=new ArrayList<>();
		marksList.add(100);
		marksList.add(800);
		marksList.add(2000);
		//System.out.println(marksList.get(1));
		for(int e :marksList){
			System.out.println(e);
			
		}
		ArrayList <Double> dblist=new ArrayList<>();
		dblist.add(23.00);
		dblist.add(98.90);
		//System.out.println(dblist.size());
		//System.out.println(dblist.get(1));
		
		ArrayList<String>empNameList=new ArrayList<>();
		empNameList.add("tauees");
		empNameList.add("Subba");
		empNameList.add("Naveen");
		empNameList.add("Kailesh");
		for(String e:empNameList){
		//	System.out.println(e);
			
			System.out.println("-------------------");
			
			
			ArrayList<Object> empData=new ArrayList<>();
			
			empData.add(true);
			empData.add(23.99);
			empData.add('F');
			empData.add(25);
			empData.add("naveen");
			for(Object b:empData){
				System.out.println(b);
				
				if(b.equals(true)){
					System.out.println("ko>>>>>>>>>>>>>>");
					
				}
			}
		}
	}

}
