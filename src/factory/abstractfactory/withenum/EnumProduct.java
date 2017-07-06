package factory.abstractfactory.withenum;

public enum EnumProduct {

    Product_Laptop(Laptop.class.getName(), Laptop.class),
    Product_Book(Book.class.getName(), Book.class);

    private String className = "";
    private Class<?> classType = null;

    private EnumProduct(String className, Class<?> classType) {
        this.className = className;
        this.classType = classType;
    }

    public String getClassName() {
        return className;
    }

    public Class<?> getClassType() {
        return classType;
    }

}
