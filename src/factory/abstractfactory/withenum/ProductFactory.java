package factory.abstractfactory.withenum;

public class ProductFactory {

    private static int serialNumber = 0;

    public IProduct makeProduct(EnumProduct productType) {
        try {
            String serial = generateSerialNumber();

            return (IProduct) Class.forName(productType.getClassName())
                    .getConstructor(String.class)
                    .newInstance(serial);

        } catch (Exception e) {
        }

        return null;
    }

    private String generateSerialNumber() {
        return (++serialNumber) + "";
    }

}
