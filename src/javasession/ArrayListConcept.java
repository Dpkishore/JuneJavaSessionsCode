package javasession;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(500);
		ar.add(400);
		System.out.println(ar.get(3));
		for(int i=0;i<ar.size();i++){
			System.out.println(ar.get(i));
		}

	}

}
