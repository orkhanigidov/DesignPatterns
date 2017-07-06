package factory.abstractfactory.withenum;

public class Client {

    public void clienDointJob() {
        try {
            IProduct product;

            product = new ProductFactory().makeProduct(EnumProduct.Product_Laptop);
            System.out.println("Product name: " + product.getProductName());
            System.out.println("Serial Number: " + product.getProductSerialNumber());

            product = new ProductFactory().makeProduct(EnumProduct.Product_Book);
            System.out.println("Product name: " + product.getProductName());
            System.out.println("Serial Number: " + product.getProductSerialNumber());

        } catch (Exception e) {
        }
    }

}
