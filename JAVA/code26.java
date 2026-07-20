class Book {

    String title;
    String author;
    double price;
    int quantity;

    Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    void buyBook(int copies) {
        if (copies <= quantity) {
            quantity -= copies;
            System.out.println(copies + " book purchased successfully.");
        } else {
            System.out.println("Not enough stock!");
        }
    }

    void restock(int copies) {
        quantity += copies;
        System.out.println(copies + " book added to stock.");
    }

    void displayBook() {
        System.out.println("----------------------------");
        System.out.println("Title    : " + title);
        System.out.println("Author   : " + author);
        System.out.println("Price    : " + price);
        System.out.println("Quantity : " + quantity);
    }
}

public class code26 {

    public static void main(String[] args) {

        Book b1 = new Book("Atomic Habits", "James Clear", 599, 10);
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 399, 8);
        Book b3 = new Book("Clean Code", "Robert C. Martin", 799, 5);

        b1.buyBook(3);
        b1.restock(5);

        b2.buyBook(10);   
        b2.restock(4);

        b3.buyBook(2);
        b3.buyBook(1);

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
    }
}
    

