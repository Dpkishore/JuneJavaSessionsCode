package stringmanupilation_assignment;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello java";
		String s2="hello pa";
		if(s1.equals(s2)){
			System.out.println("Strings Are Matching");
		}else{
			System.out.println("Strings are not Matching");
		}
		
		String t = "hello       world";
		System.out.println(t.replace(" ", ""));
	}

}
