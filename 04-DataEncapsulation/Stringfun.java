public class Stringfun {
    public String text;

    void displaynine(){
        System.out.println(text.substring(0,9));
    }
    public static void main(String[] args) {
        Stringfun s = new Stringfun();
        s.text = "Have a nice day";
        s.displaynine();
    }
}
