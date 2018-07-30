<!--djw:done but not feeling good about using books and software (lacks 
originality)-->
####Inheritance completion activity
What follows is a generic product superclass and two subclasses. The code for 
the subclasses is not complete. The constructors of the subclasses should set 
the default values of the objects attributes and increase the product count. 
The default values should be those values that would be set when a new instance 
of your class is created.

####Product Class
{%ace edit=true, lang='java'%}
import java.text.NumberFormat;

public class Product
{
    private String code;
    private String description;
    private double price;
    protected static int count = 0;

    public Product() {}

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }
    public String getFormattedPrice()
    {
        NumberFormat currency = 
            NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    @Override
    public String toString()
    {
        return "Code:        " + code + "\n" +
               "Description: " + description + "\n" +
               "Price:       " + this.getFormattedPrice() + 
               "\n";
    }

    public static int getCount()
    {
        return count;
    }
}
{%endace%}

####Book Subclass
{%ace edit=true, lang='java'%}
public class Book extends Product
{
    private String author;

    public Book()
    {
        count++;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Author:      " +
            author + "\n";
    }
}
{%endace%}

####Software Subclass
{%ace edit=true, lang='java'%}
public class Software extends Product
{
    private String version;

    public Software()
    {
        super();
    }

    public String getVersion()
    {
        return version;
    }

    @Override
    public String toString()
    {
        return super.toString() + "Version:     " +
            version + "\n";
    }
}
{%endace%}