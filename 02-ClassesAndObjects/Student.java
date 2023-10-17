public class Student {
    String name;
    int age;
    String studentId;
    boolean isIdCardValid;
    int semester;
    double averageGrade;

    void sayHello(){
        System.out.println("hello from "+name);
    }
    void displayName(){
        System.out.println("name is "+name);
    }
    void displayAge(){
        System.out.println("age is "+age);
    }
    void displayData(){
        System.out.println(name+" is on "+semester+" semester and GP is "+averageGrade);
    }
    void changeIdStatus(){
        isIdCardValid = !isIdCardValid;
    }
    void displayStatus(){
        String valid = isIdCardValid ? "valid" : "not valid";
        System.out.println(name+"'s ID is "+studentId+" and it is "+ valid);
    }
}

    

