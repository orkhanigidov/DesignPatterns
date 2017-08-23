package builder.pattern.two;

public class Car implements IBuilder {

	private Product product = new Product();
	
	@Override
	public void buildBody() {
		product.add("Car Body part");
	}

	@Override
	public void insertWheels() {
		product.add("Car Wheels");
	}

	@Override
	public void addHeadLights() {
		System.out.println("Car Head Lights");
	}

	@Override
	public Product getVehicle() {
		return product;
	}

}
