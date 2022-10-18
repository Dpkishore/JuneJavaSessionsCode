package javasession;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//post increment:
		int i=50;
		int j=i++;
		System.out.println(i);
		System.out.println(j);
		int k =-56;
		int l=k++;
		System.out.println(k);
		int m=0;
		int n =m++;
		System.out.println(n);
		
		//pre increment:
		int i1=67;
		int i2=++i1;
		System.out.println(i1);
		System.out.println(i2);
		
		int i3=-90;
		int i4=++i3;
		System.out.println(i4);
		
		//pre decrement:
		int i5=-99;
		int i6=--i5;
		System.out.println(i6);
		
		int bal=100;
		int totalBal=bal+++10;
		System.out.println(totalBal);
		System.out.println(bal);
		int gooogle=-1000;
		
		System.out.println(--gooogle);
		System.out.println(gooogle);
		System.out.println(gooogle--);
		
		int le = 2;
		int re =-le++;//1z
		int te = --le+le++-le--;//2
		System.out.println(re);
		System.out.println(te);
		int z=5;
		int y=z+++z+++z++;
		
		System.out.println(y);

	}

}
