<!--djw:done-->
###Inheritance completion activity #1
Make the following application work. Then create a method that outputs the name 
of the current class to the console.

####Product.java
{%ace edit=true, lang='java'%}
import java.text.NumberFormat;

public class Product
{
    private String code;
    private String description;
    private double price;
    protected static int count = 0;   // a protected 
                                      // static variable

    public Product()
    {
        code = "";
        description = "";
        price = 0;
    }
    // get and set accessors for the code, description, 
    // and price instance variables
    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice() + "\n";
    }

    private String getFormattedPrice() {
		
		
	}
	// create public access for the count variable
    public static int getCount()   
    {                              
        return count;
    }
}
{%endace%} 

####Book.java
{%ace edit=true, lang='java'%}
public class Book extends Product {
    private String author;
    private int pages;

}
{%endace%} 

####Software.java
{%ace edit=true, lang='java'%}
public class Software extends Product {
    private String programmer;
    private String platform; //linux, mac, or pc
    private String os; 
}
{%endace%}