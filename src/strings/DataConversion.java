package strings;

import java.util.Arrays;

public class DataConversion {

	public static void main(String[] args) {
	String x="100";
	System.out.println(x+20);
	
	
	int i=Integer.parseInt(x);
	System.out.println(i+20);
	
	String y="100A";
	System.out.println(y+20);
	//int j=Integer.parseInt(y);
//	System.out.println(y);
	String s="12.89";
	System.out.println(s+20);
	
	Double d=Double.parseDouble(s);
	System.out.println(d+20);
	
	int pop=100;
	System.out.println(pop+20);
	
	
	int totalBill = pop + 50 - 10;
	System.out.println(totalBill);
	
	
	String amount=String.valueOf(totalBill);
	System.out.println(amount+10);
	
	
	double Avg=12.66;
	String newavg=String.valueOf(Avg);
	System.out.println(newavg+200);
	
	String headless="true";
	
	boolean flag=Boolean.parseBoolean(headless);
	if(flag){
		System.out.println("run in headless Mode");
	}else{
		System.out.println("run in normal mode");
	}
	
	boolean test =true;
	String p=String.valueOf(test);
	System.out.println(p+20);
	
	
	String top = "java_python_ruby_dotnet";
	
	String arr[]=top.split("_");
	System.out.println(arr[0]);
	String foo = "xXtestingXxXseleniumxXXautomationXxXjava";
	
	String f[] = foo.split("xX");
	System.out.println(f[3]);
	
	String s1="HelloJavaAutomationJavaTesting";
	String l[] = s1.split("Java");
	
	System.out.println(Arrays.toString(l));
	String empData=" Helo everything is fine some of the pronblem coming";
	String data[]=empData.split("  ");
	System.out.println(data);
	
	for(String e:data){
		System.out.println(e);
		
	}
	
	String lg = "hello selenium java";
	String lk[] = lg.split("\\s+");
	System.out.println(Arrays.toString(lk));
	
	
	char c[]={'t','e','s','t'};
	String sc = new String(c);
	System.out.println(sc);
	
	System.out.println(String.valueOf(c));

	}

}
