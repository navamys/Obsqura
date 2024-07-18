package aggregation;

public class Student {
	String name;
	int rollnumber;
	Address addr; //reference variable for aggregation
	public Student(String name,int rollnumber,Address addr) {
		this.name=name;
		this.rollnumber=rollnumber;
		this.addr=addr;
		
	}
	public void display() {
		System.out.println("Name is: "+name);
		System.out.println("Roll number is: "+rollnumber);
		System.out.println("Housename is: "+addr.housename);
		System.out.println("housenumber is: "+addr.housenumber);
		System.out.println("pincode is: "+addr.pincode);
		System.out.println("city is: "+addr.city);
	}

	public static void main(String[] args) {
		Address obj1=new Address("Veedu","Trivandrum",345678,123);
		Student obj2=new Student("Navamy",25,obj1);
		obj2.display();
		
		

	}

}
