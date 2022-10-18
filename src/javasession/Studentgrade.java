package javasession;

public class Studentgrade {
	
	
	public static void studGrade(int marks){
		
		if(marks<=100 && marks>=91){
			System.out.println("grade is : AA");
		}
		else if(marks<=90 && marks>=81){
			System.out.println("grade is : AB");
		}
		else if(marks<=80 && marks>=71){
			System.out.println("grade is : BB");
		}
		else if(marks<=70 && marks>=61){
			System.out.println("grade is : BC");
		}
		else if(marks<=60 && marks>=51){
			System.out.println("grade is : CD");
		}
		else if(marks<=50 && marks>=41){
			System.out.println("grade is : DD");
		}
		else if(marks<=40){
			System.out.println("FAIL");
			
		}else{
			System.out.println("Invalid");
		}
		
	}

	public static void main(String[] args) {
		Studentgrade sg=new Studentgrade();
		
		sg.studGrade(123);
		

	}

}
