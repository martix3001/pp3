public class Person {
    String name;
    double weight;
    double h;
    double bmi;

    public Person(String name){
        this.name = name;
    }
    public Person(String name,double weight,double h){
        this.name = name;
        this.weight = weight;
        this.h = h;
    }

    void setWeightAndHeight(double weight, double h){
        this.weight = weight;
        this.h = h;
    }
    String calculateBMI(){
        double hi = h/100.00;
        double bmi = weight/(hi*hi);
        System.out.println(bmi);
        this.bmi = bmi;
        return (bmi < 18.5) ? "too low " : (bmi > 24.9) ? "too high" : "good";
    }
    String displayRecord(){
        return String.format("name: %s weights: %.2f is tall for %.2f and the BMI is %.2f",name,weight,h,bmi);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Kazior", 68.05, 208);
        //Person p2 = new Person("Kasia");

        //p1.setWeightAndHeight(66, 150);
        System.out.println(p1.calculateBMI());
        System.out.println(p1.displayRecord());
        
    }
}
