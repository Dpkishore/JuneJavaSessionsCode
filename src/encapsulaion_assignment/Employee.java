package encapsulaion_assignment;

public class Employee {
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	private String gender;
	
	public Employee(String name,int age,double salary,boolean isActive,String gender){
		
		
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.isActive=isActive;
		this.gender=gender;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
