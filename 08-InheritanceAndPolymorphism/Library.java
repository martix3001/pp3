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
    public void getBook(int i){
        (shelf.get(i)).display();
    }

    public ArrayList<Book> getShelf() {
        return shelf;
    }

    public void setShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }
    
}
