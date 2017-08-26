package prototype.pattern;

public class Product implements IPrototype {
	
	private String serialNumber;
	private String productName;
	
	public Product() {
	}
	
	public Product(String serialNumber, String productName) {
		super();
		this.serialNumber = serialNumber;
		this.productName = productName;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public IPrototype cloneObject() throws CloneNotSupportedException {
		return (Product) super.clone();
	}
	
}
