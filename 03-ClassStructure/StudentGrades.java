import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentGrades {

    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        //grades[i] = 2.0 + (generator.nextDouble() * 3.5);

        double[] randomgrades = new double[numberOfGrades];
        Random generator = new Random();

        double[] possiblegrades = {2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0, 5.5};

        for(int i=0; i < numberOfGrades; i++){
            int randomGr = generator.nextInt(7);
            randomgrades[i] = possiblegrades[randomGr];
        }
        this.grades = randomgrades;
    }
    StudentGrades(String name){
        this.studentName = name;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("number of grades:");
        int numberOfGrades = scanner.nextInt();
        double[] inputgrades = new double[numberOfGrades];

        System.out.println("grades:");

        for (int i = 0; i < numberOfGrades; i++) {
            inputgrades[i] = scanner.nextDouble();
           //2 scanner.nextLine();
        }
        scanner.close();
    }

    double lowestGrade(){
        double lowest = 6.0;
        for( double i : grades){
            if( i < lowest){
                lowest = i;
            }
        }
        return lowest;
    }
    double highestGrade(){
        double highest = 0.0;
        for( double i : grades){
            if( i > highest){
                highest = i;
            }
        }
        return highest;
    }
    int numberOfGrades(){
        int number = grades.length;
        return number;
    }
    double avgGrade(){
        double avg = 0;
        double sum = 0;
        for(double i : grades){
            sum += i;
        }
        avg = sum/numberOfGrades();
        avg = Math.round(avg * 100.0) / 100.0;
        return avg;
    }
    void displayStudentRecord(){
        double low = lowestGrade();
        double high = highestGrade();
        double avg = avgGrade();
        System.out.println(studentName +"'s grades are "+Arrays.toString(grades)+". The min and max are "+low+" "+high+".The avg is "+avg);
    }

    public static void main(String[] args) {
        double[] grades1 = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        StudentGrades s1 = new StudentGrades("Amanda", grades1);
        double[] grades2 = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades s2 = new StudentGrades("James", grades2);
        StudentGrades s3 = new StudentGrades("Kazio", 8);
        StudentGrades s4 = new StudentGrades("mmm");

        s1.displayStudentRecord();
        s2.displayStudentRecord();
        s3.displayStudentRecord();
    }

}
