package javasession;

public class ArrayLetarals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array Literals--Static Array
		
		int i[]={10,20,30,40};
		System.out.println(i.length);
		//System.out.println(i[4]);
		System.out.println("hi="+i.length);
		System.out.println("li="+0);
		
		for(int e:i){
			System.out.println(e);
		}
		
		//string ArrayLetarals
		
		String students[]={"Ramya", "Ravi","Peter","Tom"};
		for(String e:students){
			System.out.println(e);
		}
		//Object Array Literals
		Object empData[]={"vinay",25,25.56,true,'m'};
		for(Object e:empData){
			System.out.println(e);
		}

	}

}
