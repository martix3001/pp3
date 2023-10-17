public class StudentTest {
    public static void main(String[] args){
        Student s = new Student();

        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);

        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Alex";
        s2.name = "Max";
        s1.age = 20;
        s2.age = 30;

        s1.averageGrade = 4.3;
        s1.isIdCardValid = true;
        s1.studentId = "123";
        s1.semester = 2;

        s2.averageGrade = 3.4;
        s2.isIdCardValid = false;
        s2.semester = 4;
        s2.studentId = "11";

        s1.displayStatus();
        s2.displayStatus();
    }

}
