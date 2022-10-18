package strings;

public class Callbyreference {
	String name;
	int age;
	
	public void getInfo(Callbyreference t1){
		
		t1.name="Nithin";
		t1.age=32;
		sendMail(t1);
		
	}

	public void sendMail(Callbyreference t2) {
		t2.name="peter";
		t2.age=23;
		
		
	}
	public void getInfo(String nameValue){
		System.out.println(nameValue);
		
	}

	public static void main(String[] args) {
		Callbyreference cr=new Callbyreference();
		cr.name="pavan";
		cr.age=30;
		System.out.println(cr.name+   "   "  +cr.age);
		
		cr.getInfo(cr);
		cr.getInfo(cr.name);

	}

}
