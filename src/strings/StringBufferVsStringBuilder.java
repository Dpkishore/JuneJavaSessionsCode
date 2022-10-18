package strings;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello");
		sb.append("selenium");
		System.out.println(sb);
	
		System.out.println(sb.reverse());
		
		StringBuffer sb1=new StringBuffer("hello");
		sb1.append("testing");
		System.out.println(sb1);
		
		String x="hello";
		x.concat("world");
		System.out.println(x);
		
	}

}
