public class Smartphone {
    String name;
    String productionDate;
    String color;
    int androidVer;
    double screenDiagonal;

    void displayTechData(){
        System.out.println("Android version is "+androidVer+"and production date is"+productionDate);
    }
    void systemUpdate(){
        androidVer = androidVer + 1;
    }
    void displayLook(){
        System.out.println("Our new "+name+" has "+screenDiagonal+"display and it is in"+color+"color");
    }
}
