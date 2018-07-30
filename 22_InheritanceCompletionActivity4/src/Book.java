public final class Book extends Product {
    private String author;
    private int pages;

    public Book(){
        setCount(getCount()+1);
    }

    public Book(String author) {
        this.author = author;
        setCount(getCount()+1);
    }

    public Book(String code, String description, double price, String author,
                int pages) {
        super(code, description, price);
        this.author = author;
        this.pages = pages;
        setCount(getCount()+1);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString(){
        return super.toString() + "Author: " + author + "\n";
    }

    public String getClassName(){
        return "Book";
    }
}
