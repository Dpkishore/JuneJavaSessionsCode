package stringsConcept;

public class StringCompare {

	public static void main(String[] args) {
		String t1="java";
		String t2="java";
		System.out.println(t1==t2);
		String t3=new String("java");
		String t4=new String("java");
		
		
		System.out.println(t1==t3);
		
		System.out.println(t3.equals(t4));
		
		System.out.println(t1.equals(t2));
	}

}
