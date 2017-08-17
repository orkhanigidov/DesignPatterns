package factory.pattern;

public class ProductFactory {

    private static int serialNumber = 0;

    public IProduct makeProduct(String prodcucType) {

        if (prodcucType.equalsIgnoreCase("laptop")) {
            String serial = generateSerialNumber();
            return new Laptop(serial);
        } else if (prodcucType.equalsIgnoreCase("Book")) {
            String serial = generateSerialNumber();
            return new Book(serial);
        } else {
            throw new IllegalArgumentException("There is not this product");
        }

    }

    private String generateSerialNumber() {
        return (++serialNumber) + "";
    }

}
