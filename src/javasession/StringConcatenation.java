package javasession;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		double d1=12.33;
		double d2=12.44;
		
		
		char c1='a';
		char c2='b';
		System.out.println(a+b);
		
		String x="hello";
		String y="world";
		System.out.println(x+y);
		System.out.println(a+y);
		System.out.println(a+x);
		System.out.println(x+a);
		System.out.println(x+y+a+b);
		System.out.println(a+b+x+y);
		System.out.println(x+y+(a+b));
		System.out.println("the value of a:"  +a);
		System.out.println("the sum is :" +  (x+y));
		
		System.out.println(a+b+x+y+(a+b));
		System.out.println(x+y+a+b+x+y);
		System.out.println(x+y+d1+d2);
		System.out.println(x+y+(d1+d2));
		System.out.println(x+c1);
		System.out.println(x+(c1+c2));
		System.out.println(x+y+c1+c2);
		System.out.println(100 / 2 + "hello");
		System.out.println(9 % 3);
		
		System.out.println(100.2/0);//Infinity
		System.out.println(0.0/0);//Infinity
		
		
		

	}

}
