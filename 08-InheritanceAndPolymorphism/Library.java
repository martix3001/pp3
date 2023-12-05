import java.util.ArrayList;

public class Library {
    private ArrayList<Book> shelf = new ArrayList<Book>(); 

    public void display(){
        System.out.println("List of products: " );
        for (Book product : shelf){
            product.display();
        }
    }

    public void addBook(Book book){
        shelf.add(book);
    }

    
}
