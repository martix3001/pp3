public class Test {
    public static void main(String[] args) {
        Publisher p1 = new Publisher("Great Words", "Cracow");
        Publisher p2 = new Publisher("UEK ", "Waaaardaw");


        Book b1 = new Book("one3","John",p1);
        Book b2 = new Book("wow","Katie",p1);
        //b1.display();
        //b2.display();
        Ebook eb1 = new Ebook("War", "Rin",p1, "rin.mob");
        //eb1.display();
        Audiobook a1 = new Audiobook("Bruh", "Cool dude",p2, 36000);
        //a1.display();

        Library l1 = new Library();

        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(a1);
        l1.addBook(eb1);
        l1.display();
        l1.getBook(0);

    }
}
