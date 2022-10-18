package encapsulaion_assignment;

public class EmployeeTeat {

	public static void main(String[] args) {
		
		Employee e=new Employee("pavan",29,34000,true,"male");
		System.out.println(e.getName());
		System.out.println(e.getAge());
		e.setAge(78);
		System.out.println(e.getAge());
		

	}

}
