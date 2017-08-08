package factory.simple;

import java.util.Date;

public class Laptop implements IProduct {

    private String laptopName = "Sony Vaio";
    private String serialNumber = "";
    private Date productionDate = null;

    public Laptop(String serialNumber) {
        this.serialNumber = serialNumber;
        productionDate = new Date();
    }

    @Override
    public String getProductName() {
        return laptopName;
    }

    @Override
    public String getProductSerialNumber() {
        return serialNumber;
    }

    @Override
    public Date getProductionDate() {
        return productionDate;
    }

}
