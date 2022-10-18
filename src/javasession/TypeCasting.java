package javasession;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b=2;
		short s=b;
		int i=b;
		long l=b;
		System.out.println(b);
		System.out.println(s);
		int p=100;
		short s1=(short)p;
		byte b1=(byte)p;
		System.out.println(s1);
		System.out.println(b1);
		
		byte m =10;
		byte n =70;
		int t=m+n;
		byte t1 =(byte)(m+n);
		System.out.println(t1);
		char c1=23;
		char c2=78;
		char c3=(char)(c1+c2);
		System.out.println(c3);

	}

}
