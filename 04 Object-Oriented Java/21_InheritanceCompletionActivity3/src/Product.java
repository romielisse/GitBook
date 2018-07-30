import java.text.NumberFormat;

public abstract class Product {
    private String code;
    private String description;
    private double price;
    protected static int count = 0; //a protected static variable

    public Product(){

    }

    public Product(String code, String description, double price) {
        this.code = code;
        this.description = description;
        this.price = price;
    }

    // get and set accessors for the code, description
    // and the price instance variables
    @Override
    public String toString(){
        return "Code: " + code + "\n" +
                "Description: " + description + "\n" +
                "Price: " + this.getFormattedPrice() + "\n";
    }

    public String getFormattedPrice(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    // create public access for the count variable
    public static void setCount(int count) {
        Product.count = count;
    }

    public String getClassName(){
        return "Product";
    }

}
