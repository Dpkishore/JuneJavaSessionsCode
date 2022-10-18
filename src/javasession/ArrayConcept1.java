package javasession;

public class ArrayConcept1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int i[]=new int[2];
//		i[0]=10;
//		i[1]=-20;
//		//i[2]=30;
//		System.out.println(i[1]);
//		
//		int a[]={10,20,30,40};
//	
//for(int e:a){
//	System.out.println(e);
//}
	int i[]=new int[3];
	i[0]=10;
	i[1]=20;
	i[2]=30;
	for(int k=0;k<i.length;k++){
	//	System.out.println(i[k]);	
		
	}
	
	for(int e:i){
		System.out.println(e);
	}
	double d[]=new double[3];
	d[0]=12.33;
	d[1]=89.98;
	d[2]=33.89;
	for(double e :d)
	System.out.println(e);
	
	char c[]=new char[3];
	c[0]='a';
	c[1]='b';
	c[2]='$';
	
	for(char e:c){
		System.out.println(e);
	}
		
	}

}
