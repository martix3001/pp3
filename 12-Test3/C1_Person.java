public class C1_Person {
    private String name;
    private String surname;

    public C1_Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String f(){
        String n = name.substring(0,1);
        String s = surname.substring(0,1);
        n = n.toUpperCase();
        s = s.toUpperCase();
        String an = n+s;
        return an;
    }
    
}
