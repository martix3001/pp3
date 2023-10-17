public class Book {
    String name;
    String relaseDate;
    String author;
    int numerOfPages;
    boolean isBestSeller;

    void becomeBestSeller(){
        isBestSeller = true;
    }
    void displayBookInfo(){
        System.out.println(name+" relased in "+relaseDate+" has "+numerOfPages+" pages and is it a bestseller ? "+isBestSeller);
    }


    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        book1.name = "how to live part1";
        book1.relaseDate = "2004";
        book1.author = "Andrea Bocceli";
        book1.numerOfPages = 5565;
        book1.isBestSeller = true;

        book2.name = "How to live ... more? - part2";
        book2.relaseDate = "2008";
        book2.author = "Andrea Bocceli";
        book2.numerOfPages = 10565;
        book2.isBestSeller = false;

        book1.displayBookInfo();
        book2.displayBookInfo();
        book2.becomeBestSeller();
        book2.displayBookInfo();
    }
}
