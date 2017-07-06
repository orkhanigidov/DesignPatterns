package factory.simple;

public class Client {

    public void clienDointJob() {
        try {
            IProduct product;

            product = new ProductFactory().makeProduct("laptop");
            System.out.println("Product name: " + product.getProductName());
            System.out.println("Serial Number: " + product.getProductSerialNumber());

            product = new ProductFactory().makeProduct("book");
            System.out.println("Product name: " + product.getProductName());
            System.out.println("Serial Number: " + product.getProductSerialNumber());

        } catch (Exception e) {
        }
    }

}
