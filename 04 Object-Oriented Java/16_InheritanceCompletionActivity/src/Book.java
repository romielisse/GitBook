public class Book extends Product {
    private String author;

    public Book(){
        setCount(getCount()+1);
    }

    public Book(String author) {
        this.author = author;
        setCount(getCount()+1);
    }

    public Book(String code, String description, double price, String author) {
        super(code, description, price);
        this.author = author;
        setCount(getCount()+1);
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString(){
        return super.toString() + "Author: " + author + "\n";
    }
}
