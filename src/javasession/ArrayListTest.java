package javasession;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> MarksList=new ArrayList<>();
		//System.out.println(MarksList.size());
		MarksList.add(100);
		MarksList.add(300);
		MarksList.add(500);
		MarksList.add(11);
		//System.out.println(MarksList.get(2));
		MarksList.remove(2);
		MarksList.add(400);
		MarksList.add(2, 800);
		
		for(int e:MarksList){
			System.out.println(e);
			
		}
		//MarksList.add(7,1000);

		for(int i=0; i<MarksList.size(); i++) {
			System.out.println(i+ ":" + MarksList.get(i));
		}
		

	}

}
