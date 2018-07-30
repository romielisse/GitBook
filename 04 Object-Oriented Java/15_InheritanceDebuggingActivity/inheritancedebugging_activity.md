<!--djw:done-->
###Inheritance debugging activity
The following Product superclass provides features that are needed to be 
inherited by a Book class. It doesn't work. Fix it.

{%ace edit=true, lang='java'%}
import java.text.NumberFormat;

public class Product
{
    private String code;
    private String description;
    private double price;
    protected static int count = 0;   // a protected 
                                      // static variable

    public Products()
    {
        code = "";
        description = "";
        price = 0;
    }
    // get and set accessors for the code, description, 
    // and price instance variables
    @Overrides
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " +
               this.getFormattedPrice() + "\n";
    }

    // create public access for the count variable
    public statics int getCount()   
    {                              
        return counts;
    }
}
{%endace%}