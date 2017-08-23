package builder.pattern.two;

public class Motorcycle implements IBuilder {

	private Product product = new Product();
	
	@Override
	public void buildBody() {
		product.add("Motor Body part");
	}

	@Override
	public void insertWheels() {
		product.add("Motor Wheels");
	}

	@Override
	public void addHeadLights() {
		product.add("Motor Head Ligths");
	}

	@Override
	public Product getVehicle() {
		return product;
	}

}
