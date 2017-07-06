package factory.withenum;

import java.util.Date;

public class Book implements IProduct {

    private String bookName = "Introduction to Machine Learning";
    private String serialNumber = "";
    private Date prodcutionDate = null;

    public Book(String serialNumber) {
        this.serialNumber = serialNumber;
        prodcutionDate = new Date();
    }

    @Override
    public String getProductName() {
        return bookName;
    }

    @Override
    public String getProductSerialNumber() {
        return serialNumber;
    }

    @Override
    public Date getProductionDate() {
        return prodcutionDate;
    }

}
