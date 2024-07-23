package encapsulation;

public class Employee {
	private String name;
	private String designation;
	private int salary;
	private int age;
	/*public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}  this is done using sorce->getters and setters->generate*/
	public void setter(String name,String designation,int salary) {
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		
	}
	public void getter() {
		System.out.println("name is: "+name);
		System.out.println("designation is: "+designation);
		System.out.println("salary is: "+salary);
	}

}
