import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    protected static ArrayList<Book> Books = new ArrayList<>();
    protected static ArrayList<Software> SoftwareItems = new ArrayList<>();

    public static void main(String[] args) {
        // Prompt user for input
        getItems();

        // Print list of books
        if(!Books.isEmpty()) {
            System.out.println("====================BOOKS" +
                    "====================");
            for (Book book : Books) {
                System.out.println(book.toString("detail"));
            }
        }

        // Print list of software
        if(!SoftwareItems.isEmpty()) {
            System.out.println
                    ("====================SOFTWARE" +
                            "====================");
            for (Software software : SoftwareItems) {
                System.out.println(software.toString("detail"));
            }
        }

    }

    protected static void getItems() {
        Scanner in = new Scanner(System.in);

        Product product;
        String productType = "", author = "", version = "";
        double price;

        do {
            print("Enter new book(B), software(S) or Quit(Q): ");
            productType = in.nextLine();

            switch (productType.toUpperCase()) {
                case "B":
                    product = getProductInfo();

                    print("Enter author: ");
                    author = in.nextLine();

                    Books.add(new Book(product.getCode(),
                            product.getDescription(),
                            product.getPrice(), author));

                    break;
                case "S":
                    product = getProductInfo();

                    print("Enter version: ");
                    version = in.nextLine();

                    SoftwareItems.add(new Software(product.getCode(),
                            product.getDescription(),
                            product.getPrice(),
                            version));

                    break;
                case "Q":
                    break;
                default:
                    print("You've entered an invalid product type.");
                    break;
            }
        } while(!productType.equalsIgnoreCase("Q"));
    }

    private static Product getProductInfo(){
        Scanner in = new Scanner(System.in);
        String code = "", description = "";
        double price;

        print("Enter code: ");
        code = in.nextLine();

        print("Enter description: ");
        description = in.nextLine();

        print("Enter price: ");
        price = in.nextDouble();
        in.nextLine();

        return new Product(code, description, price);
    }

    protected static void print(String message){
        System.out.printf(message);
    }
}
