package inheritance;

public class Car extends Vehicle {
	public void drive() {
		System.out.println("Driving a car");
	}


	public static void main(String[] args) {
		Car obj2=new Car();
		obj2.road();
		obj2.drive();
		Bike obj3=new Bike();
		obj3.ride();
		System.out.println(obj2.v);
		System.out.println(obj3.b);
	
	}

}
