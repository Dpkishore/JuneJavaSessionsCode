package InterviewAssignments;

public class Forloop {

	public static void main(String[] args) {
		/*for(int i=1;i<=10;i++){
			System.out.println(i);
		}*/
		
		int rows,Numberofstars;
		
		for(rows=1;rows<=10;rows++){
			
			for(Numberofstars=1;Numberofstars<=rows;Numberofstars++){
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
