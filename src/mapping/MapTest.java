package mapping;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map=new HashMap<Integer, String>();
		map.put(100, "Tom");
		map.put(200, "Peter");
		map.put(300, "Naveen");
		map.put(400, "Ravi");
		map.put(300, "Rakesh");
		map.put(500, null);
		map.put(null,"SElenium");
		System.out.println(map.get(100));
		System.out.println(map.get(300));
		System.out.println(map.get(null));
		
		HashMap<String, String> empMap=new HashMap<String, String>();
		//Map<String, String> empMap=new LinkedHashMap<String, String>();
		//Map<String, String> empMap=new TreeMap<String, String>();
		empMap.put("IBM", "Tom");
		empMap.put("GooGle", "Naveen");
		empMap.put("CTS", "Ravi");
		empMap.put("HCL", "Praveen");
		empMap.put("Infosis", "Ali");
		empMap.put("MS", "Pavan");
		System.out.println(empMap.get("IBM"));
		empMap.forEach((k,v) -> System.out.println(k+  ":"+v));
	}

}
