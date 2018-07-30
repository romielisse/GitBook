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

    public String toString(String string){
        switch(string.toLowerCase()){
            case "detail":
                return super.toString() + "Author: " + author + "\n";
            case "simple":
                return super.toString();
            default:
                return "Invalid string parameter";
        }
    }
}
