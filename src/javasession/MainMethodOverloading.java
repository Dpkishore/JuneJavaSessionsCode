package javasession;

public class MainMethodOverloading {

	public static void main(String[]args)	{
		
		//System.out.println(a.length);
		
		//System.out.println(a[0]);
		System.out.println("hi------iam");
		
		MainMethodOverloading.main(10);
		MainMethodOverloading.main();

	}
	
	public static void main() {

		System.out.println("bye....");

	}
	public static void main(int i) {

		System.out.println("pop...."+i);

	}

}
