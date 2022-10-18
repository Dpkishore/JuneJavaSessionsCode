package oops_encapsulation;

public class TestEmp {

	public static void main(String[] args) {
		//Employee emp = new Employee();

	//	emp.setName("Tom");
	//	emp.setAge(26);
		//emp.setPerm(true);
		
		Employee emp=new Employee("Pavan",26,true);
		
		emp.setAge(100);
		emp.setPerm(false);
		System.out.println(emp.getName());
		
		System.out.println(emp.getAge());
			System.out.println(emp.isPerm());
		
	}

}
