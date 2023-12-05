public class Test {
    public static void main(String[] args) {
        Book b1 = new Book("one3","John ");
        Book b2 = new Book("wow","Katie");
        //b1.display();
        //b2.display();
        Ebook eb1 = new Ebook("War", "Rin", "rin.mob");
        //eb1.display();
        Audiobook a1 = new Audiobook("Bruh", "Cool dude", 36000);
        //a1.display();

        Library l1 = new Library();

        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(a1);
        l1.addBook(eb1);
        l1.display();

    }
}
