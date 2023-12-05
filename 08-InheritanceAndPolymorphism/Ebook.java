public class Ebook extends Book {
    private String filename;

    public Ebook(String title, String author, Publisher publisher, String filename) {
        super(title, author, publisher);
        this.filename = filename;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
    public void display(){
        System.out.println("Ebook "+ getTitle()+" by "+getAuthor()+" and is story under the name "+filename+getPublisher().display());
    }

}
