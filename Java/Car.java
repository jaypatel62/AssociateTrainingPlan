public class Car extends Vehicle{

	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
		System.out.println("The car brand: " + car.getMaker());
	}

}

class Vehicle{
	String maker;
	public Vehicle() {
		super();
		this.maker = "Honda";
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	void drive() {
		System.out.println("It drives smooth");
	}
}
