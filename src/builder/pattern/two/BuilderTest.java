package builder.pattern.two;

public class BuilderTest {
	public static void main(String[] args) {
		
		Director director = new Director();
		
		IBuilder car = new Car();
		IBuilder motor = new Motorcycle();
		
		director.construct(car);
		director.construct(motor);
		
		Product product1 = car.getVehicle();
		Product product2 = motor.getVehicle();
		
		product1.show();
		product2.show();
		
	}
}
