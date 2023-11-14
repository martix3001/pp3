public class Stringfun {
    public String text;

    void displayNine(){
        System.out.println("9 character are "+text.substring(0,9));
    }
    void displayLenght(){
        System.out.println(text.length());
    }
    void ifDay(){
        if(text.endsWith("day!")){ //if(text.contains("day!")
            System.out.println("true");
        }
    }
    void ifEmpty(){
        if(text.length() > 0){
            System.out.println("text not empty");
        }else{
            System.out.println("text empty");
        }
    }
    void lastIndex(){
        System.out.println(text.lastIndexOf('e'));
    }
    void replacing(){
        System.out.println(text.replace(" ", "_"));
    }
    void converting(){
        System.out.println(text.toUpperCase());
    }
    public static void main(String[] args) {
        Stringfun s = new Stringfun();
        Stringfun s2 = new Stringfun();
        s.text = "Have a nice day!";
        s2.text = "";
        s2.ifEmpty();
        s.displayLenght();
        s.displayNine();
        s.ifDay();
        s.ifEmpty();
        s.text.isEmpty();
        s.lastIndex();
        s.replacing();
        s.converting();

    }

}
