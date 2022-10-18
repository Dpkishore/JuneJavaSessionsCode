package javasession;

public class EvenorOdd {
	
	public void evenorOdd(int n){
		
		if(n%2==0){
			//System.out.println(  +n +  "  is even number " );
		}else{
		//	System.out.println(  + n+ "  is odd number "  );
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenorOdd obj=new EvenorOdd();
		obj.evenorOdd(79);
		int large=obj.largest(189, 990, 80); 
	//	System.out.println("max number among three is :  " +large);
	int small=	obj.smallest(80, 40, 90);
	//System.out.println("min number among three is :" +small);
	obj.vote(98);

	}
	
	
//maximum and minimum of three numbers;
	public static int largest(int first,int second,int third){
		int max=first;
		if(second>max){
			max=second;
			
		}
		if(third>max){
			max=third;
			
		}
		return max;
		
	}
	
	public static int smallest(int first,int second,int third){
		int min=first;
		if(second<min){
			min=second;
			
		}
		if(third<min){
			min=third;
			
		}
		return min;
		
	}
	
	
	//eligible to vote or not-------
	
	public void  vote(int x){
		if(x>=18){
			System.out.println(" is eliginle to vote   age:"  +x);
			
		}
		else{
			System.out.println("not eligible to vote  age is: " +x);
		}
		
		
	}
	

}
