public class Audiobook extends Book {
    private int duration;

    

    public Audiobook(String title, String author, Publisher publisher, int duration) {
        super(title, author, publisher);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void display(){
        System.out.println("Audiobook "+ getTitle()+" by "+getAuthor()+" and it last for "+duration+" minutes"+getPublisher().display());
    }
    
}
