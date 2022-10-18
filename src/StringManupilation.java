
public class StringManupilation {

	public static void main(String[] args) {
		
		
		String str="This is my java code";
		System.out.println(str.length());
		System.out.println(str.charAt(8));
		System.out.println(str.length()-1);
		//System.out.println(str.charAt(-1));
		System.out.println(str.indexOf('m'));
		
		System.out.println(str.indexOf('c'));
		System.out.println(str.indexOf('i', str.indexOf('i')+1)); 
		System.out.println(str.indexOf("java"));
		
		System.out.println(str.indexOf("ruby"));
		
		String msg="Welcome admin";
		if(msg.indexOf("hi")>0){
			System.out.println("correct");
			
			
		}else{
			System.out.println("In coret");
		}
		
		String s="  hello   world";
		System.out.println(s.trim());
		
		String t="  name is admin";
		
		
		String Browser="   Chrome  ";
		if(Browser.trim().equals("Chrome")){
			System.out.println(Browser);
		}
		String data= "hello    world";
		System.out.println(data.replace("",""));
		
		
		String dob = "01-01-1990";
		System.out.println(dob.replace("-","/"));
		
		String h="hi this is my java code and iam happy";
		System.out.println(h.toUpperCase());
		System.out.println(h.toLowerCase());
		
		String m1="chrome";
		String m2="chrome";
		System.out.println(m1.equals(m2));
		
		String main = "welcome to     testing     world testing naveen testing";
		System.out.println(main.contains("testing"));
		
		System.out.println(main.replaceAll("\\s+", " "));
		System.out.println(main.replaceAll("testing", "java"));
		
	}

}
