package javasession;

public class ArrayAssignment3 {

	public static void main(String[] args) {
		String emp[]=new String[1];
		emp[0]="Rahem";
		int empage[]=new int[1];
		empage[0]=26;
		String empteam[]=new String[1];
		empteam[0]="viking";
		
		int empdob[]=new int[1];
		empdob[0]=1993;
		boolean gender[]=new boolean[1];
		gender[0]="M"!=null;
		double str[]=new double[1];
		str[0]=123.67;
		System.out.println("NAME :"  +emp[0]);
		System.out.println("Age :"+empage[0]);
				
		System.out.println("empteam :"  +empteam[0]);
		System.out.println("empdob :"  +empdob[0]);
		System.out.println("gender :"  +gender[0]);
		System.out.println("str :"  +str[0]);
		
		Object Player1[]=new Object[6];
		Player1[0]="Tom";
		Player1[1]=26;
		Player1[2]="Eagles";
		Player1[3]=1996;
		Player1[4]="M";
		Player1[5]=126.89;
		
		for(Object e:Player1){
			System.out.println(e);
			
		}
		
		System.out.println("--------------------");
		Object Player2[]=new Object[6];
		Player2[0]="John";
		Player2[1]=28;
		Player2[2]="Packers";
		Player2[3]=1990;
		Player2[4]="MALE";
		Player2[5]=196.89;
		for(int count=0;count<Player2.length;count++){
			System.out.println(Player2[count]);
			
		}
		
		System.out.println("--------------------");
		
		
	 Object Player3[] =new Object[6];
	 Player3[0] = "Hudson";
 Player3[1] = 19;
		 Player3[2] = "GreenBay";
		Player3[3] = 2000;
		 Player3[4] = "Male";
		 Player3[5] = 123.68;
		 for(Object e:Player3){
			 System.out.println(e);
		 }
	}

}
