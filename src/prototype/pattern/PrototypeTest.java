package prototype.pattern;

public class PrototypeTest {
	public static void main(String[] args) {
		try {
			
			Person person = new Person("Sanani", "03/02/1995");
			Person person1 = (Person) person.cloneObject();

			System.out.println("Without Person cloning: " + person.getPersonName());
			System.out.println("With Person cloning: " + person1.getPersonName());
			
			Product product = new Product("111111", "Beats Studio");
			Product product1 = (Product) product.cloneObject();
			
			System.out.println("Without Product cloning: " + product.getSerialNumber());
			System.out.println("With Product cloning: " + product1.getSerialNumber());
			
			product1.setSerialNumber("222222");
			System.out.println("Clonned Product serial number: " + product1.getSerialNumber());
			System.out.println("Product serial number: " + product.getSerialNumber());
			
		} catch (Exception e) {
		}

	}
}
