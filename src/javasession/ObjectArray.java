package javasession;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object emp[]=new Object[5];
		emp[0]="TOM";
		emp[1]=25;
		emp[2]=13.33;
		emp[3]='m';
		emp[4]=true;
		//System.out.println(emp[0]);
		for(int k=0;k<emp.length;k++){
			//System.out.println(emp[k]);
		}
		for(Object e:emp){
		System.out.println(e);
			if(e.equals("TOM"))
			{
				System.out.println("hi......");
			break;
			}
			
		}

	}

}
